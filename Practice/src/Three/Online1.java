package Three;


//	
//	class A
//	{
//	    int methodOfA(int i)
//	    {
//	        i /= 10;
//	 
//	        return i;
//	    }
//	}
//	 
//	class B extends A
//	{
//	    int methodOfB(int i)
//	    {
//	        i *= 20;
//	 
//	        return methodOfA(i);
//	    }
//	}
//	 
//	public class Online1
//	{
//	    public static void main(String[] args)
//	    {
//	        B b = new B();
//	 
//	        System.out.println(b.methodOfB(100));
//	    }
//	}


//*************************************************************
//class A
//{
//    static int i;
// 
//    static
//    {
//        i++;
//    }
// 
//    {
//        ++i;
//    }
//}
// 
//class B extends A
//{
//    static
//    {
//        --i;
//    }
// 
//    {
//        i--;
//    }
//}
// 
//public class Online1
//{
//    public static void main(String[] args)
//    {
//        System.out.println(new B().i);
//    }
//}

class Online1
{
	 static int i=45;
	 public void m1()
	 {
	       int i =10;
	        System.out.println("This is Myclass1 method :" + i);
	 }
	public static void main(String[] args)
	{
		Online1 m=new Online1();
		 m.m1();
	}
}



