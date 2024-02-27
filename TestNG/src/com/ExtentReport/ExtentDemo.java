package com.ExtentReport;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class ExtentDemo {
	
		
	static ExtentTest test;
	static ExtentReports report;
	
	@BeforeMethod
	public static void startTest()
	{
	report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
	test = report.startTest("ExtentDemo");
	}
	
	@Test
	public void extentReportsDemo() throws IOException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.abhibus.com/");
	System.out.println(driver.getTitle());
	if(driver.getTitle().equals("Books Bus Tickets Online at Lowest Fare, Flat ₹500 Cashback On Bus Booking | AbhiBus"))
	{
	test.log(LogStatus.PASS, "Navigated to the specified URL");
	}
	else
	{
	test.log(LogStatus.FAIL, "Test Failed");
	}
	
	test.log(LogStatus.FAIL,test.addScreenCapture(capture(driver))+ "Test Failed");
	
	
	
	}
	@AfterClass
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}
	
		public static String capture(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/../ErrImages/" + System.currentTimeMillis()
		+ ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
		}
	}


