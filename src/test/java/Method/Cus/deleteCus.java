package Method.Cus;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import Based.Commons.BasedActions;

public class deleteCus extends BasedActions{
	WebDriver driverDelteCus;
	public deleteCus(WebDriver driver) {
		driverDelteCus= driver;
	}
	
	public void inputCusID (String input, ExtentTest test) {
		inputText(driverDelteCus, Abs.Customer.CusDel.CusID, input, test);
	}
	
	public void clickResetDelCus(ExtentTest test) {
		clickBtn(driverDelteCus, Abs.Customer.CusDel.resetBtn, test);
	}
	
	public void clickSubmitDelCus (ExtentTest test) {
		clickBtn(driverDelteCus, Abs.Customer.CusDel.submitBtn, test);
	}
	
	public void clickOnArrgeBtn () {
		closeAlert(driverDelteCus) ;
	}
	
	public void closepopup () {
		closeAlert(driverDelteCus) ;
	}
}
