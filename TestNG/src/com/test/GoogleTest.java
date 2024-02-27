package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class GoogleTest {

	WebDriver driver;
	
	@BeforeSuite
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
	}
	
	@Test(priority=1,groups="title")
	public void GoogleTitleTest()
	{
		String title=driver.getTitle();
		System.out.println("Title is :"+title);
		
		Assert.assertEquals(title, "Google");
			// above or below can write
	//	Assert.assertEquals(title, "Google","title is not matched");
		
	}
	
	@Test(priority=2,groups="logo")
	public void GoogleLogoTest()
	{
		 boolean logo=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		 System.out.println(logo);
		 Assert.assertTrue(logo);
		 // above or below command can write
		 Assert.assertEquals(logo, true);
	}
	

	@Test(priority=3,groups="link")
	public void GoogleLinkTest()
	{
		 boolean link=driver.findElement(By.xpath("//a[@href=\"https://mail.google.com/mail/&ogbl\"]")).isDisplayed();
		 System.out.println(link);
	}
	
	@Test(groups="TextVerify")
	public void TextVerify()
	{
		Boolean text=driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).isDisplayed();
		System.out.println(text);
	}
	@Test(groups="Test")
	public void Test2()
	{
		System.out.println("test1");
	}
	@Test(groups="Test")
	public void Test3()
	{
		System.out.println("test1");
	}
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
	
}
