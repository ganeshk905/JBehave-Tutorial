package com.mtc.pages;

import org.jbehave.web.selenium.WebDriverProvider;

public class PageFactory {

	private final WebDriverProvider webDriverProvider;

	public PageFactory(WebDriverProvider webDriverProvider) {
		this.webDriverProvider = webDriverProvider;
	}

	public Home newHome() {
		return new Home(webDriverProvider);

	}

	public HouseList list(){
		return new HouseList(webDriverProvider);
	}

	public MovieDetail detail() {
		// TODO Auto-generated method stub
		return new MovieDetail(webDriverProvider);
	}

	public PurchaseTicket purchase() {
		// TODO Auto-generated method stub
		return new PurchaseTicket(webDriverProvider);
	}
}
