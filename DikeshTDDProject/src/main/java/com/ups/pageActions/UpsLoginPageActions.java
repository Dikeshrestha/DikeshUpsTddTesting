package com.ups.pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ups.pageElements.UpsLoginPageElements;

public class UpsLoginPageActions {

WebDriver driver;
UpsLoginPageElements loginPage;

public UpsLoginPageActions(WebDriver driver) {
	this.loginPage = new UpsLoginPageElements(driver);
}

public void clickcookieBanner() {
	loginPage.cookieBanner().click();
}


public void clicksignuploginBtn() {
	loginPage.signuploginBtn().click();
}

public void enterUserId() {
	loginPage.userId().sendKeys("dikesh.shrestha@gmail.com");
}

public void enterPassword() {
	loginPage.password().sendKeys("Abc12854");
}

public void clickLogin() {
	loginPage.login().click();
}

public boolean getloginErrorMsg() {
	WebElement ErrorMsg = loginPage.loginErrorMsg();
	boolean Error = true;
	return Error;
	
}

public void clickforgotIDPasslink() {
	loginPage.forgotIDPasslink().click();
}


}
