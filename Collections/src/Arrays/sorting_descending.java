package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class sorting_descending {

	public static void main(String[] args) {
		
		Integer arr[] = {50, 25, 30, 55, 15};
		int temp=0;
		for (int i : arr) 
		{
			System.out.print(i+" ");
			
		}
		 System.out.println("                ");
		 
		 //USING LOOP
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
				
			}
			
			System.out.print("\n"+arr[i]+" ");
		}
		
		
		//USING IN-BUILT
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("\nArray elements in descending order: " +Arrays.toString(arr)); 
		
		
		

	}

}
