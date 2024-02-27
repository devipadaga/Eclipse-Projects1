package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;

public class FacebookTest extends BaseTest {
	
	@Test(priority=1)
	public void FrgotpwdTest()
	{
		testCaseID="3";
		System.out.println("Forgot pwd Test");
		Assert.assertTrue(driver.findElement(By.linkText("Forgotten password?")).isDisplayed());
		
		
	}

	@Test(priority=2)
	public void TextVerify()
	{
		testCaseID="4";
		Boolean text=driver.findElement(By.xpath("//h2[contains(text(),'connect')]")).isDisplayed();
		System.out.println(text);
		Assert.assertTrue(text);
	}
}
