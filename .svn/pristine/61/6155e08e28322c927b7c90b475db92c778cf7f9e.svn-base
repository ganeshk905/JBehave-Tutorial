package com.mtc.pages;
/**
 * 
 * @author saikrishna_v
 */
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.mtc.interfaces.Purchase_Ticket;
import com.mtc.util.CommonMethods;
import com.mtc.util.ObjectRepo;

public class PurchaseTicket extends CommonMethods implements
		Purchase_Ticket {

	

	public PurchaseTicket(WebDriverProvider driverProvider) {
		super(driverProvider);

	}

	public void selectTicket() {
		// select the number of ticket from the drop down.

		selectDropDown(ObjectRepo.numberOfTicketSelected);

	}

	public void clickContinue(String xpathElement) {
		// Click the Continue button .
		clickLink(xpathElement);
	}

	public void clickAddButton() {
		// TODO Auto-generated method stub
        clickLink("//*[@id='addPromoCode']");
	}

	public void accountSignIn(String Xpathusername,String XpathPasword,String username,String password) {
		// TODO Auto-generated method stub

		typeKeys(Xpathusername,
				username);
		typeKeys(XpathPasword, password);
		clickLink(ObjectRepo.signInButton);
	}

	public void paymentMode() {
		// Enter the payment terms

		selectDropDown(ObjectRepo.selectVisaCard);
		typeKeys(ObjectRepo.cardCVV, "123");
		typeKeys(ObjectRepo.billingFirstName, "test");
		typeKeys(ObjectRepo.billingLastName, "testlast");
		clickLink(ObjectRepo.paymentButton);

	}

	public void clickPromoCodeCheckBox(){
		
			clickLink(ObjectRepo.promocodecheckbox);
	}
	public void redemptionOption(String xpath) {
		// verify the redemptionOption
		String Expected = "Print My Own Tickets>optional";

		String Actual = findElement(By.xpath(xpath)).getText().trim();
		System.out.println(Actual);
		findElement(By.xpath(xpath)).getText().trim()
				.compareToIgnoreCase(Expected);
		Assert.assertEquals("The text hasnt matched", Expected, Actual);

	}

	public void addpromocode(){
		
		typeKeys("//*[@id='promoCodeEntry']", "0BD2EA724E47C6");
		clickAddButton();
	}
	
public void addMultiplepromocode(){
		
		typeKeys("//*[@id='promoCodeEntry']", "0BD2EA724E47C6");
		clickAddButton();
		typeKeys("//*[@id='promoCodeEntry']", "110DD16C5CB358");
		clickAddButton();
	}
	
	public void refreshpage() {

		refreshPage();
	}

	public void clickContinuePop() {
		// TODO Auto-generated method stub
	clickLink(ObjectRepo.continuePopUp);
	}

	public void redemptionOptionOnPage() {

		assertElementNotPresent();
	}

}
