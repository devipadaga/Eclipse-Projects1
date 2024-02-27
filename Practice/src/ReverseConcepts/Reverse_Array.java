package ReverseConcepts;

import java.util.Arrays;
import java.util.Collections;

public class Reverse_Array {

	public static void main(String[] args) {
		
		//    1.
		
		Integer[] n= {1,2,3,4,5};
		
		for(int i=n.length-1;i>=0;i--)
		{
			System.out.print(n[i]+" ");
		}
		
		System.out.println();
		
		//    2.  REVERSE AN ARRAY USING ''' ARRAYLIST '''
		
		System.out.println("REVERSE AN ARRAY USING ''' ARRAYLIST ''' ");
		
		String[] s= {"one","Two","Three","four"};
		
		System.out.println("org string array is "+ Arrays.asList(s));
		
		
		Collections.reverse(Arrays.asList(s));
		
		System.out.println("After reverse string array is "+Arrays.asList(s));
		
		
		//   3. USING TEMP ARRAY
		
		System.out.println("REVERSE AN ARRAY USING \n"
				+ "USING TEMP ARRAY ");
		
		Integer[] num= {10,20,30,40,50};
		
	/*	for(int j=0;j<=num.length;j++)
		{
			j=
		}
	*/	
		
	}

}
