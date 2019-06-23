package Based_Commons;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class BasedActions {
	public void enterText(WebDriver driver, String xpath, String input, ExtentTest test) {
		WebElement ele = driver.findElement(By.xpath(xpath));
		ele.clear();
		ele.sendKeys(input);
		try {
			test.log(Status.INFO, "", MediaEntityBuilder.createScreenCaptureFromPath(TakeScreenshot(driver)).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	public void clickBtn(WebDriver driver, String xpath, ExtentTest test) {
		WebElement ele = driver.findElement(By.xpath(xpath));
		
		try {
			test.log(Status.INFO, "", MediaEntityBuilder.createScreenCaptureFromPath(TakeScreenshot(driver)).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ele.click();
}
	public String getData(WebDriver driver, String xpath, ExtentTest test) {
		WebElement ele = driver.findElement(By.xpath(xpath));
		try {
			test.log(Status.INFO, "", MediaEntityBuilder.createScreenCaptureFromPath(TakeScreenshot(driver)).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ele.getText();
		
	}
	
	public void closeAlert(WebDriver driver) {
		Alert myalert = driver.switchTo().alert();
		myalert.dismiss();	
	}
	
	public String alertText(WebDriver driver) {
		Alert text = driver.switchTo().alert();
		return text.getText();
	}
	
	public boolean isAlertPresent(WebDriver driver){
	    try{
	        driver.switchTo().alert();
	        return true;
	    }catch (NoAlertPresentException e){
	        return false;
	    }
	}
	
	public boolean isControlDisplayed (WebDriver driver, String xpath, ExtentTest test ) {
		WebElement ele = driver.findElement(By.xpath(xpath));
		try {
			test.log(Status.INFO, "", MediaEntityBuilder.createScreenCaptureFromPath(TakeScreenshot(driver)).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ele.isDisplayed();
		
	}
		
	public void OpenURL(WebDriver driver, String URL, ExtentTest test) {
		driver.get(URL); 
		try {
			test.log(Status.INFO, "", MediaEntityBuilder.createScreenCaptureFromPath(TakeScreenshot(driver)).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String TakeScreenshot(WebDriver driver) throws IOException {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + File.separator +  "my_report" + File.separator + "scr_" + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
//		System.out.println("a: " + destination);
//		return destination;
		return "scr_" + dateName + ".png";
	}
	
	public void presenceOfElement(WebDriver driver, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
		
	}
	
	public void fluentWait (WebDriver driver, String xpath) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMillis(10000)) //timeout = 10s
				.pollingEvery(Duration.ofMillis(1000))  //tan suat kiem tra : 1s ktra 1 lan
				.ignoring(NoSuchElementException.class); //skip loi tim ko thay ele
				
		 wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath(xpath));
			}
		});
		
	}
	
}