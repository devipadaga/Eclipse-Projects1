package Arrays;

public class second_Largest {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,5,8,9,7,10};
		
		int largest=a[0];
		int secondlargest=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
			
			else if(a[i]>secondlargest)
			{
				secondlargest=a[i];
			}
		}
		System.out.println("largest number is :"+largest);
		System.out.println("Second largest number is :"+secondlargest);

	}

}
