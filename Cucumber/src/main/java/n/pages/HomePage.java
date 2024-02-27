package n.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class HomePage {
	
	private WebDriver driver;
	
	// 1.By Locators
	private By Flights=By.xpath("(//a[normalize-space()='Flights'])[1]");
	private By Radiobtn=By.xpath("//a[normalize-space()='SIGN-OFF']");
//	private By ele=By.xpath("//input[@value='oneway']");
	
	//2.Constructor of the Homepage class
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//3.Methods	
	public String HomePageTitle()
	{
		return driver.getTitle();
	}
	
	public void clickonLinkFlights()
	{
		driver.findElement(Flights).click();
		Actions act=new Actions(driver);
		act.moveByOffset(100, 250).perform();
		act.click().perform();
		//driver.findElement(ele).click();
	}
	
	public void ClickRadioBtn()
	{
		
		driver.findElement(Radiobtn).click();
		//Assert.assertTrue(name.contains("Flight Details"));
		//Radiobtn.cl
		//return name;
	}

}
