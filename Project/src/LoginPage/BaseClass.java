package LoginPage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utils.BrowseFactory;

public class BaseClass {
	
	WebDriver driver=null;
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
		driver=BrowseFactory.LaunchApp(driver,"Chrome","https://demo.guru99.com/test/newtours/");
	}
	@AfterClass
	public void teardown()
	{
		BrowseFactory.CloseApp(driver);
	}
	

}
