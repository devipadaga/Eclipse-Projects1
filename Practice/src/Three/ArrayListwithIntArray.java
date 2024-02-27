package Three;

import java.util.ArrayList;
import java.util.Arrays;

/*
		 	ArrayList by using int[]. We cannot use primitives like int as ArrayList type, but we can use int[]. 
		 	This is because arrays in Java are objects, not primitives.
		 	 And an ArrayList can be created by any object type(arrays in our case).
		 	
		 */

public class ArrayListwithIntArray {

	public static void main(String[] args) {
		
		ArrayList<int[]> al=new ArrayList<>();
		
		int[] arr1= {1,2,3};
		int[] arr2= {4,5,6};
		int[] arr3= {7,8,9};
		
		al.add(arr1);
		al.add(arr2);
		al.add(arr3);
		
		//Access array elements
		int[] data=al.get(1);
		System.out.println("Second set of Array Elements in al "+Arrays.toString(data));
		
		
		//Access single elements from array
		int[] data1=al.get(0);
		int thirdelement=data1[2];
		System.out.println("------------------------------\n"+"Elements of 1st array is :"+Arrays.toString(data1));
		System.out.println("Accessing single element from first int array"
				+"\n"+ "third element from 1st array is :"+thirdelement);
		
		
		
		//print ArrayList
		System.out.println("----------------------------");
		for(int i=0;i<al.size();i++)
		{
			int[] data2=al.get(i);
			System.out.println("Array at index " +i+" is :"+Arrays.toString(data2));
		}
		
		

	}

}
