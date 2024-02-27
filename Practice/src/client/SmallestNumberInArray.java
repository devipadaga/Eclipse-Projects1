package client;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		
int[] a=new int[] {1,4,7,90,34,56,72,100};
		
		int smallest=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		
		System.out.println("Smallest Element in an Array is :"+smallest);


	}

}
