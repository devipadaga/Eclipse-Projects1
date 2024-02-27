package n.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	// By Locators
	private By uname=By.name("userName");
	private By pword=By.name("password");
	private By submit=By.name("submit");
	private By link=By.xpath("//b[contains(text(),'sign-in here')]");
	
	
	//Constructor of the Loginpage class
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//PageActions/Methods
	

	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean isLinkExists()
	{
		return driver.findElement(link).isDisplayed();
	}
	
	
	public void enterUserName(String username)
	{
		driver.findElement(uname).sendKeys(username);
	}
	
	public void enterPassword(String Password)
	{
		driver.findElement(pword).sendKeys(Password);
	}
	
	public void ClickSubmitButton()
	{
		driver.findElement(submit).click();
	}
	
	
	public HomePage doLogin(String user,String pass)
	{
		driver.findElement(uname).sendKeys(user);
		driver.findElement(pword).sendKeys(pass);
		driver.findElement(submit).click();
		
		return new HomePage(driver);
	}
	
	
	
	
}
