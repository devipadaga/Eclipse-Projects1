package BasicPrograms;

public class PrimeNumber {
	
	// num>1
	// which has only 2 factors 1 and itself
	
	//19--> 1 and 19======> prime number
	//28--> 1,2,4,7,14,28====> Not a prime number

	public static void main(String[] args) {
		
		int num=5;
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
			
			if(count==2)
				System.out.println("Number is a Prime Number");
			else
				System.out.println("Number is not a Prime Number");
		}
		
		else
		{
			System.out.println("Number is not a Prime Number");
		}
		
		

	}

}
