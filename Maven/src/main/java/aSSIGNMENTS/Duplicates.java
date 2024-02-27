package aSSIGNMENTS;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Duplicates {

	public static void main(String[] args) {

		String s="My name is Sowmya";
		char[] ch=s.toCharArray();
		Map<Character,Integer> hm=new HashMap<>();
		
		for(char c:ch)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
				hm.put(c,1);
		}		
		for(Entry<Character,Integer> entry:hm.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
		
		
		System.out.println("*********************************************");
		//**************************************
		
		String s1="My name is Arun";
		s1=s1.toLowerCase();
		Map<Character,Integer> m=new HashMap<>();
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=' ')
			{
				m.put(s1.charAt(i),m.getOrDefault(s1.charAt(i), 0)+1);
			}
			else
				m.put(s1.charAt(i), 1);
		}
		for(Entry<Character,Integer> entry:m.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
	}

}
