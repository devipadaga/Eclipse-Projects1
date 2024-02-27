package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseTest;

public class OrangeHRM extends BaseTest {
	
	@Test
	public void loginTest()
	{
		
		testCaseID="6";
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		boolean flag=true;
		boolean user=driver.findElement(By.xpath("//li[@class='oxd-userdropdown']")).isDisplayed();
		
		
		if(user==flag)
		{
			System.out.println("user navigated to HomePage");
		}
		
		else
		{
			System.out.println("Wrong Credentials.....");
		}
	}

}
