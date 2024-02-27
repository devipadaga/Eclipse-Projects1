package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AppUtils {
	
	@BeforeSuite
	public static void launchApp()
	
	{
		System.out.println("Launch Gmail APP");
	}
	@AfterSuite
	public static void ClosApp()
	
	{
		System.out.println("Close Gmail APP");
	}

	@BeforeTest
	public static void Login()
	{
		System.out.println("Gmail LOGIN");
	}

	@BeforeTest
	public static void Logout()
	{
		System.out.println("Gmail LOGOUT");
	}

}



