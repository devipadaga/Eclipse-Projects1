package CrossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Test1 {
	
	WebDriver driver;

		@BeforeMethod
		@Parameters("browser")
		public void Setup(String browser) throws Exception 
		{
			if (browser.equals("chrome"))
			{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe" );
			driver=new ChromeDriver();
			}
			
			else if(browser.equals("firefox"))
			{
				System.setProperty("webdriver.firefox.driver","C:\\Users\\SPURGE\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe" );
				driver=new FirefoxDriver();
			}
			
			else if(browser.equals("edge"))
			{
				System.setProperty("webdriver.edge.driver","C:\\Users\\SPURGE\\Downloads\\edgedriver_win64\\msedgedriver.exe" );
				driver=new EdgeDriver();
			}
			else
			{
				throw new Exception("Incorrect Browser");	
			}
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		
		@Test
		@Parameters({"Username","Password"})
		public void Login(String Username,String Password) throws Exception
		{
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.findElement(By.id("txtUsername")).sendKeys(Username);
			driver.findElement(By.id("txtPassword")).sendKeys(Password);
			driver.findElement(By.name("Submit")).click();
			Assert.assertTrue(driver.findElement(By.id("menu_admin_viewAdminModule")).isDisplayed());
			Thread.sleep(3000);
		}
		
		@AfterMethod()
		public void teardown()
		{
			driver.close();
		}
		
}	
	


