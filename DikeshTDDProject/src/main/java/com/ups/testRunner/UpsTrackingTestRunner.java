package com.ups.testRunner;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ups.drivers.UpsDrivers;
import com.ups.pageActions.UpsTrackingPageActions;

public class UpsTrackingTestRunner extends UpsDrivers {
	WebDriver driver;
	UpsTrackingPageActions trackingPage;

	@BeforeMethod(alwaysRun = true)
	@Parameters(value = { "browser" })
	void driverInitialize(String browser) {
		if (browser.equalsIgnoreCase("ChromeBrowser")) {
			this.driver = getChromeDriver();
		} else if (browser.equalsIgnoreCase("FireforxDriver")) {
			this.driver = getFirefoxDriver();
		}
		this.trackingPage = new UpsTrackingPageActions(driver);
		driver.get("https://www.ups.com/us/en/Home.page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test // (groups = { "SanityTest" }, priority = 1 )
	void shipping() throws InterruptedException {
		Thread.sleep(5000);
		trackingPage.clickTrackingBtn();
		// Thread.sleep(5000);
		trackingPage.clicktrackPackageBtn();
		trackingPage.entertrackerbox();
		trackingPage.clicktrackbtn();
		Thread.sleep(10000);
		trackingPage.gettrackErrorMsg();
		String trackingerrorMsg = trackingPage.gettrackErrorMsg();

		if (trackingerrorMsg.contains("could not locate")) {
			System.out.println("PASSED");
		} else {
			fail();
		}
	}

	@AfterMethod
	void afterMethod() {
		driver.close();
	}

}
