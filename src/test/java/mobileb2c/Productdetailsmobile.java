package mobileb2c;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Productdetailsmobile extends URLB2Cmobile {
	@Test(priority = 1)
	public void productdetailsmobile() throws InterruptedException
	{
		driver.findElement(By.linkText("Shop")).click();
		driver.findElement(By.xpath("//*[@id='productList']//li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"productList\"]//li[13]")).click();
		driver.findElement(By.xpath("//*[@id=\"productList\"]//li[15]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"productList\"]//li[4]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Wiper Blade (Windshield)')])[12]")).isDisplayed();
		System.out.println("User in Wiper blade Result page");
		driver.findElement(By.xpath("(//div[@class='prodImage'])[1]")).click();
		if(driver.findElement(By.id("tab-container")).isDisplayed()) {
		System.out.println("Product detail tab is getting displayed in PDP page");
		}else {
			System.out.println("Product detail tab is not getting displayed in PDP page");
		}
}
}

