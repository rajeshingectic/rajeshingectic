package com.experitest.IOS;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileBrowserType;

public class IOSDemoTest {
	private String accessKey = "eyJ4cC51Ijo4MTU5NjA1LCJ4cC5wIjo4MTU5NjA0LCJ4cC5tIjoiTVRVNE56SXdNakV3TVRFNE1nIiwiYWxnIjoiSFMyNTYifQ.eyJleHAiOjE5MDI1NjI2NTIsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.ZLhpGAyf13a-JwLu9DsnmTGiQOaWGxFwj-GDDL8Dw2E";
    protected IOSDriver<WebElement> driver = null;
    DesiredCapabilities dc = new DesiredCapabilities();
    
    @BeforeTest
    public void setUp() throws MalformedURLException {
    	
        dc.setCapability("testName", "Quick Start IOS Browser Demo");
        dc.setCapability("accessKey", accessKey);
        dc.setCapability("deviceQuery", "@os='ios' and @category='PHONE'");
        dc.setBrowserName(MobileBrowserType.SAFARI);
        
        driver = new IOSDriver<WebElement>(new URL("https://cloud.seetest.io/wd/hub"), dc);
        
    }

    @Test
    public void URLB2C() throws InterruptedException {
    	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
    	driver.get("https://m.autozone.com/");
		driver.findElement(By.xpath("//*[@id=\'form-close\']/img")).click();
		driver.findElement(By.xpath("//*[@text='GOT IT!' and @nodeName='BUTTON']")).click();
		
		
    }

    @AfterTest
    public void tearDown() {
        System.out.println("Report URL: "+ driver.getCapabilities().getCapability("reportUrl"));
        driver.quit();
    }
}