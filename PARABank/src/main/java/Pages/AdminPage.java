package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import drivers.BaseClass;

public class AdminPage extends BaseClass{
	
	By admin=By.xpath("//a[normalize-space()='Admin Page']");
	By init=By.xpath("//button[@class='button' and @value='INIT']");
	By radio=By.xpath("//input[@id='accessMode2' and @class='input']");
	By soapStart=By.id("soapEndpoint");
	By LoanProcessorEnd=By.id("endpoint");
	By initBal=By.name("initialBalance");
	By minBal=By.name("minimumBalance");
	
	//Select select=new Select(initBal);
	
	By LoanProvider=By.id("loanProvider");
	By LoanProcessor=By.id("loanProcessor");
	By btn=By.xpath("//input[@value='Submit']");
	
	
	public AdminPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Click()
	{
		driver.findElement(admin).click();
		driver.findElement(init).click();
		driver.findElement(radio).click();
	}
	
	public void WebService(int val1,int val2)
	{
		WebElement a=driver.findElement(soapStart);
		a.clear();
		a.sendKeys(String.valueOf(val1));
		
		WebElement b=driver.findElement(LoanProcessorEnd);
		b.clear();
		b.sendKeys(String.valueOf(val2));
		
		
	}
	
	public void AppSetting(int val3,int val4,
			String text1,String text2)
	{
		
		WebElement ele=driver.findElement(initBal);
		ele.clear();
		ele.sendKeys(String.valueOf(val3));
		
		WebElement ele1=driver.findElement(minBal);
		ele1.clear();
		ele1.sendKeys(String.valueOf(val4));
		
		WebElement ele2=driver.findElement(LoanProvider);
		Select sel=new Select(ele2);
		sel.selectByVisibleText(text1);
		
		WebElement ele3=driver.findElement(LoanProcessor);
		Select sel1=new Select(ele3);
		sel1.selectByVisibleText(text2);
	}
	
	public void clickSubmit()
	{
		driver.findElement(btn).click();
	}

}
