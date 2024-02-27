package utils;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

//import zmq.ZError.IOException;

public class BaseTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	@Test
	public void CaptureScreenShot(String filename) throws Exception 
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		File destfile=new File("C:\\Users\\SPURGE\\SCREENSHOT"+filename);
			try 
			{
				FileUtils.copyFile(srcfile, destfile);
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			System.out.println("ScreenShot successfully Saved........");
			
		}
}	
		




