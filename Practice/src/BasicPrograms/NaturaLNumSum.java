package BasicPrograms;

public class NaturaLNumSum {

	public static void main(String[] args) {
		
		int num=100;
		int sum=0;
		
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum is :::"+sum);
		
		System.out.println("*************************************");
		
		int sum1=0;
		int k=1;
		while(k<=num)
		{
			sum1=sum1+k;
			k++;
		}
		System.out.println("using another approach :"+sum1);
	}

}
