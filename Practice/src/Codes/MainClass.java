package Codes;

//public class Final {

	
	class A
	{

	 String s = "Class A";

	}
	
	class B extends A
	{
		
	 String s = "Class B";
	 
	 {
		 System.out.println(super.s);
	 }
	}
	class C extends B
	{

	String s = "Class C";
	{
		System.out.println(super.s);
	}

	}
	public class MainClass
	{
	public static void main(String[] args)
	{
	 C c = new C();
	System.out.println(c.s);
	
	
	}


	}
	

	
//	class MainClass
//	{
//		public static void main (String arg[])
//		{
//			System.out.print( func() );
//			System.out.println();
//		}
//		static int func()
//		{
//			int test = 100;
//			return test;
//		}
//	}

	
//
//    final int assign = 30;    
//
//
//	public static void main(String[] args) {
//		
//		final int result = 20;
//		        final int assign;
//		        
//		        Final f = new Final();
//		        assign = 20;
//
//		        System.out.println(assign);
//		        System.out.println(f.assign);
//		        System.out.println(f.process(result));
//		    }
//
//		    int process(int a)
//		    {
//		        return a + 5;
//		    }
//
//		
		//******************************************************
//		for(int i=0;i<0;i++)
//		{
//		System.out.println("Hello 123");
//		}

	
		
		
		
	
	
	


