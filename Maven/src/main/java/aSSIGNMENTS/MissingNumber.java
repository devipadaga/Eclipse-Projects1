package aSSIGNMENTS;

public class MissingNumber {

	public static void main(String[] args) {


		int a[]= {1,2,3,5,6};
		int sum=0,sum1=0,n=6;
		
		for(int s:a)
		{
			sum+=s;
		}
		
		for(int i=1;i<=6;i++)
		{
			sum1+=i;
		}

		System.out.println(sum1-sum);
		
		
		//2nd pproach using formula
		
		int expsum=(n*(n+1)/2);
		System.out.println("using formula : "+ (expsum-sum));
	}

}
