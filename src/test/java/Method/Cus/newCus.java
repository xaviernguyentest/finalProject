package Method.Cus;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import Based.Commons.BasedActions;

public class newCus extends BasedActions {
	WebDriver driverNewCus;
	public newCus(WebDriver driver) {
		driverNewCus= driver;
	}
	
	public void inputCusName (String input, ExtentTest test) {
		inputText(driverNewCus, Abs.Customer.CusNew.CusName, input, test);
	}
	
	public void selectGender() {
		clickRadioBtn(driverNewCus,Abs.Customer.CusNew.Gender_FMale );
	}
	
	public void inputDOB (String input, ExtentTest test) {
		inputText(driverNewCus, Abs.Customer.CusNew.DOB, input, test);
	}
	
	public void inputAddress (String input, ExtentTest test) {
		inputText(driverNewCus, Abs.Customer.CusNew.Address, input, test);
	}
	
	public void inputCity(String input, ExtentTest test) {
		inputText(driverNewCus, Abs.Customer.CusNew.City, input, test);
	}
	
	public void inputState(String input, ExtentTest test) {
		inputText(driverNewCus, Abs.Customer.CusNew.State, input, test);
	}
	
	public void inputPIN(String input, ExtentTest test) {
		inputText(driverNewCus, Abs.Customer.CusNew.PIN, input, test);
	}
	
	public void inputMobile(String input, ExtentTest test) {
		inputText(driverNewCus, Abs.Customer.CusNew.Mobile_Number, input, test);
	}
	
	public void inputEmail(String input, ExtentTest test) {
		inputText(driverNewCus, Abs.Customer.CusNew.Email, input, test);
	}
	
	public void inputPassword(String input, ExtentTest test) {
		inputText(driverNewCus, Abs.Customer.CusNew.Password, input, test);
	}
	
	public void clickResetNewCus(ExtentTest test) {
		clickBtn(driverNewCus, Abs.Customer.CusNew.resetBtn, test);
	}
	
	public void clickSubmitNewCus (ExtentTest test) {
		clickBtn(driverNewCus, Abs.Customer.CusNew.submitBtn, test);
	}
	
	public void verifyNavigateToCusRegMsg (String exResult, ExtentTest test) {
		String actResult = getTitle(driverNewCus);
		verifyTestResult(actResult, exResult);
	}
	

}
