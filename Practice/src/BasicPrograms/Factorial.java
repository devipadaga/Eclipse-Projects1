package BasicPrograms;

public class Factorial {

	public static void main(String[] args) {
		
		int num=5,fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("FACTORIAL OF "+ num +" is === "+fact);
		
		//from here::: v should call below method in main method to execute.As it is a static , no need to create object.
		
		getfact(6);
	}
	
	//     USING ANOTHER APPROACH	
		public static void getfact(int num)
		{
			int fact=1;
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
			}
		System.out.println("factorial of "+ num +" using generic method is :"+fact);
		}
	
	

}
