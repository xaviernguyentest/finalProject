package Method.Cus;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import Based.Commons.BasedActions;

public class editCus_CusUpdateMsg extends BasedActions {
	WebDriver driverCusUpdateMsg;
	public editCus_CusUpdateMsg(WebDriver driver) {
		driverCusUpdateMsg= driver;
	}
public String getCustomerID(ExtentTest test) {
		
		return getData(driverCusUpdateMsg, Abs.Customer.CusEdit_CusUpdateMsg.CusID, test);
		
	}
	
	public void clickContinueBtn (ExtentTest test) {
		clickBtn(driverCusUpdateMsg, Abs.Customer.CusEdit_CusUpdateMsg.continueBtn, test);
	}
	
	public void clickHomeBtn (ExtentTest test) {
		clickBtn(driverCusUpdateMsg, Abs.Customer.CusEdit_CusUpdateMsg.homeBtn, test);
	}
}
