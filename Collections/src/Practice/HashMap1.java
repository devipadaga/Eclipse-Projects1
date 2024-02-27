package Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm =new HashMap<>();
		hm.put(1, "HI");
		hm.put(2, "HELLO");
		hm.put(3, "NAMSTE");
		hm.put(4, "VANAKKAM");
		hm.put(5,"Hello");
		
		System.out.println("dhhjhhjgjhsgjhsghj   "+hm);
		
		Set<Entry<Integer,String>> keyValueSet=hm.entrySet();
		
		for(Entry<Integer,String> entry:keyValueSet)
		{
			System.out.println("key is "+entry.getKey()+" : value is "+entry.getValue());
		}
		
		System.out.println();

		
		//   2nd Method
		
		for(Entry<Integer, String> entry:hm.entrySet())
		{
			System.out.println(" using for loop \n"
					+ "key is "+entry.getKey()+":"+"Value is "+entry.getValue());
		}
		System.out.println();
		
	}


}
