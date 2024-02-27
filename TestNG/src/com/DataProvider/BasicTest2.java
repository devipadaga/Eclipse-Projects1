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

public class BasicTest2 {
	
	WebDriver driver;
	
	@Test(dataProvider="Dp3")
	public void TestLogin(String s) throws Exception
	{
		System.out.println(s);
	}
	
  /*	@DataProvider()
 	public Object[] Dp1()
	{
		Object[] data=new Object[]
				{
						"abcd",
						"123",
						"HELLO",
						1
						
				};
		return data;
		
	}
	*/
	
	////////////////////////////////////////////////////////////////////////////
	
  /*	@DataProvider()
 	public Object[][] Dp2()
	{
		Object[][] data=new Object[][]
				{
						{"abcd","gvhg",1,123},
						{"123",987},                               
						{"HELLO",5,545}	
				};
				return data;
	}
	*/	
	
	//////////////////////////////////////////////////////////////////////////////
	@DataProvider()
	public Iterator<String> Dp3()
	{
		List<String> data=new ArrayList<>();
		data.add("Hiiiii.......");
		data.add("Hello");
		data.add("world");
	
	return data.iterator();
	}
	

}
