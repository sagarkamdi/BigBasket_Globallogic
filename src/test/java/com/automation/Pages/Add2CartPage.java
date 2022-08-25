package com.automation.Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Add2CartPage extends BasePage{
	
	@FindBy(xpath="//input[@qa='searchBar']")
	private WebElement searchBox;
	
	@FindBy(xpath="//button[@qa='searchBtn']")
	private WebElement clksearch;
	
	@FindBy(xpath="//a[@uib-tooltip='Refined Palmolein Oil - Imported']")
	private WebElement clkItem;
	

	@FindBy(xpath="//div[@data-qa='addToBasket']")
	private WebElement clkatc;
	
	@FindBy(xpath="//div[@class='_1aJzw']")
	private WebElement clkaaddquant;
	
	@FindBy(xpath="//div[@class='_1SFBV  rippleEffect']")
	private WebElement clksave;
	
	@FindBy(xpath="//span[@class='_1XLc6']")
	private WebElement profile;



	// utilization
	
	public void Search(String str) {
		searchBox.sendKeys(str);
	}
	
	public void clickSearch() {
		clksearch.click();
	}
	
	public void clickItem() {
		clkItem.click();
	}
	
	public void switchWin() {
		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);

				break;
			}
		}
	}
	
	
	
	public void clickAddTC() throws InterruptedException {
		clkatc.click();
		Thread.sleep(2000);
		clkaaddquant.click();
		Thread.sleep(2000);
		clkaaddquant.click();
	}
	
	public void clickSave() {
		clksave.click();
	}
	
	public void profile() {
		profile.click();
		
		Actions act = new Actions(driver);
		WebElement basket = driver.findElement(By.xpath("//span[@class='_1XLc6']"));
	    act.moveToElement(basket).perform();
	    driver.findElement(By.xpath("//a[@params='ver=1&nc=md']")).click();
		
		
	}
	
	
}
