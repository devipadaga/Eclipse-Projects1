package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import LoginPage.LoginPage;

public class verifyValidLogin 
{
	@Test
	public void verifyLoginwithValidData()  {
	
	System.setProperty("window.chrome.driver", "c://chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/newtours/");
	driver.manage().window().maximize();
	//Thread.sleep(1000);
	
	
	LoginPage lp=new LoginPage(driver);
	
	lp.username();
	lp.password();
	lp.clickOnLoginButton();
	
	}
		
}
