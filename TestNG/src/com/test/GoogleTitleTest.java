package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.*;

public class GoogleTitleTest {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
	}
	
	@Test()
	public void GoogleTitleTest1()
	{
		String title=driver.getTitle();
		System.out.println("Title is :"+title);
		
		Assert.assertEquals(title, "Google","title is not matched");
		
	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
