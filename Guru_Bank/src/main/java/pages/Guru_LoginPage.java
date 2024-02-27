package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import drivers_guru.BaseClass;

public class Guru_LoginPage extends BaseClass {
	
	
	
	private By userid=By.xpath("//input[@type='text']");
	private By password=By.xpath("//input[@type='password']");
	private By login=By.xpath("//input[@type='submit']");
	
	
	
	public Guru_LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String getTitle(String title)
	{
		return title;
	}

	
	public Guru_HomePage Login(String uname,String pwd)
	{
		driver.findElement(userid).sendKeys(uname);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(login).click();
		
		
		
		return new Guru_HomePage();
	}
	
	

}
