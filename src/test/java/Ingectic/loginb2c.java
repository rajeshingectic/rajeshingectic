package Ingectic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class loginb2c extends URLB2C{
	
	@Test(priority = 1)
	
	public void login() throws InterruptedException
	{
		String str=driver.getTitle();
		System.out.println(str);
		String str1="AutoZone Auto Parts - Buy Online or in a Store Near You";
		if(str1.equals(str)){
		System.out.println("User is currently on Home page");
		}
		else {
			System.out.println("User is currently not on Home Page");
		}
		driver.findElement(By.xpath("//*[@id=\"profilenav\"]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("username1")).sendKeys("rudra200519@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("test@121");
		driver.findElement(By.id("rememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']")).click();
		Thread.sleep(3000);
	
	}
		
		/* public static void waitforElementThenClick(WebDriver driver, WebElement element) throws InterruptedException {
		        try 
		        {
		        	driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']")).click();
		    		Thread.sleep(3000);
		        	WebDriverWait wait = new WebDriverWait(driver, 20);
		            wait.until(ExpectedConditions.elementToBeClickable(element));
		            element.click();
		        } 
		        catch (Exception e) {
		        }*/

	


}
