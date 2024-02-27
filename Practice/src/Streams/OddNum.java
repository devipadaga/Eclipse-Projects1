package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import Concepts.list;

public class OddNum {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//ODD
		List<Integer> even=list.stream().filter(e->e%2==0).collect(Collectors.toList());
		
		//EVEN
		
		List<Integer> odd=list.stream().filter(e->e%2!=0).collect(Collectors.toList());
		
		System.out.println("even numbers are :"+even);
		System.out.println("odd numbers are :"+odd);
		
		

	}

}
