package progarmssssssssssssssss;

public class print_ASCII_Values_ofALL_Characters {

	public static void main(String[] args) {
		
		//ASCII value of all characters
		for(int i=0;i<=255;i++)
		{
			System.out.println("ASCII value of "+(char)i+" = "+i);
		}
		
		//print ASCII value
		char ch1='a';
		char ch2='b';
		int asc1=(int)ch1;
		int asc2=(int)ch2;
		System.out.println("\nASCII of 'a'  is :"+asc1 +" "+"\nASCII of 'b'  is :"+asc2);

		//another way to print ascii value
		int ch3 = 'a';  
		int ch4 = 'b';  
		System.out.println("The ASCII value of a is: "+ch3);  
		System.out.println("The ASCII value of b is: "+ch4);
		
		//for A to Z
		for(int i=65;i<=90;i++)  
		{  
		System.out.println("The ASCII value of " +(char)i+ " = " +i);  
		} 
		
		//for a to z
		for(int i = 97; i <= 122; i++)  
		{  
		System.out.println("The ASCII value of " +(char)i+ " = " +i);  
		} 
	}

}
