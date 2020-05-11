package com.experitest.auto1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Removemobile extends loginmobile{
	@Test(priority = 2)
	public void removemobile() throws InterruptedException
	{
		driver.findElement(By.linkText("Shop")).click();
		
		driver.findElement(By.xpath("//*[@id='productList']//li[1]")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='productList']//li[13]")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='productList']//li[15]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"productList\"]//a")).click();
		Thread.sleep(3000);
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
		driver.findElement(By.linkText("Remove")).click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//*[contains(text(),'There are no items in your cart.')]")).isDisplayed()){
			System.out.println("Added Product is removed from cart page");
		}else {
			System.out.println("Product is getting displayed in cart page");
		}
}
}