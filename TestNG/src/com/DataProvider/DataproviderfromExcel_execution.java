package com.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataproviderfromExcel_execution {
	
	WebDriver driver;
	
	@Test(dataProvider="getData",dataProviderClass=DataProviderfromExcel.class)
	public void TestLogin(String Username,String Password) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	driver.get("https://demo.guru99.com/test/newtours/");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys(Username);
		driver.findElement(By.name("txtPassword")).sendKeys(Password);
		driver.findElement(By.name("Submit")).click();
		Assert.assertTrue(driver.findElement(By.id("menu_admin_viewAdminModule")).isDisplayed());
		Thread.sleep(5000);
		driver.quit();
	}
	
/*	@DataProvider(name="LoginTestData")
	public Object[][] LoginData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="tutorial";
		data[0][1]="tutorial";
		
		data[1][0]="XYZ";
		data[1][1]="xyz123";
		
		return data;
	*/	
		
	}


