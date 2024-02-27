package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;

	
	By username=By.name("userName");
	By password=By.name("password");
	By LoginButton=By.xpath("/tr//tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void username()
	{
		driver.findElement(username).sendKeys("tutorial");
		
	}
	public void password()
	{
		driver.findElement(password).sendKeys("tutorial");
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(LoginButton).click();
	}
	
	
	
	
}
