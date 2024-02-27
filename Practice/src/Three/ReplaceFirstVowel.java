package Three;

import java.util.ArrayList;
import java.util.Arrays;

		//************   REplace FIRST VOWEL WITH SPECIAL  CHARACTER  *********************

public class ReplaceFirstVowel {

	public static void main(String[] args) {
		
		ArrayList<Character> al=new ArrayList<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));		
		String str="Qube";
		StringBuilder sb = new StringBuilder(str);
		
		for(int i=0;i<str.length();i++) {
			if(al.contains(str.charAt(i))) {
				sb.setCharAt(i, '-');
				break;
			}
		}
		System.out.println("letter of first vowel is : ");
		System.out.println(sb);
		
		
		
	}

}
