package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test2 {
	
	
	WebDriver driver;
	  @Test
	  public void f() throws Exception
	  {
		  driver.findElement(By.xpath("//a[text()='Register']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("customer.firstName")).sendKeys("Sowmya");
		  driver.findElement(By.id("customer.lastName")).sendKeys("Padaga");
		  driver.findElement(By.id("customer.address.street")).sendKeys("Balaji Hills,Boduppal");
		  driver.findElement(By.name("customer.address.city")).sendKeys("Hyderabad");
		  driver.findElement(By.name("customer.address.state")).sendKeys("Telangana");
		  driver.findElement(By.name("customer.address.zipCode")).sendKeys("500039");
		  driver.findElement(By.name("customer.phoneNumber")).sendKeys("9876543210");
		  driver.findElement(By.name("customer.ssn")).sendKeys("123");
		  
		  driver.findElement(By.name("customer.username")).sendKeys("SowmyaPadaga");
		  driver.findElement(By.name("customer.password")).sendKeys("Sowmya1@");
		  driver.findElement(By.name("repeatedPassword")).sendKeys("Sowmya1@");
		  driver.findElement(By.xpath("//input[@value='Register']")).click();
		  Thread.sleep(3000);
		  
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
		  driver.close();
		  System.out.println("FINISHED TEST ON CHROME BROWSER");
	  }

}
