package com.ddt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.data.ReadfromExcel;
import com.data.XlsReader;

public class parameterizationTest extends ReadfromExcel {

	public static void main(String[] args) throws Exception  {
		
		//webdriver code
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		

		File file=new File("C:\\Users\\SPURGE\\Documents\\FacebookData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("SignUPTestData");
		
		int noOfRows=sheet.getLastRowNum();
		System.out.println("no. of rows:"+noOfRows);
		
		for(int i=1;i<=noOfRows;i++)
		{
			XSSFRow row=sheet.getRow(i);
			
		/*	XSSFCell firstname=row.getCell(0);
			String fname=firstname.getStringCellValue();
			
			XSSFCell surname=row.getCell(1);
			String sname=surname.getStringCellValue();
			
			XSSFCell mobilenumber=row.getCell(2);
			int mobilenum=(int) mobilenumber.getNumericCellValue();
			
			XSSFCell newpassword=row.getCell(3);
			String pass=newpassword.getStringCellValue();
			
			XSSFCell date=row.getCell(4);
			int d=(int) date.getNumericCellValue();
			
			XSSFCell month=row.getCell(5);
			String m=month.getStringCellValue();
			
			XSSFCell year=row.getCell(6);
			int y=(int) year.getNumericCellValue();
			*/
			
			String firstname = row.getCell(0).getStringCellValue();
			String surname = row.getCell(1).getStringCellValue();
			int mobilenumber = (int)row.getCell(2).getNumericCellValue();
			System.out.println(mobilenumber);
			String newpassword = row.getCell(3).getStringCellValue();
			int date = (int) row.getCell(4).getNumericCellValue();
			String month = row.getCell(5).getStringCellValue();
			int year = (int)row.getCell(6).getNumericCellValue();
			
			
		
		
		
	/*	//get data from excel
		XlsReader reader=new XlsReader("C:\\Users\\SPURGE\\Documents\\FacebookData.xlsx");
		int rowCount=reader.getRowCount("SignUPTestData");
	*/	
		
	/*	//parameterization
		for(int rowNum=2;rowNum<=rowCount;rowNum++)
		{
			String firstname=reader.getCellData("SignUPTestData", "firstname", rowNum);
			System.out.println(firstname);
			
			String surname=reader.getCellData("SignUPTestData", "surname", rowNum);
			System.out.println(surname);
			
			String mobilenumber=reader.getCellData("SignUPTestData", "mobilenumber", rowNum);
			System.out.println(mobilenumber);
			
			String newpassword=reader.getCellData("SignUPTestData", "newpassword", rowNum);
			System.out.println(newpassword);
			
			String date=reader.getCellData("SignUPTestData", "date", rowNum);
			System.out.println(date);
			
			String month=reader.getCellData("SignUPTestData", "month", rowNum);
			System.out.println(month);
			
			String year=reader.getCellData("SignUPTestData", "year", rowNum);
			System.out.println(year);
			
			String gender=reader.getCellData("SignUPTestData", "gender", rowNum);
			System.out.println(gender);
			
		*/
			
			//enter data
			
			driver.findElement(By.name("firstname")).clear();
			driver.findElement(By.name("firstname")).sendKeys(firstname);
				
			driver.findElement(By.name("lastname")).clear();
			driver.findElement(By.name("lastname")).sendKeys(surname);
			
			driver.findElement(By.name("reg_email__")).clear();
			driver.findElement(By.name("reg_email__")).sendKeys(String.valueOf(mobilenumber));
			
			driver.findElement(By.name("reg_passwd__")).clear();
			driver.findElement(By.name("reg_passwd__")).sendKeys(String.valueOf(newpassword));
			
			Select select=new Select(driver.findElement(By.name("birthday_day")));
			select.selectByValue(String.valueOf(date));
			
			Select select1=new Select(driver.findElement(By.name("birthday_month")));
			select1.selectByValue(month);
			
			Select select2=new Select(driver.findElement(By.name("birthday_year")));
			select2.selectByValue(String.valueOf(year));
			
			
			
			
			
		}
		

	}

}
