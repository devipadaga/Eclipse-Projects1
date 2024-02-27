package BasicPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mock {

	public static void main(String[] args) {
		
		String s="My Name Is Elon Musk I Like Steve Jobs";
			char[] ch=s.toCharArray();
		Map<Character,Integer> hm= new HashMap<>();
		
		for(char c:ch)
		{
			if(hm.containsKey(c))
			{
				
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		
		for(Entry<Character,Integer>entry:hm.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.print(entry.getKey()+":"+entry.getValue()+" ");
			}
		}
		
		System.out.println("                    ");
		//***************************************************************************
		
		System.out.println("******************another code***********************************");
		
		String str="This is Bangalore";
		
		
		//String[] s1=str.split(" ");
		
		System.out.println(str);
		
		String[] s1 = str.split("\\s");
		String reversedString = "";
		for(int i = s1.length-1; i>=0; i--)
		{
		    reversedString =reversedString+ s1[i] + " ";
		    
		}
		System.out.println(  reversedString);
		for(int j=0;j<reversedString.length();j++)
		{
			int ch1=reversedString.charAt(j);
			
			if(ch1>64&&ch1<91)
			{
				ch1=ch1+32;
				System.out.print((char)ch1);
			}
			else if(ch1>96&&ch1<123)
			{
				ch1=ch1-32;
				System.out.print((char)ch1);
			}
			if(ch1==32)
			{
				System.out.print(" ");
			}	
		}
		System.out.println();
		
	}
}
	
	


