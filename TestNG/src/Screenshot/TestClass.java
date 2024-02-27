package Screenshot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.BaseTest;

public class TestClass extends BaseTest  {
	
	@Test
	public void TestGoogle() throws Exception
	{
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[normalize-space()='Documentation']")).click();
		System.out.println(driver.getTitle());
		String exp_title="Selenium";
		String act_title=driver.getTitle();
		
		Assert.assertEquals(act_title,exp_title);
		Thread.sleep(3000);
		driver.quit();
	
	}
	
	@Test
	public void TestOrangeHRM() throws Exception
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		Assert.assertTrue(driver.findElement(By.id("menu_admin_viewAdminModule")).isDisplayed());
		Thread.sleep(3000);
	}
	
	@Override
	public void CaptureScreenShot(String filename) throws Exception {
		// TODO Auto-generated method stub
		super.CaptureScreenShot(filename);
	}

}
