package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import drivers_guru.BaseClass;

public class Guru_HomePage extends BaseClass{
	
	
	private By text=By.cssSelector("marquee[class='heading3']");
	private By newCust=By.linkText("New Customer");
	private By CustName=By.xpath("//input[@name='name']");
	private By radio=By.xpath("//input[@name='rad1' and @value='f']");
	private By DOB=By.xpath("//input[@name='dob']");
	private By Address=By.cssSelector("textarea[name='addr']");
	private By City=By.xpath("//input[@name='city']");
	private By State=By.xpath("//input[@name='state']");
	private By PIN=By.xpath("//input[@name='pinno']");
	private By MobileNum=By.xpath("//input[@name='telephoneno']");
	private By Email=By.xpath("//input[@name='emailid']");
	private By Password=By.xpath("//input[@name='password']");
	private By submit=By.xpath("//input[@name='sub']");
	
	
	
	
	public Guru_HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	public String getText()
	{
		String textmsg=driver.findElement(text).getText();
		System.out.println(textmsg);
		return textmsg;
		
	}
	
	public void createNewCust(String CustN,String radi0,String dob,String addr,String city,String state,
			String pin,String mobileno,String email,String pass)
	{
		driver.findElement(newCust).click();
		driver.findElement(CustName).sendKeys(CustN);
		driver.findElement(radio).click();
		driver.findElement(DOB).sendKeys(dob);
		driver.findElement(Address).sendKeys(addr);
		driver.findElement(City).sendKeys(city);
		driver.findElement(State).sendKeys(state);
		driver.findElement(PIN).sendKeys(pin);
		driver.findElement(MobileNum).sendKeys(mobileno);
		driver.findElement(Email).sendKeys(email);
		driver.findElement(Password).sendKeys(pass);
		driver.findElement(submit).click();
		
	}
	


}
