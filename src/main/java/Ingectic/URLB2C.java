package Ingectic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class URLB2C {

	public static WebDriver driver;
	@BeforeTest
	
	public void launchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\git\\rajeshingectic\\src\\Ingectic\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.autozone.com/");
		driver.findElement(By.xpath("//*[@id=\'form-close\']/img")).click();
		Thread.sleep(3000);
	}

@AfterTest
public void teardown() {
	driver.close();
}
}
