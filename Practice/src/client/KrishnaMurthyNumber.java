package client;

public class KrishnaMurthyNumber {

	

	static int factorial(int n)
	{
	int fact=1;
	while(n!=0){
	fact=fact*n;
	n--;
	}
	return fact;
	}

	static boolean isKMNumber(int n)
	{
	int sum=0;
	int temp=n;
	while(temp!=0)
	{
	sum+=factorial(temp%10);

	temp = temp / 10;
	}
	return (sum == n);
	}


	public static void main(String[] args)
	{		
		KrishnaMurthyNumber km=new KrishnaMurthyNumber();
			int n = 145;
	        if (isKMNumber(n))
	            System.out.println("YES");
	        else
	            System.out.println("NO");

	}

}
