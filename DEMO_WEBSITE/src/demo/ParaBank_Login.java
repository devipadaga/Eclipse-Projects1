package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParaBank_Login {
	
	
	WebDriver driver;
	
	  @Test
	  public void Login() throws Exception
	  {
		  
		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("SowmyaPadaga");
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sowmya1@");
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//ul[@class='leftmenu']//li[6]//a")).click();
		  driver.findElement(By.xpath("//button[normalize-space()='Initialize']")).click();
		  
	  }
	  
	  @BeforeMethod
	  public void beforeMethod()
	  {
		  System.out.println("STARTING TEST ON CHROME BROWSER");
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   driver.get("https://parabank.parasoft.com/parabank/index.htm");
		   driver.manage().window().maximize();
		   
		  
	  }

	  @AfterMethod
	  public void afterMethod()
	  
	  {
		 // driver.close();
		  System.out.println("FINISHED TEST ON CHROME BROWSER");
	  }


}
