package Arrays;

public class duplicateNum {

	public static void main(String[] args) {
		
		int arr[] = {10,20,20,30,30,40,50,50};
		int n=arr.length;

		int result[]=new int[arr.length];

		int k = 0;//for next element  
		for (int i=0; i < n-1; i++)
		{  
			if (arr[i] != arr[i+1])
			{
				result[k++] = arr[i];
			}	
		}
			//remove duplicates from array java
		
			result[k++] = arr[n-1];
			
			for (int j=0; j<k; j++)  
			{
				System.out.print(result[j]+" ");  
			}
	}

}
