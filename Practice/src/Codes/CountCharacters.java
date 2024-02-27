package Codes;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class CountCharacters {

	public static void main(String[] args) {
		
	//	String s="aabbbccda";
	/*	char[] ch=s.toCharArray();
		
		Map<Character,Integer> m=new HashMap<>();
		for(char c:ch)
		{
			if(m.containsKey(c))
			{
				m.put(c, m.get(c)+1);
			}
			
			else
			{
				m.put(c,1);
			}
		}
		
			System.out.println(m);
	*/
		String s="aabbbccda";
		int count= 1;
	    int i;

	    for (i = 0; i < s.length() - 1; i++) {
	        if (s.charAt(i) != s.charAt(i + 1) && count == 1) {
	            System.out.print(s.charAt(i));
	            System.out.print(count);
	            System.out.println();
	        }
	        

	        else if (s.charAt(i)== s.charAt(i + 1)) {
	        	System.out.print(s.charAt(i));
	            count++;
	        }

	        else if (s.charAt(i) != s.charAt(i + 1) && count >= 2) {
	            System.out.print(s.charAt(i));
	            System.out.println(count);
	            count = 1;
	        } 
	    }
	    
	
		System.out.print(s.charAt(i));
	    System.out.println(count);
	    System.out.println();
	    
	    
	   System.out.println("using another approach"); 
	    
	    Multimap<String,Integer> map=ArrayListMultimap.create();

		String word="aaabbcabbbbcca";
		char c[]=word.toCharArray();
		int count1=1;
		String dup=Character.toString(c[0]);
		for(int k=0;k<c.length-1;k++) {
			if(c[k]==c[k+1]) {
				dup=dup+c[k];
				count1++;
			}
			else {
				//System.out.println(dup+"-"+count);
				map.put(dup,count1);
				dup=String.valueOf(c[i+1]);
				count1=1;
			}}
		//if(count>1) {
		//	System.out.println(dup+" "+count);
		
		if(count1==1) {
			map.put(dup,1);

			//	System.out.println(c[c.length-1]+"-1");
		}
		System.out.println(map);
	}
}

	


