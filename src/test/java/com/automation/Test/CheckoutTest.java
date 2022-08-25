package com.automation.Test;

import org.testng.annotations.Test;

import com.automation.Pages.CheckoutPage;

public class CheckoutTest extends BaseTest {
	@Test

	public void VerifyCheckout() throws InterruptedException {
		//DriverUtils.getDriver().get("https://www.bigbasket.com/");
		//LoginTest lt= new LoginTest();
		//lt.VerifysuccessfulLogin();
		Add2CartTest ad = new Add2CartTest();
		ad.VerifyAdd2Cart();
		CheckoutPage cp = new CheckoutPage();
		Thread.sleep(3000);
		cp.clickCheckout();
		System.out.println("clickCheckout()");
		Thread.sleep(10000);
		cp.clickAdd();
		Thread.sleep(7000);
		cp.clickPPay();
		Thread.sleep(5000);
		cp.switchFrame();
		cp.enterCardNo("8001432397805555");
		cp.enterCardVal("12/25");
		cp.enterCardCVV("555");
		//cp.clickPlaceOrder();

	}
}
