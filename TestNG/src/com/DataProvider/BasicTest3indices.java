package com.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class BasicTest3indices {
	
	WebDriver driver;
	
	@Test(dataProvider="Dp1",dataProviderClass=DataSupplier.class)
	public void TestLogin(String s) throws Exception
	{
		System.out.println(s);
	}
	
  		

}
