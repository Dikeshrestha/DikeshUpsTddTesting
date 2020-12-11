package com.ups.pageActions;

import org.openqa.selenium.WebDriver;

import com.ups.pageElements.UpsShippingPageElements;

public class UpsShippingPageActions {

	UpsShippingPageElements shippingPage;
	
	public UpsShippingPageActions(WebDriver driver) {
		
		this.shippingPage = new UpsShippingPageElements(driver);
	}
	
	public void handlecookie() {
		shippingPage.CookieBtn().click();
	}

	public void clickShippingBtn() {
		shippingPage.shipmentButton().click();;
	}
	
	public void clickCreateShipping() {
		shippingPage.createShipping().click();
	}
	
	public void enterName() {
		shippingPage.name().sendKeys("Dikesh");
	}
	
	public void enterContact() {
		shippingPage.contactName().sendKeys("Dikesh Shrestha");
	}
	
	public void enterAddress() {
		shippingPage.address().sendKeys("New York");
	}
	
	public void enterzipcode() {
		shippingPage.address().sendKeys("16735");
	}
	
	public void entercity() {
		shippingPage.address().sendKeys("Los Angeles");
	}

	public void enterEmail() {
		shippingPage.email().sendKeys("Dikesh@gmail.com");
	}
	
	public void enterPhone() {
		shippingPage.phone().sendKeys("1234561789");
	}
	
	public void clickContinue() {
		shippingPage.continueBtn().click();
	}
	
	public String errorMessage() {
	String msg;
	return msg = shippingPage.errorMessage().getText();
		
}
	
}


