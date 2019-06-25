package Method.Acc;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import Based.Commons.BasedActions;

public class deleteAcc extends BasedActions{
	WebDriver driverDelAcc;
	public deleteAcc(WebDriver driver) {
		driverDelAcc = driver;
	}
	
	public void enterAccNo (String input, ExtentTest test) {
		inputText(driverDelAcc, Abs.Account.AccDel.accNo, input, test);
	}
	
	public void clickSubmit (ExtentTest test) {
		clickBtn(driverDelAcc, Abs.Account.AccDel.submitBtn, test);
	}
	
	public void clickReset (ExtentTest test) {
		clickBtn(driverDelAcc, Abs.Account.AccDel.resetBtn, test);
	}
	
	public void getDelAccTitle (ExtentTest test) {
		getData(driverDelAcc, Abs.Account.AccDel.formDelCusTitle, test);
	}
	
}
