package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	@FindBy(linkText = "Login/Sign Up")
	private WebElement loginbtn;

	@FindBy(xpath = "//input[@id='otpEmail']")
	private WebElement inputemail;

	@FindBy(xpath = "//button[@class='btn btn-default login-btn']")
	private WebElement contbtn;

	@FindBy(xpath = "//button[@class='btn btn-default btn-lg login-btn fixed-btn']")
	private WebElement btnLogin;

	// utilization
	public void clickSignin() {
		loginbtn.click();
	}

	public void enterUsernme(String username) {
		inputemail.sendKeys(username);
	}

	public void clickCont() {
		contbtn.click();
	}

	public void clickLogin() {
		btnLogin.click();
	}

}
