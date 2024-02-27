package TestCases;

import java.util.Properties;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils_guru.ExcelUtils;
import drivers_guru.BaseClass;
import pages.Guru_HomePage;
import pages.Guru_LoginPage;

public class Guru_HomePageTest extends BaseClass {
	
	
	Guru_LoginPage lp;
	Guru_HomePage hp;
	
	
	public Guru_HomePageTest()
	{
		super();
	}
	
	
	@BeforeMethod()		
	public void setUp() 
	{
		//setUp();
		lp = new Guru_LoginPage();
		hp=lp.Login(prop.getProperty("uname"),prop.getProperty("pwd"));
	}

	
	@Test()	
	public void check()
	{
		hp.getText();
	}
	
	@DataProvider()
	public Object[][] getNewCustData() throws Exception
	{
		
		Object[][] data=utils_guru.ExcelUtils.getTableData("C:\\Users\\SPURGE\\Documents\\GuruBank.xlsx", "NewCustomerRegistration" );
		return (data);	
	}
	
	@Test(dataProvider="getNewCustData")
	public void RegNewUser(String CustomerName,String Gender,String DateofBirth,String Address,String City,String State,
			String PIN,String MobileNumber,String Email,String Password) 
	{
		
		hp.createNewCust(CustomerName, Gender, DateofBirth, Address, City, State, PIN, MobileNumber, Email, Password); 
		
	}
	

}

