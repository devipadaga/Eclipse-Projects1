package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultsPAge_Amazon {
	
	WebDriver driver;

	
public ResultsPAge_Amazon(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	


	@FindBy(how=How.XPATH,using="//span[contains(text(),'iPhone 14. Big and bigger.') and @class='a-truncate-cut']")
	public WebElement text;
	
	public void verifyText()
	{
		String exp1="Amazon.in : iphone 14";
		String actual=text.getText();
		Assert.assertEquals(actual, exp1,"Navigated to iphone results");
	}

}
