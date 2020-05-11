package Ingectic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class search extends Addvehicle{
	
	@Test(priority = 3)
	
	public void Search() throws InterruptedException {
		driver.findElement(By.id("q")).sendKeys("Battery Booster Cable");
		driver.findElement(By.id("search-icon")).click();
		Thread.sleep(3000);
		if(driver.findElement(By.id("//*[@id=\"cont\"]//h1")).isDisplayed()){
			System.out.println("User is currently on Search Result page");
			}
			else {
				System.out.println("User is currently not in Search Result Page");
			}
		/*driver.findElement(By.id("atcBtn_824997_0")).click();
		driver.findElement(By.xpath("//*[@id=\'shopping-cart\']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Remove")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'profileLogoutForm\']/a")).click();
		Thread.sleep(3000);*/
	}

}
