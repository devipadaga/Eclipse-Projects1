package demo;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest
{
	
	WebDriver driver;
  @Test
  public void f()
  {
	  System.out.println("VERIFYING TEXT");
	  String actTitle=driver.getTitle();
	  //Assert.assertEquals(actTitle,"Tools QA","We are in Right Page");
	  driver.getPageSource().contains("Selenium Online Trainings");
	  System.out.println("VERIFIED TEXT");
	  
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("STARTING TEST ON CHROME BROWSER");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   driver.get("https://www.toolsqa.com/");
	   driver.manage().window().maximize();
	   
	  
  }

  @AfterMethod
  public void afterMethod()
  
  {
	  driver.close();
	  System.out.println("FINISHED TEST ON CHROME BROWSER");
  }

}
