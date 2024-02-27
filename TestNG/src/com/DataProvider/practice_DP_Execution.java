package com.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class practice_DP_Execution {
	
	
	@Test(dataProvider="getData",dataProviderClass=practice_DP.class)
	public void setData(String Username,String Password)
	{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.name("txtUsername")).sendKeys(Username);
	driver.findElement(By.name("txtPassword")).sendKeys(Password);
	driver.findElement(By.name("Submit")).click();
	
	if(driver.getTitle().equals("Orange HRM"))
	{
		System.out.println("LOGIN SUCCESSFULLY");
		driver.quit();
	}
	else
	{
		System.out.println("Login Failed");
	}

//	driver.quit();
}
}
