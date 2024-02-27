package Listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.*;


@Listeners(ITestListenerClass.class)
public class TestListenerExample {

	WebDriver driver;
		
		@BeforeMethod
		public void Setup()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe" );
			 WebDriver driver=new ChromeDriver();
		}

		@Test
		public void Login()
		{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://demo.guru99.com/test/newtours/");
			driver.findElement(By.name("userName")).sendKeys("tutorial");
			driver.findElement(By.name("password")).sendKeys("tutorial");
			driver.findElement(By.name("submit")).click();
			
		}
		
		@Test
		public void TestToFail()
		{
			System.out.println("method to get fail");
			Assert.assertTrue(false);
		}
		
		@Test(timeOut=1000)
		public void Test() throws Exception
		{
			Thread.sleep(2000);
			System.out.println("Sample Method to test");
		}
		
		@AfterMethod
		public void teardown()
		{
			driver.quit();
		}
	}


