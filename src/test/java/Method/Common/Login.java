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
		inputText(driverLogIn, Abs.Common.Login.userID, input, test);;
	}
	
	public void inputPass (String input, ExtentTest test) {
		inputText(driverLogIn, Abs.Common.Login.pass, input, test);;
	}
	
	public void clickLogin (ExtentTest test) {
		clickBtn(driverLogIn, Abs.Common.Login.loginBtn, test);
	}

	public void openPage(ExtentTest test) {
		OpenURL(driverLogIn, Abs.Common.Login.baseUrl, test);
	}
	
	
}
