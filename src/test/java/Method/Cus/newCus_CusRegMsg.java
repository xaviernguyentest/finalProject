package Method.Cus;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import Based.Commons.BasedActions;

public class newCus_CusRegMsg extends BasedActions{
	WebDriver driverCusRegMsg;
	public newCus_CusRegMsg(WebDriver driver) {
		driverCusRegMsg= driver;
	}
	public String getCustomerID(ExtentTest test) {
		
		return getData(driverCusRegMsg, Abs.Customer.CusNew_CusRegMsg.CusID, test);
		
	}
	
	public void clickContinueBtn (ExtentTest test) {
		clickBtn(driverCusRegMsg, Abs.Customer.CusNew_CusRegMsg.continueBtn, test);
	}
	
	public void clickHomeBtn (ExtentTest test) {
		clickBtn(driverCusRegMsg, Abs.Customer.CusNew_CusRegMsg.homeBtn, test);
	}
}
