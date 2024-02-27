package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

import drivers.BaseClass;

public class HomePage extends BaseClass {
	
	
	By TransferFund=By.linkText("Transfer Funds");
	By amt=By.id("amount");
	By frmact=By.id("fromAccountId");
	By ToAct=By.id("toAccountId");
	
	
	
	By billpay=By.linkText("Bill Pay");
	
		
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void fundTransfer(int val1,int val2,int val3) throws InterruptedException
	{
		driver.findElement(TransferFund).click();
		Thread.sleep(2000);
		driver.findElement(amt).sendKeys(String.valueOf(val1));
		
		WebElement ele1=driver.findElement(frmact);
		Select select=new Select(ele1);
		select.selectByIndex(val2);
		
		WebElement ele2=driver.findElement(ToAct);
		Select select1=new Select(ele2);
		select1.selectByVisibleText(String.valueOf(val3));		
	}
	
	
	public BillPay Clickbillpay()
	{
		driver.findElement(billpay).click();
		return new BillPay();
	}
	
	
	
	

}
