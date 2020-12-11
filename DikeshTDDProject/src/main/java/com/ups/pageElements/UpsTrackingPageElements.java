package com.ups.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpsTrackingPageElements {

	WebDriver driver;
	
	public UpsTrackingPageElements(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement trackingBtn() {
		WebElement tracking = driver.findElement(By.xpath("//*[@id=\'ups-menuLinks1\']"));
		return tracking;
	}
	
	public WebElement trackPackageBtn() {
		WebElement trackPackage = driver.findElement(By.xpath("//*[@id=\"ups-menuPanel1\"]/div/div[1]/ul/li[1]/a"));
		return trackPackage;
	}
	
	public WebElement trackerbox() {
		WebElement tracker = driver.findElement(By.id("stApp_trackingNumber"));
		return tracker;
	}
	
	public WebElement trackbtn() {
		WebElement track = driver.findElement(By.id("stApp_btnTrack"));
		return track;
	}
	
	public WebElement tracErrorMsg() {
		WebElement trackingError = driver.findElement(By.id("stApp_error_alert_list0"));
		return trackingError;
	}
}
