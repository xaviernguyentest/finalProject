package Method.Cus;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import Based.Commons.BasedActions;

public class editCus extends BasedActions{
	WebDriver driverEditCus;
	public editCus(WebDriver driver) {
		driverEditCus= driver;
	}
	
	public void inputCusID (String input, ExtentTest test) {
		inputText(driverEditCus, Abs.Customer.CusEdit.CusID, input, test);
	}
	
	public void clickResetEditCus(ExtentTest test) {
		clickBtn(driverEditCus, Abs.Customer.CusEdit.resetBtn, test);
	}
	
	public void clickSubmitEditCus (ExtentTest test) {
		clickBtn(driverEditCus, Abs.Customer.CusEdit.submitBtn, test);
	}
	
	
	
}
