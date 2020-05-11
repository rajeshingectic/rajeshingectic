package com.experitest.Android;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class searchmobile extends Addvehiclemobile{
	
	@Test(priority = 3)
	
	public void Searchmobile() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='searchText']")).sendKeys("Battery");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("(//*[@id=\"parts\"])//li[1]")).isDisplayed()) {
			System.out.println("search item Battery is getting displayed in search result page");
		}else {
			System.out.println("search item Battery is not getting displayed in search result page");
		}
		
	}

}

