package aSSIGNMENTS;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

public class New {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>(Arrays.asList("Hyderabad","Banglore","Mumbai"));

		String s=list.get(0)+list.get(1)+list.get(2);
		System.out.println(s);
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
			if(entry.getValue()>2)
			{
				System.out.println(entry.getKey()+":"+entry.getValue());
			}

		}
		
				
		
		
		
		
//		Set<String> set=new HashSet<>(list);
//		Iterator<Map.Entry<Character,Integer>> itr=hm.entrySet().iterator();
//		while(itr.hasNext())
//		{
//			Map.Entry<Character, Integer> entrySet=itr.next();
//			Integer value=entrySet.getValue();
//			if(!set.addAll(value))
//					{
//				itr.remove();
//					}
//		}
//		System.out.println(hm);
//		
		


}
}
