package mobileb2c;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DealsMobile extends loginmobile{
	
	@Test(priority = 2)
	public void dealsmobile()throws InterruptedException
	{
		driver.findElement(By.linkText("Deals")).click();
		String str=driver.getTitle();
		System.out.println(str);
		String str1="Deals | AutoZone.com";
		if(str1.equals(str)){
		System.out.println("User is currently on Deals page");
		}
		else {
			System.out.println("User is currently not on Deals Page");
		}
		
		driver.findElement(By.xpath("(//img[@class='centered'])[1]")).click();
		String str2=driver.getTitle();
		System.out.println(str2);
		String str3="Deal Maker";
		if(str3.equals(str2)){
		System.out.println("User is currently on Deals Maker page");
		}
		else {
			System.out.println("User is currently not on Deals Maker Page");
		}
		

	}

}

