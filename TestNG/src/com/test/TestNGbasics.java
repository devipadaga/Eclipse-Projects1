package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGbasics {
	
	@BeforeSuite
	public void SetUp()
	{
		System.out.println("Chrome Setup");
	}
	@BeforeClass
	public void LaunchBrowser()
	{
		System.out.println("launch the browser");
	}


	@BeforeTest
	public void EnterURL()
	{
		System.out.println("Enter the URL");
	}
	@BeforeMethod
	public void Login ()
	{
		System.out.println("Login ");
	}
	@Test
	public void GoogleTitleTest()
	{
		System.out.println("Google title test");
	}
	@Test
	public void SearchTest()
		{
			System.out.println("Search test");
		}
	@AfterMethod
	public void logout()
	{
		System.out.println("logout");
	}
	@AfterTest
	public void DeleteCookies()
	{
		System.out.println("Del the cookies");
	}
	@AfterClass
	public void TearDown()
	{
		System.out.println("Close the browser");
	}
	
	@AfterSuite
	public void GenerateReports()
	{
		System.out.println("Generate the reports");
	}
	
}
