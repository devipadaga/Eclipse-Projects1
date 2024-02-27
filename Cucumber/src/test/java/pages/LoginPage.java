package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By txt_username=By.name("userName");
	By txt_password=By.name("password");
	By btn_submit=By.name("submit");
	By Element=By.xpath("//a[normalize-space()='SIGN-OFF']");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
		/*if(!driver.getTitle().equals("Welcome:Mercury Tours"))
		{
			throw new IllegalStateException("This is not Login Page.The current Page is"+driver.getCurrentUrl());
		}*/
	}
	
	
	public void enterUsername(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
			
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
			
	}
	public void clickSubmit()
	{
		driver.findElement(btn_submit).click();
			
	}
	
	public void ElementCheck()
	{
		driver.findElement(Element).isDisplayed();
	}
	
	
	
	
	
}
