package Ingectic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Addvehicle extends loginb2c{
	
	@Test(priority = 2)
	
	public void addvehicle() throws InterruptedException
	{
		{
			try {
				driver.findElement(By.id("myzone-overlay-ymme")).click();
			      System.out.println("vehicle need to select");
			    } catch (Exception e) {
			    	driver.findElement(By.xpath("//a[@class='showDropDown']")).click();
			    	driver.findElement(By.id("myzone-overlay-ymme")).click();
			    	
			      System.out.println("vehicle is replaced");
			      Thread.sleep(3000);
			    }
		driver.findElement(By.xpath("//select[@id='year']/option[20]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@name='make']/option[21]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@name='model']/option[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@name='engine']/option[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='button button-ie8']")).click();
		Thread.sleep(3000);
		
						
			
	}

	}}
