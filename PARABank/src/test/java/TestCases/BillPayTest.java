package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import Pages.BillPay;
import Pages.HomePage;
import Pages.LoginPage;
import Utils.ExcelUtils;
import drivers.BaseClass;

public class BillPayTest extends BaseClass{
	
	LoginPage lp;
	HomePage hp;
	BillPay bp;
	
	
	
	public BillPayTest()
	{
		super();
	}
	

	@BeforeMethod()
	public void setUp() 
	{
		Setup();
		
		lp = new LoginPage();
		hp = lp.Login(prop.getProperty("Uname"), prop.getProperty("Pword"));
		bp=new BillPay();
		bp=hp.Clickbillpay();
		
			
	}
	
	
	
	
	@Test(priority=1,dataProvider="getData")
	public void pay(String PayeeName,String Address,String City,String State,String ZipCode,
			String Phone,String Account,String VerifyAcc,String Amount,String FromAccount) throws Exception
	{
		Thread.sleep(3000);
		bp.BillPayMethod(PayeeName, Address, City, State, ZipCode, Phone, Account, VerifyAcc, Amount, 
				FromAccount);
			
		
	}
	
	@Test(priority=2)
	public void ClickonSendPayment()
	{
		bp.ClickonSendPayment();
	}
	
	@AfterMethod()
	public void TearDown()
	{
		driver.quit();
	}
	
	
//	@DataProvider()
//	public String[][] getData() throws Exception
//	{
//		
//		File file=new File("C:\\Users\\SPURGE\\Documents\\ParaBank.xlsx");
//		System.out.println(file.exists());
//		FileInputStream fis=new FileInputStream(file);
//		XSSFWorkbook workbook= new XSSFWorkbook(fis);
//		XSSFSheet sheet=workbook.getSheet("BillPay");
//		
//		int noOfRows=sheet.getLastRowNum();
//		System.out.println("no. of rows:"+noOfRows);
//		
////		for(int i=1;i<=noOfRows;i++)
////		{
////			XSSFRow row=sheet.getRow(i);
////			
//			int rows=sheet.getPhysicalNumberOfRows();
//			System.out.println("No.of rows in excel sheet are:"+rows );
//			
//			int columns=sheet.getRow(0).getLastCellNum();
//			System.out.println("No.of columns in 1st row are:"+columns );
//			
//			String[][] data=new String[rows-1][columns];
//			
//			for(int i=0;i<rows-1;i++)
//			{
//				for(int j=0;j<columns;j++)
//				{
//				
//					DataFormatter df=new DataFormatter();
//					data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
//					
//				//	System.out.println(sheet.getRow(i).getCell(j).getStringCellValue()+" ");
//					
//				}
//				System.out.println();
//			}
//			workbook.close();
//			fis.close();
//			
//			return data;
//	}	
//

	@DataProvider()
	public Object[][] getData() throws Exception
	{
		
		Object[][] data=ExcelUtils.getTableData("C:\\Users\\SPURGE\\Documents\\ParaBank1.xlsx", "BillPay" );
		return (data);	
	}
}
