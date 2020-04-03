package Ingectic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class search1 extends URL {

	@Test(priority = 1)
	public void Search() throws Throwable {
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.className("iblpc")).submit();
		Thread.sleep(3000);
	}
}
