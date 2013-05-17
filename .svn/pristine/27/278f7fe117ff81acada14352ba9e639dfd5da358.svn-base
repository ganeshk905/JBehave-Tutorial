package com.mtc.pages;
/**
 * 
 * @author saikrishna_v
 * 
 */
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.mtc.interfaces.House_List;
import com.mtc.util.CommonMethods;
import com.mtc.util.ObjectRepo;

public class HouseList extends CommonMethods implements House_List {

	
	
	public HouseList(WebDriverProvider driverProvider) {
		super(driverProvider);

	}

	public void ClickonTicketingTab() {

		findElement(By.xpath("//*[@id='navlist']/li[2]/a")).click();
		manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

	}

	public void selectMiles() {
		WaitforELementToBeClickable("//*[@id='SearchRadius']/option[2]",20);
		findElement(By.xpath("//*[@id='SearchRadius']/option[2]")).click();
        
	}

	public void clickOnAllTheaterTab() {

		findElement(By.xpath("//*[@id='navlist']/li[1]/a")).click();

	}

	public void verifySelectedMiles(String miles) {

		WebElement dropdown_Miles = findElement(By
				.xpath("//*[@id='SearchRadius']"));
		Select select = new Select(dropdown_Miles);

		String selected_Text = select.getFirstSelectedOption().getText();
		Assert.assertEquals(miles, selected_Text);
	}

	public void verifyCurrentTab(String tabText) {

		String tabTextActual = findElement(By.xpath("//*[@id='current']"))
				.getText();
		System.out.println(tabTextActual);
		Assert.assertEquals("The Ticketing theater tab is not selected",
				 tabText,tabTextActual);

	}

	public void clickMovieHomepage() {
		System.out.println("Reached the Phase Expected");
		clickLink(ObjectRepo.movieListHomePage);
		
		
	}

	public void clickBuyTickets(){
		WaitforELementToBeClickable(ObjectRepo.buyTickets, 10);
		clickLink(ObjectRepo.buyTickets);
	}
	

}
