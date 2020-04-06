package Ingectic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Deals extends URLB2C{
	
	@Test
	public void deals() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\'mainNav\']/li[10]/a")).click();
		String str=driver.getTitle();
		System.out.println(str);
		String str1="Deals | AutoZone.com";
		if(str1.equals(str)){
		System.out.println("User is currently on Deals page");
		}
		else {
			System.out.println("User is currently not on Deals Page");
		}
		
		driver.findElement(By.cssSelector("#rightcontent > div.onecol-maincontent > div.insidecontainer.pad.rounded.box-shadow > div.content > div.deals_matrix.clearfix > div:nth-child(1) > a > img")).click();
		String str2=driver.getTitle();
		System.out.println(str2);
		String str3="Deal Maker Page | AutoZone.com";
		if(str3.equals(str2)){
		System.out.println("User is currently on Deals Maker page");
		}
		else {
			System.out.println("User is currently not on Deals Maker Page");
		}
		

	}

}
