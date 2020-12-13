package com.ups.testRunner;

import static org.testng.Assert.fail;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.ups.drivers.UpsDrivers;
import com.ups.pageActions.UpsLoginPageActions;

public class UpsLoginTestRunner extends UpsDrivers {
	WebDriver driver;
	UpsLoginPageActions loginTest;

	@BeforeMethod(alwaysRun = true)
	@Parameters(value = { "browser" })
	void driverInitialize(String browser) {
		if (browser.equalsIgnoreCase("ChromeBrowser")) {
			this.driver = getChromeDriver();
		} else if (browser.equalsIgnoreCase("FirefoxDriver")) {
			this.driver = getFirefoxDriver();
		}
		this.loginTest = new UpsLoginPageActions(driver);
		driver.get("https://www.ups.com/us/en/Home.page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test(groups = { "SanityTest" }, priority = 1)
	void login() throws InterruptedException {
		Thread.sleep(1000);
		loginTest.clickcookieBanner();
		loginTest.clicksignuploginBtn();
		Thread.sleep(1000);
//
		loginTest.enterUserId(); // Thread.sleep(5000);
		loginTest.enterPassword();
		loginTest.clickLogin();

		Thread.sleep(5000);
		Boolean errorMsg;
		errorMsg = loginTest.getloginErrorMsg();

		if (errorMsg = true) {
			System.out.println("PASSED");
		} else {
			fail();
		}
	}

	@Test(groups = { "Regression" }, priority = 2)
	void forgotlogin() throws InterruptedException {

		loginTest.clickcookieBanner();
		Thread.sleep(1000);
		// loginTest.clicksignuploginBtn()
		loginTest.clickforgotIDPasslink();
		Thread.sleep(1000);

		String expectedPageTitle = "Reset or Recover Login Settings | UPS - United States";
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle, expectedPageTitle);

	}

	@AfterMethod(alwaysRun = true)
	void afterMethod() {
		driver.close();
	}

}
