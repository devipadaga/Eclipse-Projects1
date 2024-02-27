package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import drivers.BaseClass;

public class LocationsPage extends BaseClass {
	
	
	@FindBy(xpath="//ul//a[normalize-space()='Locations']")
	WebElement locations;
	
	@FindBy(linkText="Solutions")
	WebElement element;
	
	@FindBy(linkText="Industries")
	WebElement element1;
	
	@FindBy(xpath="(//a[normalize-space()='Decline'])[1]")
	WebElement alert;
	
	@FindBy(linkText="Resources")
	WebElement element2;
	
	
	public LocationsPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickonLOC() throws InterruptedException
	{
		locations.click();
		element.click();
		Thread.sleep(4000);
		
		alert.click();
		
		Actions action=new Actions(driver);
		action.moveToElement(element1).build().perform();;
		//action.
		Thread.sleep(5000);
	}
	
	public void ACTIONonRESOURCES()
	{
		element2.click();
		
		String text=driver.getPageSource();
		text.contains("Software Testing Help From the Experts");
		Assert.assertTrue(true, text);
	}

}
