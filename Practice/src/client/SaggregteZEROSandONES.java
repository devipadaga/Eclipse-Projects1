package client;

public class SaggregteZEROSandONES {

	public static void main(String[] args) {
		
		int[] a=new int[] {1,0,1,0,1,0,1,0};
		
		int count=0;
		
	/*	System.out.println("Original Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	*/	
		//actual code starts from here
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				count++;
			}
		}
		
		System.out.println("\nNo:Of Zeros are : "+count);
		
		for(int i=0;i<=count;i++)
		{
			a[i]=0;
		}

		for(int i=count;i<a.length;i++)
		{
			a[i]=1;
		}
		
		System.out.println("After Saggregation : ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}

}
