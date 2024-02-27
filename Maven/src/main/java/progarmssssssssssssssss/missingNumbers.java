package progarmssssssssssssssss;

import java.util.Arrays;

public class missingNumbers {

	public static void main(String[] args) {
		
		int[] arr= {2,4,6,8,10};
		Arrays.sort(arr);
		int min=arr[0];
		int max=arr[arr.length-1];
		int k=0;
		
		for(int i=min;i<=max;i++)
		{
			int currentValue=arr[k];
			if(currentValue==i)
				k++;
			else
				System.out.print(i+" ");
		}
		
		
		//Another approach
		System.out.println("\nUSING ANOTHER APPROACH***************");
		int len=arr.length,start=1;
		
		for(int i=0;i<len-1;i++)
		{
			while(start<arr[i+1])
			{
				if(start!=arr[i])
				{
					System.out.print(start+" ");
				}
				start++;
			}
		}

	}

}
