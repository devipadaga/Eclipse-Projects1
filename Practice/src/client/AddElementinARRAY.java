package client;

import java.util.ArrayList;
import java.util.Arrays;

public class AddElementinARRAY {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		
		int n=a.length;
		
		int newArr[]=new int[n+1];
		int value=6;
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<n;i++)
		{
			newArr[i]=a[i];
		}
		
		
		newArr[n]=value;
		
		
		System.out.println(Arrays.toString(newArr));
		
		
		System.out.println("***********USING ARRAYLIST******************"); 
	
		Integer[] arr1= {1,2,3,4,5};
		
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(arr1));
		
		System.out.println(al);
		al.add(6);
		
		  arr1= al.toArray(arr1);
		
		System.out.println(Arrays.toString(arr1));
	}

}
