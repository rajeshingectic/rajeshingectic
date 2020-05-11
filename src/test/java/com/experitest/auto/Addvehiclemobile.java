package com.experitest.auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Addvehiclemobile extends loginmobile{

	@Test(priority = 2)
	
	public void addvehiclemobile() throws InterruptedException{

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    	driver.findElement(By.linkText("My Vehicle")).click();
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	WebElement element = driver.findElement(By.xpath("//span[@text='Add A Vehicle']"));
				js.executeScript(("arguments[0].click();"), element);
				Thread.sleep(3000);
	driver.findElement(By.xpath("//ul[@class='nav']/li[20]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ul[@class='nav']/li[20]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ul[@class='nav']/li[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ul[@class='nav']/li[1]")).click();
	Thread.sleep(3000);
	
	String str = driver.findElement(By.xpath("//h3[@class='checked']")).getText();
	System.out.println(str);
	String str1="2002 Ford Truck E150 1/2 ton Van 4.2L FI OHV 6cyl";
	if(str1.equals(str)){
	System.out.println("Vehicle is added to my vehicles");
	}
	else {
		System.out.println("Vehicle is Not added to my vehicles");
	}
}}

