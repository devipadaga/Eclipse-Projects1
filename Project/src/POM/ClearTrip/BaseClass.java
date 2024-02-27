package POM.ClearTrip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {
	
	public static WebDriver driver=null;
	
	@BeforeClass
	public  void LaunchApp()
	{
		System.setProperty("webDriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
	}

	@AfterClass
	public void TearDown()
	{
		driver.quit();
	}
}
