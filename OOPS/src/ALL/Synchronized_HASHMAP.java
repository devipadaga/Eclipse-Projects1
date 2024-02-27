package ALL;
import java.util.*;
import java.util.Map.Entry;

public class Synchronized_HASHMAP {
	
	/*
	 HashMap is not synchronized collection class. We need to synchronize explicitly in order to perform thread-safe operations on it.
 	In order to synchronize HashMap we need to use Collections.synchronizedMap(hashmap). 
 	It returns a thread safe map backed up by the specified HashMap.
 	Other important point to note that iterator should be used in a synchronized block,
 	 even if we have synchronized the HashMap explicitly.
	 */

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"sow");
		hm.put(2,"devi");
		hm.put(3,"AG");
		
		Map map=Collections.synchronizedMap(hm);
		Set set=map.entrySet();
		synchronized (map) {
			
			Iterator it=set.iterator();
			while(it.hasNext())
			{
				Map.Entry entry=(Map.Entry) it.next();
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
			
		}

	}

}
