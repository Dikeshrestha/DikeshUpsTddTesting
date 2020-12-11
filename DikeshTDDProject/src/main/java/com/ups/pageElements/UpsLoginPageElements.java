package com.ups.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpsLoginPageElements {
WebDriver driver;

public UpsLoginPageElements(WebDriver driver) {
	this.driver=driver;
}

public WebElement cookieBanner() {
	WebElement cookie = driver.findElement(By.className("close_btn_thick"));
	return cookie;
}

public WebElement signuploginBtn() {
	//WebElement Btn = driver.findElement(By.linkText("Sign up / Log in"));
	WebElement Btn = driver.findElement(By.linkText("Sign up / Log in"));
	return Btn;
}

public WebElement userId() {
	WebElement Id = driver.findElement(By.id("email"));
	return Id;
}

public WebElement password() {
	WebElement password = driver.findElement(By.name("password"));
	return password;
}

public WebElement login() {
	WebElement loginbtn = driver.findElement(By.id("submitBtn"));
	return loginbtn;
}

public WebElement loginErrorMsg() {
	WebElement errorMsg = driver.findElement(By.id("errorMessages"));
	return errorMsg;
}

public WebElement forgotIDPasslink() {
	WebElement link = driver.findElement(By.xpath("//a[@class='ups-link ups-forgetPass']"));
	return link;
}



}
