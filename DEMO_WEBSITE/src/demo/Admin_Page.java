package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Admin_Page extends ParaBank_Login{
	
	public static WebDriver driver;
	
	  @Test
	  public void Admin() throws Exception
	  {
		  
		  System.out.println("clicked on Admin Page");
		  driver.findElement(By.xpath("//ul[@class='leftmenu']//li[6]//a")).click();
		  driver.findElement(By.xpath("//button[normalize-space()='Initialize']")).click();
		  
	  }

}
