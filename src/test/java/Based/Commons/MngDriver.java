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
	public static homePage home;
	
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
	
	public static balEnq mngBalEnqPage(WebDriver driver) {
		if (balEnq == null) {
			balEnq = new balEnq(driver);
		}
		return balEnq;
	}
	
	public static deposit mngDepPage(WebDriver driver) {
		if (deposit == null) {
			deposit = new deposit(driver);
		}
		return deposit;
	}
	
	public static fundTrans  mngFTransPage(WebDriver driver) {
		if (fTrans == null) {
			fTrans = new fundTrans(driver);
		}
		return fTrans;
	}
	
	public static stCustom mngStCustomPage(WebDriver driver) {
		if (stCustom == null) {
			stCustom = new stCustom(driver);
		}
		return stCustom;
	}
	
	public static stMini mngStMiniPage(WebDriver driver) {
		if ( stMini == null) {
			 stMini = new stMini(driver);
		}
		return  stMini;
	}
	
	public static withdrawal  mngWDrawPage(WebDriver driver) {
		if (withdraw == null) {
			withdraw = new withdrawal(driver);
		}
		return withdraw;
	}
	public static homePage  mngHomePage(WebDriver driver) {
		if (home == null) {
			home = new homePage(driver);
		}
		return home;
	}
	
}
