package com.ups.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpsShippingPageElements {

	WebDriver driver;

	public UpsShippingPageElements(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement CookieBtn() {
		WebElement cookie = driver.findElement(By.className("close_btn_thick"));
		return cookie;
	}

	public WebElement shipmentButton() {
		WebElement dropdown = driver.findElement(By.xpath("//a[@id='ups-menuLinks2']"));
		return dropdown;
	}

	public WebElement createShipping() {
		WebElement createshipping = driver.findElement(By.xpath("//*[@id=\"ups-menuPanel2\"]/div/div[1]/ul/li[1]/a"));
		return createshipping;
	}

	/*
	 * public WebElement selectCountry() { WebElement selectCountry =
	 * driver.findElement(By.id("origin-cac_country")); return selectCountry; }
	 */

	public WebElement name() {
		WebElement name = driver.findElement(By.id("origin-cac_companyOrName"));
		return name;
	}

	public WebElement contactName() {
		WebElement contact = driver.findElement(By.id("origin-cac_contactName"));
		return contact;
	}

	public WebElement address() {
		WebElement address = driver.findElement(By.id("origin-cac_singleLineAddress"));
		return address;
	}
	
	public WebElement zipCode() {
		WebElement address = driver.findElement(By.id("origin-cac_postalCode"));
		return address;
	}

	public WebElement city() {
		WebElement address = driver.findElement(By.id("origin-cac_city"));
		return address;
	}
	
	public WebElement email() {
		WebElement email = driver.findElement(By.id("origin-cac_email"));
		return email;
	}

	public WebElement phone() {
		WebElement phone = driver.findElement(By.id("origin-cac_phone"));
		return phone;
	}

	public WebElement continueBtn() {
		WebElement btn = driver.findElement(By.id("nbsBackForwardNavigationContinueButton"));
		return btn;
	}
	
	public WebElement errorMessage() {
		WebElement msg = driver.findElement(By.className("ups-icons-error ng-star-inserted"));
		return msg;
	}
}
