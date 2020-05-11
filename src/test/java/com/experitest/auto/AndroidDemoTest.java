package com.experitest.auto;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileBrowserType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import java.net.CookieManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDemoTest {

    private String accessKey = "eyJ4cC51Ijo4MTU5NjA1LCJ4cC5wIjo4MTU5NjA0LCJ4cC5tIjoiTVRVNE56SXdNakV3TVRFNE1nIiwiYWxnIjoiSFMyNTYifQ.eyJleHAiOjE5MDI1NjI2NTIsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.ZLhpGAyf13a-JwLu9DsnmTGiQOaWGxFwj-GDDL8Dw2E";
    protected AndroidDriver<AndroidElement> driver = null;
    DesiredCapabilities dc = new DesiredCapabilities();
    
    @BeforeTest
    public void setUp() throws MalformedURLException {
    	
        dc.setCapability("testName", "Quick Start Android Browser Demo");
        dc.setCapability("accessKey", accessKey);
        dc.setCapability("deviceQuery", "@os='android' and @category='PHONE'");
        dc.setBrowserName(MobileBrowserType.CHROMIUM);
        
        driver = new AndroidDriver<AndroidElement>(new URL("https://cloud.seetest.io/wd/hub"), dc);
        
    }

    @Test
    public void URLB2C() throws InterruptedException {
    	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
    	driver.get("https://m.autozone.com/");
		driver.findElement(By.xpath("//*[@id=\'form-close\']/img")).click();
		driver.findElement(By.xpath("//*[@text='GOT IT!' and @nodeName='BUTTON']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'×')]"));
		js.executeScript(("arguments[0].click();"), element);
    }

    @AfterTest
    public void tearDown() {
        System.out.println("Report URL: "+ driver.getCapabilities().getCapability("reportUrl"));
        driver.quit();
    }
}