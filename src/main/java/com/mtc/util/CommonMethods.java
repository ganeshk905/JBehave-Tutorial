package com.mtc.util;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends WebDriverPage {

	public CommonMethods(WebDriverProvider driverProvider) {
		super(driverProvider);

	}

	public void clickLink(String xpath) {

		findElement(By.xpath(xpath)).click();

	}

	public void selectDropDown(String xpath) {

		findElement(By.xpath(xpath)).click();

		/*
		 * WebElement dropdown=findElement(By.id(id));
		 * 
		 * Select select = new Select(dropdown); //select.deselectAll();
		 * select.selectByVisibleText("1");
		 */

	}
	
	public void WaitforELementToBeClickable(String xpathElement,long WaitTime){
		
		 new WebDriverWait(webDriver(),WaitTime, 20).until(ExpectedConditions.elementToBeClickable(By.xpath(xpathElement)));
		
	}
	
	
	

	public void typeKeys(String xpath, String textToEnter) {

		findElement(By.xpath(xpath)).sendKeys(textToEnter);
	}

	public void refreshPage() {

		navigate().refresh();

	}

	public void verifyElementNotPresent(String xpath) {
		boolean containsText = findElement(By.xpath(xpath)).isDisplayed();
		System.out.println(containsText);
		Assert.assertFalse("Credit Card Store Option is displayed", containsText);
		//return containsText;

	}

	public void assertElementNotPresent() {

		/*
		 * WebElement details=
		 * findElement(By.xpath("//*[@id='redemption_options']/div[1]"));
		 * if(details
		 * .getText().contains("Credit Card && Send Tickets to My Phone")){
		 * Assert.assertFalse(false); }
		 */

		boolean containsTextCredit = getPageSource().contains("CreditCard");
		boolean containsTextSendTicket = getPageSource().contains(
				"Send Tickets To My Phone");
		System.out.println(containsTextCredit);
		System.out.println(containsTextSendTicket);
		Assert.assertFalse("Element  credit card option is been displayed ",
				containsTextCredit);
		Assert.assertFalse(
				"Element  Send Tickets to My phone is present is displayed.",
				containsTextSendTicket);

	}
}