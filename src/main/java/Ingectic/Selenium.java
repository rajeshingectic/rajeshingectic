package Ingectic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Selenium extends search1 {

	@Test(priority = 2)
	public void selenium() {
		driver.findElement(By.xpath("(//h3[@class=\"LC20lb DKV0Md\"])[1]")).click();
		driver.findElement(By.className("headerLink")).isDisplayed();
	}
}
