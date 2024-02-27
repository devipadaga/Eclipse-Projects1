package ExceptionHandling;

public class Throw {
	
	public static void CheckNum(int num)
	{
		if(num<1)
			throw new ArithmeticException("\n Negative cannot perform square ....pls provide the correct number");
	
	
		else 
			System.out.println("Square of " +num+" is "+(num*num));
			
		
	}
			
		

	public static void main(String[] args) {
		
		Throw.CheckNum(-3);
		System.out.println("REST OF THE CODE............");

	}

}
