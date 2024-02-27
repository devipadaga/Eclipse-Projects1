package Three;

/*************************
*************INTERFACE EXAMPLE USING DEFAULT AND STATIC METHODS
*
*		--->Can we declare protected methods in an interface?
			Answer :
				No. only public methods are allowed in an interface.
				
		---> for fields i.e for instance variables,-> Only public, static and final are allowed.
		--->All members of interface are public by default. 
		---> a class can implement more than one interfaces.
		--->Interface methods must be implemented as public. Because, interface methods are public by default .
		--->interface fields i.e instance variables are static and final by default and you can’t change their value 
			once they are initialized.
		--->Interfaces can’t have constructors.
		--->Interfaces can’t have initializers.(either static or instance initializers)
		--->from Java 8, interfaces can have static methods.
		--->) Can we declare an interface as ‘abstract’?
			Answer :
			Yes, interfaces can be declared as ‘abstract’. But, there is no need to declare like that
 			because interfaces are ‘abstract’ by default. 
 		--->from Java 8, interfaces can have static methods and default methods other than abstract methods.
 		--->Interfaces are abstract and public by default. True or False?
 			Answer :
			False. Interfaces are abstract by default but not public.
			
		--->Can we define interfaces as generic?
			Answer :
			Yes, we can define generic interfaces.
			
		--->
*
****************************/

//	interface MyInterface1{
//		   public static int num = 100;
//		   public default void display() {
//		      System.out.println("display method of MyInterface1");
//		   }
//		}
//		interface MyInterface2{
//		   public static int num = 1000;
//		   public default void display() {
//		      System.out.println("display method of MyInterface2");
//		   }
//		}	
//		public class interfaceEx implements MyInterface1, MyInterface2{
//			public void display() {
//				System.out.println("ggjhvjhgvg");
//			}
//				
//			
//			
//		   public static void main(String args[]) {
//			   MyInterface1 obj = new interfaceEx();
//		       obj.display();
//		   }
//		}
//
//		@Override
//		public void display() {
//			// TODO Auto-generated method stub
//			MyInterface1.super.display();
//			//MyInterface2.super.display();
//		}
//		}



interface MyInterface1{
public static int num = 100;
public static void display() {
	System.out.println("display method of MyInterface1");
}
}
interface MyInterface2{
public static int num = 1000;
public static void display() {
 System.out.println("display method of MyInterface2");
}
 }
class InterfaceExample implements MyInterface1,MyInterface2{
public static void display() {
 System.out.println("display method of InterfaceExample");
}

public static void main(String args[]) 
{
	
	MyInterface1.display();

	MyInterface2.display();
	InterfaceExample.display();
}
}

                       
       
    



		


