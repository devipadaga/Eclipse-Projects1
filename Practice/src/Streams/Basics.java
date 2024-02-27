package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Basics {

	public static void main(String[] args) {
		
		System.out.println("1---PRINT NAMES WHICH HAVING LENGTH >4 :");
		Stream.of("Devi","Sowmya","Arun","AG","Tirumala","Padaga").filter(s->s.length()>=4).forEach(s->System.out.println(s));
		System.out.println("2---PRINT NAMES ENDS WITH A : ");
		Stream.of("Devi","Sowmya","Arun","AG","Tirumala","Padaga").filter(s->s.endsWith("a")).forEach(s->System.out.println(s));
		System.out.println("3---PRINT NAMES OF LIMITING 1  ");
		Stream.of("Devi","Sowmya","Arun","AG","Tirumala","Padaga").filter(s->s.endsWith("a")).limit(1).forEach(s->System.out.println(s));
		System.out.println("4.PRINT NAMES USING SORTING : ");
		Stream.of("Devi","Sowmya","Arun","AG","Tirumala","Padaga").filter(s->s.startsWith("A")).sorted().forEach(s->System.out.println(s));
		System.out.println("5.PRINT NAMES USING MAP : ");
		Stream.of("Devi","Sowmya","Arun","AG","Tirumala","Padaga").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		List<String> names= Stream.of("Devi","Sowmya","Arun","AG","Tirumala","Padaga").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println("6. USING COLLECT : "+names.get(0));
		
		//QUES----PRINT UNIQUE NUMBER AND SORT THE ARRAY
		
		List<Integer>values=Arrays.asList(2,5,7,0,1,2,6,7,8,7,9,3);
		values.stream().distinct().forEach(s->System.out.print(s));
		
		System.out.println("      ");
		values.stream().sorted().forEach(s->System.out.println(s));
	}

}
