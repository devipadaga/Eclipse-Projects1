package Concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleKeyANDMaultpleValuesinHASHMAP {

	public static void main(String[] args) {
		
		HashMap<String, List<String>> hm=new HashMap<>();
		
		List<String> l1=new ArrayList<>();
		l1.add("Apple");
		l1.add("Aeroplane");
		
		List<String> l2=new ArrayList<>();
		l2.add("Bat");
		l2.add("Ball");
		
		List<String> l3=new ArrayList<>();
		l3.add("Cat");
		l3.add("Cock");
		
		hm.put("A",l1);
		hm.put("B", l2);
		hm.put("C", l3);
		
		System.out.println("hashmap  :"+hm);
		
		System.out.println("Fetching key an multiple values:::");
		
		for(Map.Entry<String, List<String>>entry:hm.entrySet())
		{
			String key=entry.getKey();
			List<String> values=entry.getValue();
			
			System.out.print("key is:"+key);
			System.out.println(" ,values ="+values);
		}
	}

}
