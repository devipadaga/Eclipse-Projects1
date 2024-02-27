package Codes;

public  abstract class ABSTRACTIONEXAMPLE {

	
	//	public abstract class AbstractSuperClass {
			// data members cant be abstract
			public int a = 10;
			
			// myMethod() is an abstract method
			abstract void myMethod();
			
			// myMethod(int x) is not an abstract method. Its a concrete method
			void myMethod(int x){
				System.out.println("I am in Super class and I am not an abstract method. I am a concrete method");
			}

		

		// Inheriting the AbstractSuperClass class
		public class AbstractChildOneClass extends ABSTRACTIONEXAMPLE{

			public static void main (String [] args){

		                // Here we cannot instantiate the AbstractSuperClass class but we can instantiate the AbstractChildClass class
		                // Using the instance of AbstractChildClass we can access methods and data members of AbstractSuperClass class
			
				ABSTRACTIONEXAMPLE obj = new AbstractChildOneClass();
				
				System.out.println("I am a data member from Super class and my value is " + obj.a);
				obj.myMethod();
				obj.myMethod(20);
				
			}

			@Override
			void myMethod() {

				System.out.println("I am in child class");
				
			}

		}
}


