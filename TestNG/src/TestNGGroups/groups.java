package TestNGGroups;

import org.testng.annotations.Test;

@Test(groups= {"AllClassTests"})
public class groups {
	
	@Test(groups= {"sanity"})
	public void Test1()
	{
		System.out.println("Test1");
	}
	
	@Test(groups= {"sanity","smoke"})
	public void Test2()
	{
		System.out.println("Test2");
	}
	
	@Test(groups= {"windows.regression"})
	public void Test4()
	{
		System.out.println("Test4");
	}
	
	
	@Test(groups= {"sanity","regression"})
	public void Test3()
	{
		System.out.println("Test3");
	}
}
