package com.ups.testRunner;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ups.drivers.UpsDrivers;
import com.ups.pageActions.UpsShippingPageActions;

public class UpsShippingTestRunner extends UpsDrivers {

	WebDriver driver;
	UpsShippingPageActions shippingTest;
	
	@BeforeMethod(alwaysRun = true)
	@Parameters(value= {"browser"})
	void driverInitialize(String browser) {
		if(browser.equalsIgnoreCase("ChromeBrowser"))
		{
		this.driver=getChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FireforxDriver")) {
		this.driver=getFirefoxDriver();
		}
		this.shippingTest = new UpsShippingPageActions(driver);
		driver.get("https://www.ups.com/us/en/Home.page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	@Test //(groups = { "SanityTest" }, priority = 1 )
	void shipping() throws InterruptedException {
		Thread.sleep(5000);
		shippingTest.clickShippingBtn();
		//Thread.sleep(5000);
		shippingTest. clickCreateShipping();
		shippingTest.handlecookie();
		shippingTest.enterName();
		shippingTest.enterContact();
		shippingTest.enterAddress();
		shippingTest.enterzipcode();
		shippingTest.entercity();
		shippingTest.enterEmail();
		shippingTest.enterPhone();
		shippingTest.clickContinue();
		Thread.sleep(10000);
//		String errorMsg = shippingTest.errorMessage();
//
//		if (errorMsg.contains("required")) {
//			System.out.println("PASSED");
//		} else {
//			fail();
//		}
	}
	
	

@AfterMethod
void afterMethod() { 
	driver.close(); }
	 
}