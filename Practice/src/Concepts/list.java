package Concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class list {

	public static void main(String[] args) {
		
		//*************** declaring

				// 1.
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
				//2.
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		
		// Iterating using for loop
        for (int i = 0; i < numbers.size(); i++)
            System.out.println(numbers.get(i) + " ");  
		
     // For Each Loop for iterating ArrayList
        for (Integer i : numbers)
            System.out.print(i + " ");
		
     // Iterating ArrayList using Iterator
        Iterator it = numbers.iterator();
        while (it.hasNext())
            System.out.println("using iterator:"+it.next() + " ");
		
     // Printing numbers using lambda expressions
        numbers.forEach(number->System.out.println("hhhhh    :"+number));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static String get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
