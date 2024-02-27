package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;

public class GoogleTest extends BaseTest{
	
	
	@Test(priority=1)
	public void GoogleTitleTest()
	{
		testCaseID="1";
		String title=driver.getTitle();
		System.out.println(" GooglePage Title is :"+title);
		
		Assert.assertEquals(title, "Google");
	}
	
	@Test(priority=2)
	public void GoogleLogoTest()
	{
		testCaseID="2";
		 boolean logo=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		 System.out.println(logo);
		 Assert.assertTrue(logo);
	}
	

	@Test(priority=3)
	public void isSearchExist()
	{
		testCaseID="5";
		boolean flag=driver.findElement(By.name("q")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@Test(priority=3,groups="link")
	public void GoogleLinkTest()
	{
		 boolean link=driver.findElement(By.xpath("//a[@href=\"https://mail.google.com/mail/&ogbl\"]")).isDisplayed();
		 System.out.println(link);
	}
	
	@Test()
	public void TextVerify()
	{
		Boolean text=driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).isDisplayed();
		System.out.println(text);
	}
	
	
*/
}
