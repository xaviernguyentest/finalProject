package Based.Commons;

import org.openqa.selenium.WebDriver;

import Method.Acc.*;
import Method.Cus.*;
import Method.Common.*;
import Method.PayFunc.*;


public class MngDriver {
	public static editAcc editAcc;
	public static newAcc newAcc;
	public static deleteAcc delAcc;
	public static newCus newCus;
	public static editCus editCus;
	public static deleteCus delCus;
	public static changePW changePW;
	public static mainMenu MM;
	public static balEnq balEnq;
	public static deposit deposit;
	public static fundTrans fTrans;
	public static stCustom stCustom;
	public static stMini stMini;
	public static withdrawal withdraw;
	
	public static newAcc mngnewAccPage(WebDriver driver) {
		if (newAcc == null) {
			newAcc = new newAcc(driver);
		}
		return newAcc;
	}
	
	public static editAcc mngeditAccPage(WebDriver driver) {
		if (editAcc == null) {
			editAcc = new editAcc(driver);
		}
		return editAcc;
	}
	
	public static deleteAcc mngdelAccPage(WebDriver driver) {
		if (delAcc == null) {
			delAcc = new deleteAcc(driver);
		}
		return delAcc;
	}
	
	public static changePW mngchangePWPage(WebDriver driver) {
		if (changePW == null) {
			changePW = new changePW(driver);
		}
		return changePW;
	}
	
	public static mainMenu mngMMPage(WebDriver driver) {
		if (MM == null) {
			MM = new mainMenu(driver);
		}
		return MM;
	}
	
}
