package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegPage;
import Utils.ExcelUtils;
import Utils.TestUtils;
import drivers.BaseClass;

public class RegPageTest extends BaseClass {
	
	
	RegPage rp;
	LoginPage lp;
	TestUtils TU;
	
	//Properties prop;
	
	
	public RegPageTest()
	{
		super();
	}
	
	@BeforeMethod()
	public void setUp() 
	{
		Setup();
		TU=new TestUtils();
		rp = new RegPage();
		rp.click_On_RegLink();
		
	}
	
	@DataProvider()
	public Object[][] getRegData() throws Exception
	{
		
		Object[][] data=ExcelUtils.getTableData("C:\\Users\\SPURGE\\Documents\\ParaBank1.xlsx", "RegData" );
		return (data);	
	}
	
	@Test(dataProvider="getRegData")
	public void RegNewUser(String Fname,String LName,String Addr,String City,String State,String Zipcode,
			String Phone,String SSN,String Uname,String Pass,String Cpass) 
	{
		
		rp.Register(Fname,LName,Addr,City,State,Zipcode,Phone,SSN,Uname,Pass,Cpass);
		rp.ClickRegister();
	}

	
	@AfterMethod()
	public void TearDown()
	{
		driver.quit();
	}
	

}
