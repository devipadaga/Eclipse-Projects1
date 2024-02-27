package Three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ConversionsUSINGStream {

	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 78, 9, 10, 3, 2, 34, 5, 3);

		// 1. Stream to List 
		List<Integer> listOfIntegers = input.stream() .collect(Collectors.toList());
		System.out.println("Stream to List: " + listOfIntegers);

		// Stream to ArrayList 
		Collection<Integer> aList = input.stream()
										.collect(Collectors.toCollection(ArrayList::new));
		System.out.println("Stream to ArrayList: " + aList);
		
		// Stream to LinkedList
		LinkedList<Integer> linkedList = input.stream() .collect(Collectors.toCollection(LinkedList::new)); 
		System.out.println("Stream to LinkedList: " + linkedList);  

		

}
