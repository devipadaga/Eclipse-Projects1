package CodeSnippets;

public class prime {

	public static void main(String[] args) {
	
		System.out.println(checkPrime(4));		//false
		System.out.println(checkPrime(19));		//true
		System.out.println(checkPrime(49));		//false

	}
	
	
	public static Boolean checkPrime(int n) {
		
		if((n==0)||n==1)
			return false;
		if (n == 2) 
			return true;
		
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
