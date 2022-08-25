package com.automation.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.automation.GenericUtils.DriverUtils;
import com.automation.Pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@BeforeMethod
	public void VerifyPreRequisite()throws InterruptedException {
		DriverUtils.getDriver().get("https://www.bigbasket.com/");
	}

	@Test

	public void VerifysuccessfulLogin() throws InterruptedException {
		//DriverUtils.getDriver().get("https://www.bigbasket.com/");
		LoginPage lp = new LoginPage();
		Thread.sleep(2000);
		lp.clickSignin();
		lp.enterUsernme("8208292270");
		lp.clickCont();
		Thread.sleep(15000);
		lp.clickLogin();

	}
}
