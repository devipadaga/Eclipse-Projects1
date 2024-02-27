package BasicPrograms;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {

	public static void main(String[] args) {
		
		//Approach 1
		
		Random random=new Random();
		int x=random.nextInt(20);
		System.out.println(x);
		
		
		//Approach 2::::Using ThreadLocalRandom class
		
		System.out.println("Using ThreadLocalRandom class::");
		int a=ThreadLocalRandom.current().nextInt();
		System.out.println(a);
		double d=ThreadLocalRandom.current().nextDouble();
		System.out.println(d);
		float f=ThreadLocalRandom.current().nextFloat();
		System.out.println(f);
		
		

	}

}
