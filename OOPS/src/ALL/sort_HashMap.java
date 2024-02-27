package ALL;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class sort_HashMap {

	public static void main(String[] args) {

		HashMap<Integer,String>hm=new HashMap<>();
		{
			hm.put(6,"F");
			hm.put(4,"E");
			hm.put(3,"C");
			hm.put(1,"A");
			hm.put(5,"B");
			hm.put(2,"D");
			System.out.println("Before Sorting:");
			 Set set = hm.entrySet();
			  Iterator itr = set.iterator();
			    while(itr.hasNext()) {
			        Map.Entry pair = (Map.Entry)itr.next();
			        System.out.print(pair.getKey() + ": ");
			        System.out.println(pair.getValue());
		}
		
		Map<Integer,String> map=new TreeMap<Integer,String>(hm);    
		System.out.println("After Sorting:");
		Set set2=map.entrySet();
	    Iterator itr2=set2.iterator();
	    while(itr2.hasNext()){
	        Map.Entry pair2=(Map.Entry)itr2.next();
	        System.out.print(pair2.getKey()+": ");
	        System.out.println(pair2.getValue());
}

	}
	}
	

}
