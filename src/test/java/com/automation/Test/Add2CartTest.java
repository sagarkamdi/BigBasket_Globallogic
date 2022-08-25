package com.automation.Test;

import org.testng.annotations.Test;
import com.automation.GenericUtils.DriverUtils;
import com.automation.Pages.Add2CartPage;
import com.automation.Pages.LoginPage;

public class Add2CartTest extends BaseTest {
	

	
	@Test

	public void VerifyAdd2Cart() throws InterruptedException {
		//DriverUtils.getDriver().get("https://www.bigbasket.com/");
		//LoginTest lt = new LoginTest();
		//lt.VerifysuccessfulLogin();
		DriverUtils.getDriver().get("https://www.bigbasket.com/");
		LoginPage lp=new LoginPage();
		lp.clickSignin();
		lp.enterUsernme("8208292270");
		lp.clickCont();
		Thread.sleep(20000);
		lp.clickLogin();
		Thread.sleep(3000);
		Add2CartPage up = new Add2CartPage();
		up.Search("Edible Oil");
		up.clickSearch();
		up.clickItem();
		Thread.sleep(3000);
		up.clickAddTC();
		Thread.sleep(3000);
		up.profile();
		
		

	}
}
