package client;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		
		Random random=new Random();
		int x=random.nextInt(22);
		System.out.println(x);

	}

}
