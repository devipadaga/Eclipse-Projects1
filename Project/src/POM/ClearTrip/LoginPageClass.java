package POM.ClearTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageClass extends BaseClass {
	
	
	
	
	By Login_Btn=By.xpath("//p[contains(text(),'Log in')]");
	By Login__Sign_UP=By.xpath("//button[normalize-space()='Log in / Sign up']");
	By continue_Email=By.xpath("//span[contains(text(),'Continue with Email')]");
	By email=By.xpath("//input[@placeholder='Enter registered email address']");
	By password=By.xpath("//input[@placeholder='Enter password']");
	By Login=By.xpath("//span[@class='fs-3 fw-550']");
	
	public LoginPageClass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void Login_Btn()
	{
		driver.findElement(Login_Btn).click();
	}
	

	public void Login__Sign_UP()
	{
		driver.findElement(Login__Sign_UP).click();
	}
	

	public void continue_Email()
	{
		driver.findElement(continue_Email).click();
	}
	

	public void email(String Username)
	{
		driver.findElement(email).sendKeys(Username);
	}
	

	public void password(String Password)
	{
		driver.findElement(password).sendKeys(Password);
	}
	

	public void Login()
	{
		driver.findElement(Login).click();
	}
	
	

}
