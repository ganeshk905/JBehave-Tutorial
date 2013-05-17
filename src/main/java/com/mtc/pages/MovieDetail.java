package com.mtc.pages;
/**
 * @author saikrishna_v
 * 
 */
import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;

import com.mtc.interfaces.Movie_Detail;
import com.mtc.util.CommonMethods;
import com.mtc.util.ObjectRepo;

public class MovieDetail extends CommonMethods  implements Movie_Detail{

	
	
	public MovieDetail(WebDriverProvider driverProvider) {
		super(driverProvider);
		
	}

	public void clickShowTime() {
		//TODO click on the movie show time .
		System.out.println("In Movie Details Page");
		manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.selectDropDown("//*[@id='rdate']/option[3]");
	    selectDropDown("//*[@id='rdate']/option[49]");
	
	//*[@id='rdate']/option[49]
		clickLink(ObjectRepo.showTimes);
		
		
	}

}
