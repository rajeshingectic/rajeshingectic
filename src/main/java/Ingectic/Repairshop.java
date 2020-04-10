package Ingectic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Repairshop extends URLB2C{

	@Test
	public void repairshop() throws InterruptedException {
		driver.findElement(By.xpath("//a[@title='FIND A REPAIR SHOP']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("find-a-shop");
		driver.findElement(By.xpath("//input[@id='txtZip']")).sendKeys("11002");
		driver.findElement(By.xpath("//a[@class='noBorder btnFindaShop']")).click();
		Thread.sleep(6000);
		System.out.println("Search result is getting displayed");
	}
}
