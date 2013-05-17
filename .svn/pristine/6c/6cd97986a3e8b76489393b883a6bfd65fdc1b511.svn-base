package com.test.MTC;


import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Testing_Loop {

	/**
	 * @param args
	 */
@Test
public void application(){
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.movietickets.com");

		driver.findElement(By.xpath("//input[@id='Szip']")).sendKeys("02035");
		driver.findElement(By.xpath("//a[@id='zGo']")).click();
		driver.findElement(By.xpath("//ul[@id='tkdrow']/li/a")).click();

		
		boolean containsText= driver.getPageSource().contains("Alex Cross");
		System.out.println(containsText);
		
		Assert.assertFalse("Element  credit card and Send Tickets to My phone is present.",containsText);
	
		 // String showtimes = "//*[@id='rw3']/li[2]/p/a[2]";

		/*WebElement elementPresent = driver.findElement(By.xpath(showtimes));
		if (elementPresent.isDisplayed()) {
				driver.findElement(By.xpath(showtimes)).click();
		}else
		{
		List<WebElement> dropdownSlect=	driver.findElements(By.xpath("//*[@id='rdate']"));
		dropdownSlect.size();
		
		for(int i=0;i<dropdownSlect.size();){
			
			WebElement xpathFound = driver.findElement(By.xpath("//*[@id='rdate']/option["+ i +"]"));
			
			System.out.println(xpathFound);
			
			WebElement elementPresent1 = driver.findElement(By.xpath(showtimes));
			if(elementPresent1.isDisplayed()){
				 driver.findElement(By.xpath(showtimes)).click();
		
			}
			break;
		}
		}*/

	}

}
