package Three;


//public class Test{
//				
//		Test(Double d){
//		this(10);
//			 System.out.println("Double-arg Constructor");
// }
// 	Test(int i) 
// 	{
// 		this();
//		 System.out.println("Int-arg Constructor");
//		}
//
//	Test() {
//		System.out.println("No-arg Constructor");
//			}
//			
//	//public class All {
//		public static void main(String[] args) {
//			Test t1=new Test(10.5);
//		
//			Test t2=new Test(10);
//			Test t3=new Test();
//
//	}
//
//}




//class X
//{
//    static void staticMethod()
//    {
//        System.out.println("Class X");
//    }
//    
//    void NonStatic()
//    {
//    	System.out.println("NonStatic from Class X");
//    }
//}
// 
//class Y extends X
//{
//    static void staticMethod()
//    {
//        System.out.println("Class Y");
//    }
//    void NonStatic()
//    {
//    	System.out.println("NonStatic from Class Y");
//    }
//}
// 
//public class Test
//{    public static void main(String[] args)
//    {
//        Y.staticMethod();
//        
//        X x1=new Y();
//        x1.staticMethod();
//        x1.NonStatic();
//        
//        Y y1= new Y();
//        y1.staticMethod();
//        y1.NonStatic();
//        
//    }
//}





//class M
//{
//    int i;
// 
//    public M(int i)
//    {
//        this.i = i--;
//    }
//}
// 
//class N extends M
//{
//    public N(int i)
//    {
//        super(++i);
// 
//        System.out.println(i);
//    }
//}
// 
//public class Test
//{
//    public static void main(String[] args)
//    {
//        N n = new N(26);
//    }
//}





//int no=45663356;// {45,66,33,56};
//public class Test{
//	public static void main(String args[]) {
//		
//int no=45663356;
//int[] arr=new int[4];
//int temp,i=3;
//{
//while(no!=0)
//{
//    temp=no%100;
//    arr[i]=temp;
//    no=no/100;
//    i--;
//}
//for(int j=0;j<arr.length;j++) {
//System.out.print(arr[j]+" ");
//}
//}
//}
//}




//****************************
//Overrided method Should be protected type...it should not have weaker access specifier//
//class A {
//   protected void protectedMethod() {
//      System.out.println("superclass protected method");
//   }
//}
//class B extends A {
//	 void protectedMethod() {
//      System.out.println("subclass protected method");
//   }
//}
//public class Test {
//   public static void main(String args[]) {
//       A a=new B();
//       a.protectedMethod();
//       
//      B b = new B();
//      b.protectedMethod();
//   }
//}
