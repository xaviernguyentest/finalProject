package Method.Acc;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import Based.Commons.BasedActions;

public class newAcc extends BasedActions{
	WebDriver driverNewAcc;
	public newAcc(WebDriver driver) {
		driverNewAcc = driver;
	}
	
	public void inputCusID (String input, ExtentTest test) {
		inputText(driverNewAcc, Abs.Account.AccNew.cusID, input, test);
	}
	
	public void inputInitDep (String input, ExtentTest test) {
		inputText(driverNewAcc, Abs.Account.AccNew.initDep, input, test);
	}
	
	public void selectAccType (String value, ExtentTest test) {
		selectValue(driverNewAcc, Abs.Account.AccNew.accType, value, test);
	}
	
	public void clickSubmitNewAcc (ExtentTest test) {
		clickBtn(driverNewAcc, Abs.Account.AccNew.submitBtn, test);
	}
	
	public void clickResetNewAcc (ExtentTest test) {
		clickBtn(driverNewAcc, Abs.Account.AccNew.resetBtn, test);
	}
	
	public void getNewAccTitle (ExtentTest test) {
		getData(driverNewAcc, Abs.Account.AccNew.formNewCusTitle, test);
	}
	
}
