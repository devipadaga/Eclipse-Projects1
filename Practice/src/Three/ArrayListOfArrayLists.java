package Three;

import java.util.ArrayList;

//  FIRST SEE ARRAYLIST WITH INT ARRAY PROGRAM THEN SEE THIS

		/*
		 	As discussed above, arrays are of fixed length, but ArrayLists are dynamic.
		 	 Instead of creating an ArrayList of int arrays, we can create an ArrayList of Integer ArrayLists.
		 	  This way, we won’t need to worry about running out of space in our array.



			ArrayList< ArrayList<Integer> > arrListOfarrLists = new ArrayList< ArrayList<Integer> >();
		 */

public class ArrayListOfArrayLists {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(4);
		al2.add(5);
		al2.add(6);
		ArrayList<Integer> al3=new ArrayList<Integer>();
		al3.add(7);
		al3.add(8);
		al3.add(9);
		
		//Adding ArrayList<Integer> elements into ArrayList
		al.add(al1);
		al.add(al2);
		al.add(al3);
		
		
		//Printing the entire ArrayList
		for(int i=0; i<al.size(); i++)
			System.out.println("ArrayList at index " + i + " is " + al.get(i));
		
		//Accessing 1st ArrayList<Integer> elements
		ArrayList<Integer> firstArrayList=al.get(1);
		//Accessing third element from 1st ArrayList<Integer> elements
		int secondelement=firstArrayList.get(1);
		
		System.out.println("Accessing 1st ArrayList<Integer> elements : "+firstArrayList);
		System.out.println("Accessing third element from 1st ArrayList<Integer> elements : "+secondelement);
		

	}

}
