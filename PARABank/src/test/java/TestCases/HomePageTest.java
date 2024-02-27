package TestCases;

import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.*;

import Pages.HomePage;
import Pages.LoginPage;
import drivers.BaseClass;

public class HomePageTest extends BaseClass{
	
	
	LoginPage lp;
	HomePage hp;
	//Properties prop;
	
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod()
	public void setUp() 
	{
		Setup();
		lp = new LoginPage();
		hp = lp.Login(prop.getProperty("Uname"), prop.getProperty("Pword"));		
	}
	
	
	@Test(dataProvider="Transferf")
	public void TFtest(int val1,int val2,int val3) throws InterruptedException
	{
		
		hp.fundTransfer(val1, val2, val3);		
	}

	
	@AfterMethod()
	public void TearDown()
	{
		driver.quit();
	}
	
	
	@DataProvider(name="Transferf")
	public Object[][] getData()
	{
		Object[][] data=new Object[1][3];
		
			
			data[0][0]=123456;
			data[0][1]=0;
			data[0][2]=15120;
			
			return data;
		
		
	}	
}


















