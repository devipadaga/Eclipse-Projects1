package ppt;

//public class OverLoad {
	
//	 int add(int a,int b)
//	{
//		return a+b;
//
//}
//	
//	static double add(double a ,double b)
//	{
//		return a+b;
//	}
//
//	public static void main(String[] args) {
//		
//		OverLoad M=new OverLoad();
//		
//		System.out.println(M.add(20, 20));
//		System.out.println(add(20.0, 20.0));
//		
//
//	}
//
//}

// Overloading – Different Number of parameters in argument list
//public class OverLoad
//{
//
//		public void disp(char c)
//		{
//			System.out.println("Singlr arg :"+c);
//		}
//		public void disp(char c, int num)  
//		{
//			System.out.println("Two arg : "+c + " , "+num);
//		}
//	
//		public static void main(String args[])
//		{
//			OverLoad obj = new OverLoad();
//			obj.disp('a');
//			obj.disp('b',10);
//		}
//	}
//	
	
//  Overloading – Difference in data type of parameters	
//public class OverLoad
//{
//	    public void disp(char c)
//	    {
//	        System.out.println(c);
//	    }
//	    public void disp(int c)
//	    {
//	       System.out.println(c );
//	    }
//	    public static void main(String args[])
//	    {
//	    	OverLoad obj = new OverLoad();
//	        obj.disp('a');
//	        obj.disp(5);
//	    }
//}
//	
//	

	//   Overloading – Sequence of data type of arguments
	
public class OverLoad
{
   public void disp(char c, int num)
	   {
	       System.out.println("I’m the first definition of method disp");
	   }
	   public void disp(int num, char c)
	   {
	       System.out.println("I’m the second definition of method disp" );
	   }
		public void disp(int num,int num1, char c)
{
    System.out.println("I’m the third definition of method disp" );
}

	
	   public static void main(String args[])
	   {
		   OverLoad obj = new OverLoad();
	       obj.disp('x', 51 );
	       obj.disp(12, 10, 'g');
	       obj.disp(52, 'y');
	       
			
	   }
	}
