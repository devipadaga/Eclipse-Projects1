package BasicPrograms;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		
		
		//       1.
		int num=4;
		
		if(num%2==0)
		{
			System.out.println("num is even::: "+num);
			
		}
		else {
			System.out.println("num is odd::: "+num);
			
		}
	
	
	//    2.
		System.out.println("using scanner class");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("plz enter num:");
		int num1=sc.nextInt();
		
		if(num1%2==0)
		{
			System.out.println(num1+" is even");
		}
		
		else
		{
			System.out.println(num1+"is odd");
		}
	
	
	
	}

}
