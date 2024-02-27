package Concepts;


//public class Sample {
//
//	public static void main(String[] args) {
//		
	/*	String s="Today is";
		s.concat("Good Day");
		System.out.println(s);
		s=s.concat("Good Day");
		System.out.println(s);
		
		*/
	
		
	/*	class A
		{
			
		}
		
		class B extends A
		{
			
		}
		
		class C extends B
		{
			
		}

		class Test
		{
			public static void main(String[] args)
			{
				C c=new C();
				c.method();
			}
		}
		
		*/

//		
//		class A
//		{
//			int i=40;
//		
//		
//		static
//		{
//			System.out.println(i);
//		}
//		}
//	}
		
		
//		class A
//		{
//		    int x=10;
//		}
//		class B extends A
//		{
//		    int x1=20;
//		    int x=30;
//		}
//
//		public class Sample{
//		    public static void main(String []args){
//		        A a=new B();
//		        System.out.print(a.x);
//		    }
//		}	


//class A 
//{ 
//  void food()
//  { 
//     System.out.println("What kind of food do A eat?"); 
//  } 
//} 
// class B extends A
//{ 
//	 void food()
//	  { 
//	     System.out.println("What kind of food do B eat?"); 
//	  } 
//	 
//   void food(int x)
//   { 
//      System.out.println("B eats flesh"); 
//   } 
// } 
//public class Sample 
//{ 
//  public static void main(String[] args) 
//  { 
//    A a = new B(); 
//      a.food();  // what is the out put here
//	 //a.food(20); // what is the out put here
//
//   B b = new B();  
//    b.food();  // what is the out put here
//    b.food(10);  // what is the out put here
//  } 
//}

class A{  
protected void msg(){
	System.out.println("protected");
	}  
}  
  
public class Sample extends A{  
protected void msg(){
	System.out.println("Hello java");
	}  
 public static void main(String args[]){  
   Sample obj=new Sample();  
   obj.msg();  
   }  
}  
		

		
		
		


