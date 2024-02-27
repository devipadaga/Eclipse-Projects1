package BasicPrograms;

public class SwapNumbers {

	public static void main(String[] args) {
		
		//    1. USING 3rd VARIABLE
		
		int a=10,b=20,temp;
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("a is::: "+a);
		System.out.println("b is::: "+b);
		
		
		//    2. WITHOUT USING 3rd VARIABLE
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a is::: "+a);
		System.out.println("b is::: "+b);
		
		
		

	}

}
