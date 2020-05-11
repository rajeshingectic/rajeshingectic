package Ingectic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Topnavmouseover extends loginb2c{
	
	@Test(priority = 2)
	public void autoparts() throws InterruptedException
	{
		Actions action= new Actions(driver);
		WebElement mainNav = driver.findElement(By.xpath("//a[@class=\"mainNavLink mainNavLink-0\"]"));
		action.moveToElement(mainNav).perform();
	     System.out.println("Done Mouse hover on 'Autoparts' from Menu");
		Thread.sleep(3000);
		
		
	}
	@Test(priority = 3)
	public void InteriorAccessories() throws InterruptedException {
		Actions action= new Actions(driver);
		WebElement mainNav = driver.findElement(By.xpath("//a[@class=\"mainNavLink mainNavLink-1\"]"));
		action.moveToElement(mainNav).perform();
	     System.out.println("Done Mouse hover on 'Interior Accessories' from Menu");
		Thread.sleep(3000);
	}
	@Test(priority = 4)
	public void ExteriorAccessories() throws InterruptedException {
		Actions action= new Actions(driver);
		WebElement mainNav = driver.findElement(By.xpath("//a[@class=\"mainNavLink mainNavLink-2\"]"));
		action.moveToElement(mainNav).perform();
	     System.out.println("Done Mouse hover on 'Exterior Accessories' from Menu");
		Thread.sleep(3000);
	}
	@Test(priority = 5)
	public void TruckTowing() throws InterruptedException {
		Actions action= new Actions(driver);
		WebElement mainNav = driver.findElement(By.xpath("//a[@class=\"mainNavLink mainNavLink-3\"]"));
		action.moveToElement(mainNav).perform();
	     System.out.println("Done Mouse hover on 'Truck & Towing' from Menu");
		Thread.sleep(3000);
	}
	@Test(priority = 6)
	public void ToolsEquipments() throws InterruptedException {
		Actions action= new Actions(driver);
		WebElement mainNav = driver.findElement(By.xpath("//a[@class=\"mainNavLink mainNavLink-4\"]"));
		action.moveToElement(mainNav).perform();
	     System.out.println("Done Mouse hover on 'Tools & Equipments' from Menu");
		Thread.sleep(3000);
	}
	@Test(priority = 7)
	public void Fluidschemicals() throws InterruptedException {
		Actions action= new Actions(driver);
		WebElement mainNav = driver.findElement(By.xpath("//a[@class=\"mainNavLink mainNavLink-5\"]"));
		action.moveToElement(mainNav).perform();
	     System.out.println("Done Mouse hover on 'Fluids & chemicals' from Menu");
		Thread.sleep(3000);
	}
	@Test(priority = 8)
	public void PerformanceProducts() throws InterruptedException {
		Actions action= new Actions(driver);
		WebElement mainNav = driver.findElement(By.xpath("//a[@class=\"mainNavLink mainNavLink-6\"]"));
		action.moveToElement(mainNav).perform();
	     System.out.println("Done Mouse hover on 'Performance Products' from Menu");
		Thread.sleep(3000);
	}
	@Test(priority = 9)
	public void RepairHelp() throws InterruptedException {
		Actions action= new Actions(driver);
		WebElement mainNav = driver.findElement(By.xpath("//a[@class=\"mainNavLink mainNavLink-7\"]"));
		action.moveToElement(mainNav).perform();
	     System.out.println("Done Mouse hover on 'Repair Help' from Menu");
		Thread.sleep(3000);
	}
	@Test(priority = 10)
	public void NewItems() throws InterruptedException {
		Actions action= new Actions(driver);
		WebElement mainNav = driver.findElement(By.xpath("//a[@class=\"nav-static-3 mainNavLink mainNavLink-9\"]"));
		action.moveToElement(mainNav).perform();
	     System.out.println("Done Mouse hover on 'New Items' from Menu");
		Thread.sleep(3000);
	}
	@Test(priority = 11)
	public void Hotdeals() throws InterruptedException {
		Actions action= new Actions(driver);
		WebElement mainNav = driver.findElement(By.xpath("//a[@class=\"nav-static-1  mainNavLink mainNavLink-8\"]"));
		action.moveToElement(mainNav).perform();
	     System.out.println("Done Mouse hover on 'Hot deals' from Menu");
		Thread.sleep(3000);
	}

}
