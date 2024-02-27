package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxANDMin {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		int max=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		int min=list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		
		System.out.println(max);
		System.out.println(min);

	}

}
