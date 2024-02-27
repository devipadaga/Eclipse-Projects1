package Polymorphism;


//super() is added in each class constructor automatically by compiler if there is no super() or this().


	class Bird
	{
		Bird()
		{
			System.out.println("KIch KIch in parent Constructor");
		}
	}
	
	
	class Wild extends Bird
	{
		Wild()
		{
		super();
		System.out.println("Child Constructor");
		}
	}
	
	//As we know well that default constructor is provided by compiler automatically if there is no constructor. 
			//But, it also adds super() as the first statement.

	
	class Chair extends Wild
	{
		Chair()
		{
			System.out.println("in 2nd SUBCLASS........SEE HOW IT IS CALLING W/0 SUPER KEYWORD...");
		}
	}
public class SuperINVOKINGParentConstructor {

	public static void main(String[] args) {
	
		//Wild w=new Wild();
		Chair c=new Chair();
		

	}

}
