package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicates {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,2,3,3,4,4,5,6,7,8,9,9,10);
		
		Set<Integer> duplicates=list.stream().filter(e->Collections.frequency(list,e)>1).collect(Collectors.toSet());
		
		System.out.println("duplicates :"+duplicates);
		
		//      or
		
		Set< Integer> set=new HashSet<Integer>();
		
		Set<Integer> duplicatesUsingSet=list.stream().filter(e->!set.add(e)).collect(Collectors.toSet());
		
		System.out.println("duplicatse using set :"+duplicatesUsingSet);
	}

}
