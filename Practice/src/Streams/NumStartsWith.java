package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumStartsWith {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(2,20,200,34,45,67,25,87,290);
		
		List<Integer> numwith2=list.stream()
									.map(e->String.valueOf(e))
										.filter(e->e.startsWith("2"))
											.map(Integer::valueOf)
												.collect(Collectors.toList());
		
		System.out.println("numbers that start with 2 are :"+numwith2);

	}

}
