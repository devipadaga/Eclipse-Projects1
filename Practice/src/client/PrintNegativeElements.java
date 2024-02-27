package client;

public class PrintNegativeElements {
	
	public static void printNegative()
	{
		
		int[] a= {1,2,3,1,2,3};
		int b=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				//b=b+a[i];
				System.out.print(a[i]+" ");
				
			}
		
			
			else
			{
				System.out.println("Array doesn't has Negative Numbers");
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		printNegative();
		
		
	}

}
