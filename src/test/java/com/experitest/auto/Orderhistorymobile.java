package com.experitest.auto;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Orderhistorymobile extends loginmobile{
	@Test(priority = 2)
	
	public void orderhistorymobile() throws InterruptedException
	{
		driver.findElement(By.id("my-zone")).click();
		driver.findElement(By.linkText("Order History")).click();
		if(driver.findElement(By.xpath("//h2[contains(text(),'Order History')]")).isDisplayed()){
			System.out.println("Order history page is getting displyed");
			}
			else {
				System.out.println("Order history page is not getting displayed");
			}
	}
}