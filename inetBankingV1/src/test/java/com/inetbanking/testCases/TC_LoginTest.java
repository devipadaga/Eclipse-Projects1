package com.inetbanking.testCases;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetbanking.PageObjects.BaseClass;
import com.inetbanking.PageObjects.LoginPage;

public class TC_LoginTest extends BaseClass {
	
	Logger logger=Logger.getLogger(TC_LoginTest.class);
	LoginPage lp;

	@Test
	public void LoginTest()
	{
		
		logger.info("URL is opened");
		
		lp=new LoginPage();
		lp.Login(username,password);
		logger.info("User Logged-in Successfully and entered into HomePage");
		
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("LoginTest Passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("LoginTest Failed");
		}
		
	}

}
