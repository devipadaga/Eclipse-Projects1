package orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{

	//Define Elements	
	@FindBy(id="txtUsername")
	WebElement uid_element;
	
	@FindBy(name="txtPassword")
	WebElement pwd_element;
	
	@FindBy(xpath="//*[@value='LOGIN']")
	WebElement login_element;
	
	@FindBy(linkText="Admin")
	WebElement admin_element;
	
	@FindBy(partialLinkText="Welcome")
	WebElement welcome_element;
	
	@FindBy(linkText="Logout")
	WebElement logout_element;
	
	
	//Define Methods
	
	public void login(String uname,String pword)	
	{
		uid_element.sendKeys(uname);
		pwd_element.sendKeys(pword);
		login_element.click();
	}
	
	public boolean isAdminModuleDisplayed()
	{
		if(admin_element.isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}

	public void logout()
	{
		welcome_element.click();
		logout_element.click();
	}
	
}
