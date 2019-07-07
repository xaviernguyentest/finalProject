package Method.Cus;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import Based.Commons.BasedActions;

public class editCus_editCustomerPage extends BasedActions{
	WebDriver driverEditCustomerPage;
	public editCus_editCustomerPage(WebDriver driver) {
		driverEditCustomerPage= driver;
	}
	public void editCusName (String input, ExtentTest test) {
		inputText(driverEditCustomerPage, Abs.Customer.CusEdit_editCustomerPage.CusName, input, test);
	}
	
	public void selectGender() {
		clickRadioBtn(driverEditCustomerPage,Abs.Customer.CusEdit_editCustomerPage.Gender_FMale );
	}
	
	public void editDOB (String input, ExtentTest test) {
		inputText(driverEditCustomerPage, Abs.Customer.CusEdit_editCustomerPage.DOB, input, test);
	}
	
	public void editAddress (String input, ExtentTest test) {
		inputText(driverEditCustomerPage, Abs.Customer.CusEdit_editCustomerPage.Address, input, test);
	}
	
	public void editCity(String input, ExtentTest test) {
		inputText(driverEditCustomerPage, Abs.Customer.CusEdit_editCustomerPage.City, input, test);
	}
	
	public void editState(String input, ExtentTest test) {
		inputText(driverEditCustomerPage, Abs.Customer.CusEdit_editCustomerPage.State, input, test);
	}
	
	public void editPIN(String input, ExtentTest test) {
		inputText(driverEditCustomerPage, Abs.Customer.CusEdit_editCustomerPage.PIN, input, test);
	}
	
	public void editMobile(String input, ExtentTest test) {
		inputText(driverEditCustomerPage, Abs.Customer.CusEdit_editCustomerPage.Mobile_Number, input, test);
	}
	
	public void editEmail(String input, ExtentTest test) {
		inputText(driverEditCustomerPage, Abs.Customer.CusEdit_editCustomerPage.Email, input, test);
	}
	
	public void editPassword(String input, ExtentTest test) {
		inputText(driverEditCustomerPage, Abs.Customer.CusEdit_editCustomerPage.Password, input, test);
	}
	
	public void clickResetEditCusPage(ExtentTest test) {
		clickBtn(driverEditCustomerPage, Abs.Customer.CusEdit_editCustomerPage.resetBtn, test);
	}
	
	public void clickSubmitEditCusPage (ExtentTest test) {
		clickBtn(driverEditCustomerPage, Abs.Customer.CusEdit_editCustomerPage.submitBtn, test);
	}
	
}
