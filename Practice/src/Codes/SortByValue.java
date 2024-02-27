package Codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//import java.util.Comparator;



public class SortByValue {

	public static void main(String[] args) {
		
		Map<String,Integer> m=new HashMap<>();
		m.put("java", 20);
        m.put("C++", 45);
        m.put("Java2Novice", 2);
        m.put("Unix", 67);
        m.put("MAC", 26);
        m.put("Why this kolavari", 93);
		
		Set<Entry<String,Integer>> s=m.entrySet();
		List<Entry<String,Integer>>list=new ArrayList<Entry<String,Integer>>(s);
		
		Collections.sort(list,new Comparator<Map.Entry<String,Integer>>()
				{

					@Override
					public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) 
					{
						// to print in ascending ordre
					//	return (o1.getValue()).compareTo(o2.getValue());
						  // to print in descending order
						return (o2.getValue()).compareTo(o1.getValue());
						
					}

				});
		
				for(Map.Entry<String, Integer> entry:list){
				System.out.println(entry.getKey()+" ==== "+entry.getValue());
		
				}
			
	}
}
		
		

	


