package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LoginPage.BaseClass;
import LoginPage.LoginPage_Mercurytours;
import Utils.BrowseFactory;

public class LoginTestMercury_Tours extends BaseClass{
	
	WebDriver driver;
	
	@Test
	public void LoginApp() throws Exception 
	{
			LoginPage_Mercurytours  Lp=PageFactory.initElements(driver,LoginPage_Mercurytours.class);
			Lp.loginToMercury("tutorial", "tutorial");			
	}
	

	
	
	

}
