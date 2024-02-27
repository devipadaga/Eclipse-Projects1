package client;

public class Palindrome {
	
	public void isPalindrome()
	{
		int a=123221;
		String t="";
		
		//converting to String
		String s=Integer.toString(a);
		
		for(int i=s.length()-1;i>=0;i--)
		{
			t=t+s.charAt(i);
		}
		
		//converting to Integer
		int b=Integer.valueOf(t);
		
		if(a==b)
			System.out.println("Palindrome");
		
		else
			System.out.println("Not Palindrome");
		
		
		
	}

	public static void main(String[] args) {
		
		Palindrome p=new Palindrome();
		p.isPalindrome();

	}

}
