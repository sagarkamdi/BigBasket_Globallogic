package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

	// declaration
	
	@FindBy(xpath = "//a[@qa='prodName']")
	private WebElement cartItems;

	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement clkCheck;
	
	@FindBy(xpath = "//a[@qa='deliverHereCKO']")
	private WebElement deliveryadd;
	
	@FindBy(xpath = "//button[@ng-click='handleCartContinue()']")
	private WebElement clkConfirm;

	@FindBy(xpath = "//button[@qa='confirmSlotBtn']")
	private WebElement pPay;
	
	@FindBy(xpath = "//iframe[@id='juspay_iframe']")
	private WebElement frame;

	@FindBy(xpath = "//input[@placeholder='Enter card number']")
	private WebElement addCardNo;

	@FindBy(xpath = "//input[@placeholder='MM / YY']")
	private WebElement addCardVal;

	@FindBy(xpath = "//input[@placeholder='Security code']")
	private WebElement addCvv;

	@FindBy(partialLinkText  =  "Place order &")
	private WebElement placeOrd;

	// utilization

	
	
	

	public void clickCheckout() {
		System.out.println("Products in cart-\n"+cartItems.getText());
		clkCheck.click();
	}
	
	public void clickAdd() throws InterruptedException {
		deliveryadd.click();
		Thread.sleep(2000);
		clkConfirm.click();
	}

	public void clickPPay() {
		pPay.click();
	}
	
	public void switchFrame() {
		driver.switchTo().frame(frame);
	}

	public void enterCardNo(String str) {
		addCardNo.sendKeys(str);
	}

	public void enterCardVal(String str) {
		addCardVal.sendKeys(str);
	}

	public void enterCardCVV(String str) {
		addCvv.sendKeys(str);
	}

	public void clickPlaceOrder() {
		placeOrd.click();
	}

}
