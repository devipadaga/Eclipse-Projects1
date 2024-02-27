package BasicPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num=1331,rev=0;
		int actualnum=num;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
	if(actualnum==rev)
	{
		System.out.println(actualnum+" is a Palindrome Number");
	}
	else
	{
		System.out.println(actualnum+" Not a palindrome number");
	}
	
	}

}
