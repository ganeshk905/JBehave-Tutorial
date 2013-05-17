package com.mtc.steps;
/**
 * 
 * @author saikrishna_v
 */
import junit.framework.Assert;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.mtc.pages.Home;
import com.mtc.pages.HouseList;
import com.mtc.pages.MovieDetail;
import com.mtc.pages.PageFactory;
import com.mtc.pages.PurchaseTicket;
import com.mtc.util.ObjectRepo;

public class MTCSteps {

	private Home home = null;
	private HouseList house = null;
	private MovieDetail moviedetail= null;
	private PurchaseTicket purchaseticketpage=null;

	public MTCSteps(PageFactory pageFactory) {

		home = pageFactory.newHome();
		house = pageFactory.list();
		moviedetail=pageFactory.detail();
		purchaseticketpage=pageFactory.purchase();
	}

	@Given("A user is on the house list page")
	public void houseListPage() {
		home.go();
		home.searchZipCode("02035");
	}

	@When("they change the default search range")
	@Alias("then change the default search range")
	public void ChangeTheSearchRange() {
	
		house.selectMiles();
		//house.clickOnAllTheaterTab();
		// house_list.verifySelectedMiles("20 mi.");
	}

	@When("User Navigates to  the Ticketing Theaters tab")
	public void clickOnTicketingTab(){
		
		house.ClickonTicketingTab();
	}
	
	@Then("they should remain on the Ticketing Theaters tab")
	public void theatertab() {
		house.verifyCurrentTab("Ticketing Theaters");
	}
	
	@When("click the Ticketing Theaters tab")
	public void clickTheaterTab(){
		
		house.ClickonTicketingTab();
	}
	@Then("the search range should retain the choosen value")
	public void valueSelected(){
		house.verifySelectedMiles("10 mi.");
	}
	
	@Given("a user is purchasing a ticket")
	public void purchasingTicket(){
		
		home.go();
		//house.clickMovieHomepage();
		home.searchZipCode("02035");
		house.clickBuyTickets();
		moviedetail.clickShowTime();
		purchaseticketpage.selectTicket();
		purchaseticketpage.clickContinue(ObjectRepo.clickContinue);
		purchaseticketpage.accountSignIn(ObjectRepo.username,ObjectRepo.password,"saikrishna.vijayakumar@photoninfotech.net","hello123");
		purchaseticketpage.paymentMode();
		
	}
	
	@When("they are on the Redemption Option page")
	public void verifyTheRedemptionOption(){
		
		purchaseticketpage.redemptionOption(ObjectRepo.redemptionOption);
	}
	
	@Then("the user refreshes the page")
	public void refreshPage(){
		
		purchaseticketpage.refreshpage();
	}
	
	@Then("clicked Continue Order")
	public void clickContinuePopUp(){
		purchaseticketpage.clickContinuePop();
	}
	@Then("they should be returned to the Redemption Option page")
	public void returningTORedemptionPage(){
		
		purchaseticketpage.redemptionOptionOnPage();
	}
	
	@Given("I have purchased multiple tickets")
	public void purchasingMultipleTickets(){
		
		home.go();
		//house.clickMovieHomepage();
		home.searchZipCode("02035");
		house.clickBuyTickets();
		moviedetail.clickShowTime();
		purchaseticketpage.selectTicket();
		purchaseticketpage.clickPromoCodeCheckBox();
		purchaseticketpage.clickContinue(ObjectRepo.clickContinue);
		
	}
	
	@Given("with use a single promo code")
	public void singelPromoCode(){
		purchaseticketpage.addpromocode();
		purchaseticketpage.clickContinue(ObjectRepo.clickContinuePromoCode);
		purchaseticketpage.accountSignIn(ObjectRepo.username,ObjectRepo.password,"saikrishna.vijayakumar@photoninfotech.net","hello123");
		purchaseticketpage.paymentMode();
	    purchaseticketpage.clickContinue(ObjectRepo.clickContinuePurchaseTicket);
	    purchaseticketpage.clickContinue(ObjectRepo.clickPurchaseButton);
	    purchaseticketpage.clickLink("//*[@id='nav']/a[1]");
	}
	
	@When("I go to my account summary page")
	public void accountSummaryPage(){
		
		purchaseticketpage.clickLink("//*[@id='nav']/div[1]/a[3]");
	}
	
	@Then("I should see only one transaction listed in my order history")
	public void verifySingleTrackingID(){
		
		home.myAccountTrackingID();
		
	}
	
	@Given("with use multiple promo codes")
	public void multiplePromoCode(){
		purchaseticketpage.addMultiplepromocode();
		purchaseticketpage.clickContinue(ObjectRepo.clickContinuePromoCode);
		purchaseticketpage.accountSignIn(ObjectRepo.username,ObjectRepo.password,"saikrishna.vijayakumar@photoninfotech.net","hello123");
		purchaseticketpage.paymentMode();
	    purchaseticketpage.clickContinue(ObjectRepo.clickContinuePurchaseTicket);
	    purchaseticketpage.clickContinue(ObjectRepo.clickPurchaseButton);
	    purchaseticketpage.clickLink("//*[@id='nav']/a[1]");
		
	}
	
	@Given("a user is already signed In")
	public void guestCheckout(){
		
		home.go();
		purchaseticketpage.clickLink("//*[@id='nav']/div[1]/a[4]");
        purchaseticketpage.WaitforELementToBeClickable(ObjectRepo.signInButton, 10);
	    purchaseticketpage.accountSignIn(ObjectRepo.email_myacct,ObjectRepo.pass_myacct,"saikrishna.vijayakumar@photoninfotech.net", "hello123");
	    purchaseticketpage.clickLink(ObjectRepo.Home);
	    home.searchZipCode("02035");
		
		
	}
	
	@When("the user is purchasing a ticket")
	public void userPurchasingTicket(){
		
		house.clickBuyTickets();
		moviedetail.clickShowTime();
		purchaseticketpage.selectTicket();
		purchaseticketpage.clickContinue(ObjectRepo.clickContinue);
		
	}
	
	@When("selects the Guest Checkout to complete the transcation")
	public void guestCheckOut(){
		
		purchaseticketpage.clickLink(ObjectRepo.guestCheckout);
		purchaseticketpage.clickContinue(ObjectRepo.guestCheckoutCOntinue);
		
	}
	
	@Then("they should not be able to store Credit card into the account that is signed  in")
	public void verifyCreditCheckBoxNotPresent(){
		purchaseticketpage.verifyElementNotPresent(ObjectRepo.StoreCredit);
		
	}
}
