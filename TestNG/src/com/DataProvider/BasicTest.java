package com.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	driver.get("https://demo.guru99.com/test/newtours/");
		driver.get("https://opensource-demo.orangehrmlive.com/");		
	}
	
	
	@Test(dataProvider="test")
	public void TestLogin(String Username,String Password) throws Exception
	{
		WebElement ele1=driver.findElement(By.name("txtUsername"));
		//ele1.clear();
		ele1.sendKeys(Username);
		WebElement ele2=driver.findElement(By.name("txtPassword"));
		//ele2.clear();
		ele2.sendKeys(Password);
		driver.findElement(By.name("Submit")).click();
		
		Assert.assertTrue(driver.findElement(By.id("menu_admin_viewAdminModule")).isDisplayed());
		Thread.sleep(5000);
		
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	
	@DataProvider(name="test")
	public Object[][] LoginData()
	{
		Object[][] data=new Object[6][2];
		
		data[0][0]="XYZ";
		data[0][1]="xyz123";
		
		data[1][0]="Admin";
		data[1][1]="admin123";
		
		data[2][0]="stage";
		data[2][1]="stage123";
		
		data[3][0]="hello";
		data[3][1]="hello123";
		
		data[4][0]="kkk";
		data[4][1]="kkk123";
		
		data[5][0]="jjj";
		data[5][1]="jjj123";
		
		return data;
		
		
	}

}
