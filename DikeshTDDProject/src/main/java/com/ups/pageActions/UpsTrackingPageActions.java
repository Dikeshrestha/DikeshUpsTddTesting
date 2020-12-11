package com.ups.pageActions;

import org.openqa.selenium.WebDriver;

import com.ups.pageElements.UpsTrackingPageElements;

public class UpsTrackingPageActions {
WebDriver driver;
UpsTrackingPageElements trackingPage;

public UpsTrackingPageActions(WebDriver driver) {
	this.trackingPage=new UpsTrackingPageElements(driver);
}

public void clickTrackingBtn() {
	trackingPage.trackingBtn().click();
}

public void clicktrackPackageBtn() {
	trackingPage.trackPackageBtn().click();
}
public void entertrackerbox() {
	trackingPage.trackerbox().sendKeys("123145679");
}

public void clicktrackbtn() {
	trackingPage.trackbtn().click();
}

public String gettrackErrorMsg() {
	String trackingerrormsg = trackingPage.tracErrorMsg().getText();
	return trackingerrormsg;
}
}
