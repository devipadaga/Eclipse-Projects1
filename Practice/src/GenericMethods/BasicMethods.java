package GenericMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicMethods {
	WebDriver driver;
	
	//method to click
	
	public void elementToclick(WebElement element,long waitTimeinSeconds)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(waitTimeinSeconds));
		WebElement elements=null;
		elements=wait.until(ExpectedConditions.elementToBeClickable(element));
		elements.click();
		
	}
		
	//sendKeys
	
	public void sendKeysonWebElement(WebElement element,String text)
	{
		element.click();
		element.clear();
		element.sendKeys(text);
	}
	
	//method for selecting dropdownlist
	
	public void SelectByVisibleText(WebElement element,String text)
	{
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	//accepting an alaert
	
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();;
		
	}
	
	//dismiss an alert
	public void DismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	
	//mouse hovering from one element to other
	
	public void mouseHoverAndClickElement(WebElement element,String text)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).click().build().perform();;
	}
	
	
	//getWindowHandleMethod
	public String getCurrentWindowID()
	{
		return driver.getWindowHandle();
		
	}
}
	
	
