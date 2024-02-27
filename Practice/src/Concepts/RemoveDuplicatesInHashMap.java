package Concepts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicatesInHashMap {

	public static void main(String[] args) {
		
		    HashMap<String, String> map = new HashMap<String, String>();
		    map.put("A", "1");
		    map.put("B", "2");
		    map.put("C", "4");
		    map.put("D", "3");
		    map.put("E", "3");

		/*    Set<String> keys = map.keySet(); // The set of keys in the map.

		    Iterator<String> keyIter = keys.iterator();

		    while (keyIter.hasNext()) {
		        String key = keyIter.next();
		        String value = map.get(key);

		        System.out.println(key + "\t" + value);

		        String nextValue = map.get(key);

		        if (value.equals(nextValue)) {
		            map.remove(key);
		        }
		    }
		   System.out.println(map);*/
		
		    Set<String> mySet = new HashSet<String>();

		    Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator(); 
		    
		    while(itr.hasNext())
		    {
		        Map.Entry<String, String> entrySet = itr.next();

		        String value = entrySet.getValue();

		        if (!mySet.add(value))
		        {
		            itr.remove();               
		        }
		    }
		    System.out.println(map);
	}
	}


