package client;

public class LargestNumberInArray {

	public static void main(String[] args) {
		
		
		int[] a=new int[] {1,4,7,90,34,56,72,100};
		
		int largest=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
		}
		
		System.out.println("Largest Element in an Array is :"+largest);

	}

}
