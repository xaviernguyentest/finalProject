package Method.Common;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import Based.Commons.BasedActions;

public class mainMenu extends BasedActions {
	WebDriver driverMM;
	public mainMenu(WebDriver driver) {
		driverMM = driver;
	}
	
	public void clickNewCus (ExtentTest test) {
		clickBtn(driverMM, Abs.Common.MainMenu.newCusLinktext, test);
	}
	
	public void clickEditCus (ExtentTest test) {
		clickBtn(driverMM, Abs.Common.MainMenu.editCusLinktext, test);
	}
	
	public void clickDelCus (ExtentTest test) {
		clickBtn(driverMM, Abs.Common.MainMenu.delCusLinktext, test);
	}
	
	public void clickNewAcc (ExtentTest test) {
		clickBtn(driverMM, Abs.Common.MainMenu.newAccLinktext, test);
	}
	
	public void clickEditAcc (ExtentTest test) {
		clickBtn(driverMM, Abs.Common.MainMenu.editAccLinktext, test);
	}
	
	public void clickDelAcc (ExtentTest test) {
		clickBtn(driverMM, Abs.Common.MainMenu.delAccLinktext, test);
	}
	
	public void clickBalEnq (ExtentTest test) {
		clickBtn(driverMM, Abs.Common.MainMenu.BalEnqLinktext, test);
	}
	
	public void clickDep (ExtentTest test) {
		clickBtn(driverMM, Abs.Common.MainMenu.depositLinktext, test);
	}
	
	public void clickFunTrans (ExtentTest test) {
		clickBtn(driverMM, Abs.Common.MainMenu.fundTransLinktext, test);
	}
	
	public void clickStCustom (ExtentTest test) {
		clickBtn(driverMM, Abs.Common.MainMenu.stateCustomLinktext, test);
	}
	
	public void clickMiniSt (ExtentTest test) {
		clickBtn(driverMM, Abs.Common.MainMenu.miniStateLinktext, test);
	}
	
	public void clickWdraw (ExtentTest test) {
		clickBtn(driverMM, Abs.Common.MainMenu.wdrawLinktext, test);
	}
	
	public void clickLogOut (ExtentTest test) {
		clickBtn(driverMM, Abs.Common.MainMenu.logoutLinktext, test);
	}
}
