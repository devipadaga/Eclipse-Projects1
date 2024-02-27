package ParallelTest;

import org.testng.annotations.Test;

public class TestClass3 {
	
	@Test
	public void testMethod8()
	{
		System.out.println("Testclass3>>testMethod8>>"+Thread.currentThread().getId());
	}

	@Test
	public void testMethod9()
	{
		System.out.println("Testclass3>>testMethod9>>"+Thread.currentThread().getId());
	}


}
