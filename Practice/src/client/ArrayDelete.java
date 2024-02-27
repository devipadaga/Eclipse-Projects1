package client;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
/*		int[] FA= {1,2,3,4,5};
		System.out.println(Arrays.toString(FA));
		int index=2;
		int n=FA.length;
		
		int[] NA=new int[n-1];
		System.out.println(NA.length);
		
		
						  
		for(int i =0;i< n-1; i++){
			
			if(i==index)
			{
				continue;
			}
			
	        NA[i] = FA[i];
	      }
		
		
		System.out.println(Arrays.toString(NA));

*/		
		System.out.println("***USING ARRAYLIST****");
		Integer[] arr= {1,2,3,4,5};
        int n=arr.length;
        Integer[] arr2=new Integer[n-1];
        
        System.out.println("Original Array"+Arrays.toString(arr));
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(arr));
        al.remove(2);
        arr2=al.toArray(arr2);
        System.out.println("After: "+Arrays.toString(arr2));
		
	}

}
