package Streams;

import java.util.Arrays;
import java.util.List;

public class NumSquareAverage {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,4,5,6,7,10,20,30,40);
		
	double avg=	list.stream()
			.map(e->e*e)
				.filter(e -> e>100)
					.mapToInt(e -> e)
						.average()
							.getAsDouble();
	
	System.out.println("avg is "+avg);
		
			

	}

}
