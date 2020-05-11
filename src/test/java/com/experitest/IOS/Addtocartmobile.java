package com.experitest.IOS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Addtocartmobile extends loginmobile{
	@Test(priority = 2)
	public void addtocartmobile() throws InterruptedException
	{driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Shop")).click();
		
		driver.findElement(By.xpath("//*[@id='productList']//li[1]")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='productList']//li[13]")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='productList']//li[15]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='productList']//a")).click();

		driver.findElement(By.xpath("//*[@id='pageHeader' and contains(text(),'Wiper Blade (Windshield)')]")).isDisplayed();
		System.out.println("User in Wiper blade Result page");
		driver.findElement(By.xpath("//a[@class='button small availableAll cartPopup']")).click();
		driver.findElement(By.xpath("(//*[@class='button full addItem'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='qtyItemCart']")).click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//div[@class='qty']")).isDisplayed()) {
			System.out.println("Added Product is getting displayed in cart page");
			}else {
				System.out.println("Product is not added in cart page");
			}
}
}

