package Method.Acc;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import Based.Commons.BasedActions;

public class editAcc extends BasedActions{
	WebDriver driverEditAcc;
	public editAcc(WebDriver driver) {
		driverEditAcc = driver;
	}
	
	public void enterAccNo (String input, ExtentTest test) {
		inputText(driverEditAcc, Abs.Account.AccEdit.accNo, input, test);
	}
	
	public void clickSubmit (ExtentTest test) {
		clickBtn(driverEditAcc, Abs.Account.AccEdit.submitBtn, test);
	}
	
	public void clickReset (ExtentTest test) {
		clickBtn(driverEditAcc, Abs.Account.AccEdit.resetBtn, test);
	}
	
	public void getEditAccTitle (ExtentTest test) {
		getData(driverEditAcc, Abs.Account.AccEdit.formEditCusTitle, test);
	}
	
}
