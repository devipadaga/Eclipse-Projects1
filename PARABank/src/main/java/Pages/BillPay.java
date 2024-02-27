package Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import drivers.BaseClass;

public class BillPay extends BaseClass{
	

//	@FindBy(xpath="//input[@name='payee.name']")
//	WebElement name;
//	
	By name=By.xpath("//input[@name='payee.name']");
	By addr=By.xpath("//input[@name='payee.address.street']");
	By city=By.xpath("//input[@name='payee.address.city']");
	By state=By.xpath("//input[@name='payee.address.state']");
	By zipcode=By.name("payee.address.zipCode");
	By phne=By.name("payee.phoneNumber");
	By acc=By.name("payee.accountNumber");
	By verifyacc=By.name("verifyAccount");
	By amt=By.name("amount");
	By frmacc=By.name("fromAccountId");
	By sendPay=By.xpath("//input[@value='Send Payment']");
	
	
	public BillPay()
	{
		PageFactory.initElements(driver,this);
	}

	
	public void BillPayMethod(String PayeeName,String Address,String City,String State,String ZipCode,
			String Phone,String Account,String VerifyAcc,String Amount,String FromAmount)
	{

	
	
//			String PayeeName=row.getCell(0).getStringCellValue();
//			String Address=row.getCell(1).getStringCellValue();
//			String City=row.getCell(2).getStringCellValue();
//			String State=row.getCell(3).getStringCellValue();
//			double ZipCode= row.getCell(4).getNumericCellValue();
//			double Phone=row.getCell(5).getNumericCellValue();
//			String Account=row.getCell(6).getStringCellValue();
//			String VerifyAcc=row.getCell(7).getStringCellValue();
//			double Amount=row.getCell(8).getNumericCellValue();
//			double FromAmount=row.getCell(9).getNumericCellValue();
//		
		
			
		driver.findElement(name).sendKeys(PayeeName);
		driver.findElement(addr).sendKeys(Address);
		driver.findElement(city).sendKeys(City);
		driver.findElement(state).sendKeys(State);
		driver.findElement(zipcode).sendKeys(ZipCode);
		driver.findElement(phne).sendKeys(Phone);
		driver.findElement(acc).sendKeys(Account);
		driver.findElement(verifyacc).sendKeys(VerifyAcc);
		driver.findElement(amt).sendKeys(Amount);
		driver.findElement(frmacc).sendKeys(FromAmount);
		
		
		
		
		
	}	
	
	
	public void ClickonSendPayment()
	{
		driver.findElement(sendPay).click();
	}
		
}	


