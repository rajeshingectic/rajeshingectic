package mobileb2c;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class URLB2Cmobile {

	public static WebDriver driver;
	@BeforeTest
	//@Test
	public void launchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\git\\rajeshingectic\\src\\main\\java\\Ingectic\\chromedriver.exe");
		//driver = new ChromeDriver();
		
		/*driver.get("https://m.autozone.com/");
		Thread.sleep(3000);*/
		
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Galaxy S5");

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("mobileEmulation", mobileEmulation);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://m.autozone.com/");
		driver.findElement(By.xpath("//*[@id=\'form-close\']/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='sb-close']")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("optanon-alert-box-close")).click();
		driver.getTitle();
	}

@AfterTest
public void teardown() {
	driver.close();
}
}
