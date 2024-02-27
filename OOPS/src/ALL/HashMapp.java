package ALL;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapp {

	public static void main(String[] args) {
		
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("key1", "value1");
		hm.put("key2", "value2");
		hm.put("key3", "value3");
		System.out.println(hm);
		
		
		System.out.println("******************************************************"
		 		+ "\nIterating or looping map using foreach loop");
		for(String key:hm.keySet()) {
	        System.out.println("key: "+key+" value: "+hm.get(key));
	    }
		
		
		System.out.println("Iterating or looping map using entrySet and Iterator");
		Set<Map.Entry<String, String>> entrySet1 = hm.entrySet();
		Iterator<Map.Entry<String,String>>itr=entrySet1.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=itr.next();
			System.out.println("key : "+entry.getKey()+" "+"value : "+entry.getValue());
		}
		
		 System.out.println("******************************************************"
		 		+ "\nIterating or looping map using entrySet and foreach loop");
		 Set<Map.Entry<String, String>> entrySet2=hm.entrySet();
		 for(Map.Entry<String, String> entry:entrySet2)
		 {
			 System.out.println("key : "+entry.getKey()+" "+"value : "+entry.getValue());
		 }
	
		 System.out.println("******************************************************"
			 		+ "\nIterating or looping map using keySet Iterator");
		 
		 Set<String> KeySet=hm.keySet();
		 Iterator<String>it=KeySet.iterator();
		 while(it.hasNext())
		 {
			 String key=it.next();
			 System.out.println(key);
		 }
		 

	}

}
