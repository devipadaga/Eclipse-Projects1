package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

import drivers.BaseClass;

public class LoginPage extends BaseClass {
	
	//url:https://parabank.parasoft.com/parabank/index.htm
	//Uname=DeviDevi
	//Pword=Devi

	
	private By username=By.xpath("//input[@name='username']");
	private By password= By.xpath("//input[@name='password']");
	private By btn=By.xpath("//input[@type='submit']");
	
	
	
	public LoginPage()
	{
		//this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public String getTitle(String title)
	{
		return title;
	}

	public HomePage Login(String Uname,String Pword)
	{
		driver.findElement(username).sendKeys(Uname);
		driver.findElement(password).sendKeys(Pword);
		driver.findElement(btn).click();
		
		return new HomePage();
		
		
	
		
	}
	
	
	
	
	

}
