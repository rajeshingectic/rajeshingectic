package com.experitest.IOS;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;

	public class loginmobile extends IOSDemoTest{
		
		@Test(priority = 1)
		
		public void login() throws InterruptedException
		{

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String str = driver.getTitle();
			System.out.println(str);
			String str1="AutoZone Auto Parts - Buy Online or in a Store Near You";
			if(str1.equals(str)){
			System.out.println("User is currently on Home page");
			}
			else {
				System.out.println("User is currently not on Home Page");
			}
			driver.findElement(By.id("my-zone")).click();
			System.out.println("User clicked on my-zone link");
			driver.findElement(By.linkText("Sign In")).click();
			driver.findElement(By.id("username")).sendKeys("rudra200519@gmail.com");
			driver.findElement(By.id("password")).sendKeys("test@121");
			driver.findElement(By.id("remember_me1")).click();
			driver.findElement(By.xpath("//*[@id='submit' and @class='button one-half right-side']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//li[@id='my-zone']")).click();
			if(driver.findElement(By.linkText("My Profile")).isDisplayed()){
				System.out.println("User is Logged in");
				}
				else {
					System.out.println("User is Failed to login");
				}

			driver.findElement(By.xpath("//li[@id='my-zone']")).click();
		
		}
		
	}

