package mobileb2c;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Couponcodemobile extends loginmobile{
	@Test(priority = 2)
	public void couponcodemobile() throws InterruptedException
	{
		driver.findElement(By.linkText("Shop")).click();
		driver.findElement(By.xpath("//*[@id='productList']//li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"productList\"]//li[13]")).click();
		driver.findElement(By.xpath("//*[@id=\"productList\"]//li[15]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"productList\"]//a")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Wiper Blade (Windshield)')])[12]")).isDisplayed();
		System.out.println("User in Wiper blade Result page");
		driver.findElement(By.xpath("//a[@class='button small availableAll cartPopup']")).click();
		driver.findElement(By.xpath("(//*[@class='button full addItem'])[1]")).click();
		driver.findElement(By.xpath("//a[@class='button silver small']")).click();
		if(driver.findElement(By.xpath("//div[@id='couponCodeAreaId']")).isDisplayed()) {
			System.out.println("Coupon code section is getting displayed in cart page");
			}else {
				System.out.println("Coupon code section is not getting displayed in cart page");
			}
}
}
