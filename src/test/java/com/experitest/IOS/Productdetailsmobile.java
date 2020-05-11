package com.experitest.IOS;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Productdetailsmobile extends IOSDemoTest {
	@Test(priority = 1)
	public void productdetailsmobile() throws InterruptedException
	{
		
		driver.findElement(By.linkText("Shop")).click();
		driver.findElement(By.xpath("//*[@id='productList']//li[1]")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='productList']//li[13]")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='productList']//li[15]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='productList']//li[4]")).click();
		
		driver.findElement(By.xpath("//*[@id='pageHeader' and contains(text(),'Wiper Blade (Windshield)')]")).isDisplayed();
		System.out.println("User in Wiper blade Result page");
		driver.findElement(By.xpath("(//div[@class='prodImage'])[1]")).click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//*[@id='ui-id-1' and @class='ui-tabs-anchor']")).isDisplayed()) {
		System.out.println("Product detail tab is getting displayed in PDP page");
		}else {
			System.out.println("Product detail tab is not getting displayed in PDP page");
		}
}
}

