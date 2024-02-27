package TestCases;

import Pages.AdminPage;
import Pages.LoginPage;
import Pages.LocationsPage;
//import Pages.ServicesPage;
import drivers.BaseClass;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginTest extends BaseClass {
	
	LoginPage lp;
	AdminPage ap;
	LocationsPage sp;
	
	
	
//*******	below is with passing parameters through xml file
	
	
//	@Test(priority=0)
//	//@Parameters({"Uname","pword"})
//	public void Test(String Uname,String pword)
//	{
//		
//		lp=new LoginPage();
//		lp.Login(Uname,pword);
//		
//		
//	}
	
	//******below is with passing parameters with config
	
	@Test(priority=0)
	public void Test()
	{
		
		lp=new LoginPage();
		lp.Login(prop.getProperty("Uname"),prop.getProperty("Pword"));
			
	}
	

	@Test(priority=1)
	@Parameters({"val1","val2","val3","val4","text1","text2"})
	public void clickonAdmin(int val1,int val2,int val3,int val4,
			String text1,String text2)
	{
		ap=new AdminPage();
		ap.Click();
		ap.WebService(val1, val2);
		ap.AppSetting(val3, val4, text1, text2);
		ap.clickSubmit();
		
	}
	
	@Test(priority=2)
	public void actions() throws InterruptedException
	{
		sp=new LocationsPage();
		sp.clickonLOC();
		sp.ACTIONonRESOURCES();
	}
	
	
	

}
