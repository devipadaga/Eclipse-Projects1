package Codes;

public class ReverseString1 {

	public static void main(String[] args) {
		
		String s="This is the string to reverse";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.print("REVERSE OF A STRING IS :"+rev);
		
		System.out.println();

		System.out.println("************************************8");
		
		//
		String str="Hello Java";
		
		System.out.println(str);
		
		String[] s1=str.split(" ");
		String rev1="";
		
		for(int i=s1.length-1;i>=0;i--)
		{
			rev1=rev1+s1[i]+" ";			
		}
	
		System.out.print(rev1);
	}

}
