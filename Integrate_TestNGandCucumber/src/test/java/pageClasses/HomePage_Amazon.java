package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Amazon {
	
	 WebDriver driver;

	public HomePage_Amazon(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@id='twotabsearchtextbox' and @name='field-keywords']")
	public WebElement SearchBar;
	
	@FindBy(how=How.ID,using="nav-search-submit-button")
	public WebElement SearchBtn;
	
	
	
	public void send()
	{
		SearchBar.sendKeys("iphone 14");
		SearchBtn.click();
	}
	
	
	
	

}
