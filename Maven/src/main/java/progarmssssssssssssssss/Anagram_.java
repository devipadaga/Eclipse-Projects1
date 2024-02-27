package progarmssssssssssssssss;

import java.util.Arrays;

public class Anagram_ {

	public static void main(String[] args) {
		
		String s1="Race";
		String s2="Care";
		
		if(s1.length()==s2.length())
		{
			
			char[] ch1=s1.toLowerCase().toCharArray();
			char[] ch2=s2.toLowerCase().toCharArray();
			
			 // sort the char array
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			

		    // if sorted char arrays are same  // then the string is anagram	      
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println(s1+" "+s2+" are Anagaram");
			}
			else
			{
				System.out.println(s1+" "+s2+" are not Anagaram");
			}
		}
		
		else
		{
			System.out.println(s1+" "+s2+" are not an Anagaram");
		}
		

	}

}
