package Ingectic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Productdetails extends loginb2c {
	@Test(priority = 2)
	public void autoparts() throws InterruptedException
	{
		Actions action= new Actions(driver);
		WebElement mainNav = driver.findElement(By.xpath("//a[@class=\"mainNavLink mainNavLink-0\"]"));
		action.moveToElement(mainNav).perform();
	     System.out.println("Done Mouse hover on 'Autoparts' from Menu");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@title,'Wiper Blade (Windshield)')]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Wiper Blade (Windshield)')])[3]")).isDisplayed();
		System.out.println("User in Wiper blade Result page");
		
		driver.findElement(By.xpath("//div[@class='grid-7 shelfItemPreview ']")).click();
		driver.findElement(By.id("product-info-tabs")).isDisplayed();
		System.out.println("Product detail tab is getting displayed in PDP page");
}
}
