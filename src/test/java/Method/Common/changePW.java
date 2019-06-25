package Method.Common;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import Based.Commons.BasedActions;

public class changePW extends BasedActions {
	WebDriver driverChangePW;
	public changePW(WebDriver driver) {
		driverChangePW = driver;
	}
	
	public void inputOldPW (String input, ExtentTest test) {
		inputText(driverChangePW, Abs.Common.ChangePW.oldPW, input, test);
	}
	
	public void inputNewPW (String input, ExtentTest test) {
		inputText(driverChangePW, Abs.Common.ChangePW.newPW, input, test);
	}
	
	public void inputConfNewPW (String input, ExtentTest test) {
		inputText(driverChangePW, Abs.Common.ChangePW.confirmNewPW, input, test);
	}
	
	public void clickSubmitChgPW (ExtentTest test) {
		clickBtn(driverChangePW, Abs.Common.ChangePW.submitBtn, test);
	}
	
	public void clickResetChgPW (ExtentTest test) {
		clickBtn(driverChangePW, Abs.Common.ChangePW.resetBtn, test);
	}
	
	public void getChgPWTitle (ExtentTest test) {
		getData(driverChangePW, Abs.Common.ChangePW.changePWTitle, test);
	}
	
}
