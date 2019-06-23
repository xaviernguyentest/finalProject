package Based_Commons;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentBDDReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasedTest {
	public static WebDriver driver;
    public static ExtentHtmlReporter htmlReporter; 
    public static ExtentBDDReporter bddReporter;    
    public static ExtentReports extent;
    public static ExtentTest test;
    
	
	@Parameters({"browser"})
	@BeforeTest
	public void openBrowser(String browser) {
		
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/my_report/Automation"+browser+".html"); 
		
		String path="my_report";    
		File file = new File(path);
		if (!file.exists()) {
            System.out.print("No Folder");
            file.mkdir();
            System.out.print("Folder created");
        }
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter); //save data len html report
		htmlReporter.config().setTheme(Theme.DARK);
		
		
		switch (browser) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
//			ChromeOptions opt = new ChromeOptions();
//			opt.addArguments("headless");
			driver = new ChromeDriver();
			
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			break;
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void getResult(ITestResult result) throws Exception
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));

			//To capture screenshot path and store the path of the screenshot in the string "screenshotPath"
			//We do pass the path captured by this method in to the extent reports using "logger.addScreenCapture" method. 
			//	String Scrnshot=TakeScreenshot.captuerScreenshot(driver,"TestCaseFailed");
			//To add it in the extent report 
			//test.fail("").addScreenCaptureFromPath(TakeScreenshot()); chup hinh o buoc cuoi
			//chup hinh trong step
			//test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath(TakeScreenshot()).build());

		}
		else if(result.getStatus() == ITestResult.SKIP){
			//logger.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE)); 
		} 
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
			//test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(TakeScreenshot()).build());
		}
		
	}
	
	
	@AfterClass
	public void saveReport() {
		extent.flush();
	}
	
	@AfterTest
	public void cleanUp() throws IOException {
		//driver.quit();
		String cmd = "taskkill /F /IM chromedriver.exe";
		if (System.getProperty("os.name").contains("Win")) {
			Runtime.getRuntime().exec(cmd);
		}
	}
	
	//Chup hinh khi ket thuc TC
	/*public static String TakeScreenshot() throws IOException {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		//copy fire src vafo my_report voi ten scr_xxx
		// after execution, you could see a folder "FailedTestsScreenshots" under src folder
		String destination = System.getProperty("user.dir") + File.separator + "my_report" + File.separator + "scr_" + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		System.out.println("b: " + destination);
		return destination;
	}*/
	
	
}
