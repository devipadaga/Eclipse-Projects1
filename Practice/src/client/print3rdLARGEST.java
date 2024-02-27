package client;

public class print3rdLARGEST {

	public static void main(String[] args) {

		int[] a= {1,2,3,4,5,6};
		
	/*	for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
	*/	
		int ThirdLargest=a[a.length-3];
		System.out.println("3rd Largest Number in Array is :"+ThirdLargest);
		
		int SecondLargest=a[a.length-2];
		System.out.println("Second Largest Number in Array is :"+SecondLargest);
		
		int LastNumber=a[a.length-1];
		System.out.println(LastNumber);

	}

}
