package Arrays;

import java.util.Arrays;

public class sort_SubArray {

	public static void main(String[] args) {
		
		int[] a = {12, 90, 34, 2, 45, 3, 22, 18, 5, 78}; 
		
		for (int i : a) {
			System.out.print(i+" ");
			
		}
		 System.out.println("                ");
		 
		Arrays.sort(a, 2, 7);   
		 
		for (int i=0;i<a.length;i++)   
		{       
		System.out.print(a[i]+" ");   
		}   

	}

}
