package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_Mercurytours {
	
	WebDriver driver;
	
	public LoginPage_Mercurytours(WebDriver ldriver)
	{
		this.driver=ldriver;
	}

	@FindBy(name="userName") 
	WebElement uname;
	@FindBy(name="password") 
	WebElement pass;
	@FindBy(xpath="/tr//tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input") 
	WebElement LoginButton;
	
	
	
	public void loginToMercury(String unameApp,String passwordApp)
	{
		uname.sendKeys(unameApp);
		pass.sendKeys(passwordApp);
		LoginButton.click();
		
		
	}
	
	
	
	
}
