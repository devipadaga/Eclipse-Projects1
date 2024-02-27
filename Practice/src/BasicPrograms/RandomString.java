package BasicPrograms;

import java.util.Random;

public class RandomString {

	public static void main(String[] args) {
		
		String Alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb=new StringBuilder();
		Random random=new Random();
		
		int length=7;
		
		for(int i=0;i<length;i++)
		{
			int index=random.nextInt(Alphabet.length());
			char randomchar=Alphabet.charAt(index);
			sb.append(randomchar);
			String randomString=sb.toString();
			System.out.println(randomString);
			
		}
		

	}

}
