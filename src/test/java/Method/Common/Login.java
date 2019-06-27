package Method.Common;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import Based.Commons.BasedActions;


public class Login extends BasedActions {
	WebDriver driverLogIn;
	public Login(WebDriver driver) {
		driverLogIn = driver;
	}
	
	public void inputUID (String input, ExtentTest test) {
		inputText(driverLogIn, Abs.Common.Login.baseUrl, input, test);;
	}
	
	public void inputPass (String input, ExtentTest test) {
		inputText(driverLogIn, Abs.Common.Login.pass, input, test);;
	}
	
	public HomepageAction clickLogin (ExtentTest test) {
		clickBtn(driverlocal, LoginInterFace.loginBtn, test);
		return ManageDriver.manageHomePage(driverlocal);
	}
	
	public InputEmailActions clickHere (ExtentTest test) {
		clickBtn(driverlocal, LoginInterFace.linkHere, test);
		return ManageDriver.manageInputEmailPage(driverlocal);
	}

	public void cancelAlert() {
		closeAlert(driverlocal);
	}
	
	public void assertText() {
		String abc = alertText(driverlocal);
		Boolean result = abc.equals("User or Password is not valid");
		if (result == true) {
			System.out.println("Alert match");
		} else {
			System.out.println("Alert mismatch");
		}
	}
	
	public void verifyEle() {
		if (isAlertPresent(driverlocal) == true) {
			System.out.println("User or Password is not valid");
		}else {
			System.out.println("Error, Alert doesn't show");
		}
	}

	public void openPage(ExtentTest test) {
		OpenURL(driverlocal, LoginInterFace.baseUrl, test);
	}
	
	
}
