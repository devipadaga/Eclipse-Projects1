package POM.ClearTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePageClass extends BaseClass  {
	
	
	By text=By.xpath("//h2[normalize-space()='Fly anywhere. Fly everywhere.']");
	By adults=By.xpath("//div[@class='mb-4']//select");
	
	
	public HomePageClass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void text(String Text)
	{
		String data=driver.findElement(text).getText();
		Assert.assertEquals(text, data);
		System.out.println("USER IS IN HOME PAGE");
	}
	
	public void adults()
	{
		
		Select select=new Select(driver.findElement(adults));
		select.selectByValue("10");
		
	}
}
