package TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import drivers_guru.BaseClass;
//import junit.framework.Test;
import pages.Guru_LoginPage;

public class Guru_LoginTest extends BaseClass{
	
	
	Guru_LoginPage lp;
	
	

	@Test()
	//@Parameters({"Uname","Pwd"})
	public void Test()
	{		
		lp=new Guru_LoginPage();
		lp.Login(prop.getProperty("uname"),prop.getProperty("pwd"));
		
		
	}

}
