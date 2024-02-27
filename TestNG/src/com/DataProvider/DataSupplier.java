package com.DataProvider;

import org.testng.annotations.DataProvider;

public class DataSupplier {
	
	//@DataProvider(indices= {0,2})
	@DataProvider
 	public String[] Dp1()
	{
  		String[] data=new String[]
				{
						"abcd",
						"123",
						"HELLO",
						"WELCOME"
						
				};
		return data;
		
	}
	

	@DataProvider
 	public String[] Dp2()
	{
  		String[] data=new String[]
				{
						"vizag",
						"elr",
						"Hyd",
						"Mysore"
						
				};
		return data;
		
	}
	

}
