package Concepts;

import java.util.AbstractMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"sowmya");
		hm.put(2,"Devi");
		hm.put(3,"Sow");
		
		//System.out.println(hm.containsKey("sow"));
		
		if(hm.containsKey("sowmya"))
		{
			String a=hm.get("sowmya");
			System.out.println("value for sowmya:"+a);
		}
		System.out.println(hm.get(2));
		
		// IERATING USING ITERATOR
		
		Iterator<Map.Entry<Integer,String>> itr=hm.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<Integer,String> e=itr.next();
			System.out.println("key:"+e.getKey()+"value:"+e.getValue());
			
		}
		
		
		//IERATING USING KEYSET AND VALUES
		for (Integer i : hm.keySet())
            System.out.println("key: " + i);
         
        
        for (String name : hm.values())
            System.out.println("value: " + name);
		
       // TO GET SET VIEW
        
        System.out.println("The set is: " + hm.entrySet());
        
       //KEY SET
        System.out.println("The Keyset is: " + hm.keySet());
        
        //AbtsractMap
        
        AbstractMap ah1 = new IdentityHashMap();

        AbstractMap ah2 = new IdentityHashMap<>();

    
		    ah1.put(10, "arun");
		    ah1.put(15, "4");
		    ah1.put(20, "arun");
		    ah1.put(25, "devi");
		    ah1.put(30, "sowmya");

    
			    ah2.put(10, "arun");
			    ah2.put(15, "4");
			    ah2.put(20, "aruna");
			    ah2.put(25, "devi");
			    ah2.put(30, "sowmya");

			    System.out.println(ah1.get(10));
			    System.out.println("First Map: " + ah1);
			    System.out.println("Second Map: " + ah2);
			    System.out.println("Equality: " + ah1.equals(ah2));
	
			    
		//******************* For-each loop for traversal over Map
		        for (Map.Entry<Integer, String> mapElement :hm.entrySet()) {
		  
		            Integer key = mapElement.getKey();
		  
		           
		            String value = mapElement.getValue();
		  
		            
		            System.out.println(key + " : " + value);
	

		    //**********88 Check if a key is present ,if present, print value
		            if (hm.containsKey("sowmya")) {
		                String a = hm.get("10");
		                System.out.println("value for key"
		                                   + " \"sowmya\" is:- " + a);  
		            }
		           
		            
		       // Iterating using enhanced for loop
		            for (Map.Entry<Integer, String> e : hm.entrySet())
		                System.out.println("fffffffe"+e.getKey() + " "
		                                   + e.getValue());
		            
	  //*************************** Creating an Hashtable
		           
		        Hashtable<String, Integer> hash_table= new Hashtable<String, Integer>();
		     
		            
		            hash_table.put("arun", 10);
		            hash_table.put("4", 15);
		            hash_table.put("arun", 20);
		            hash_table.put("devi", 25);
		            hash_table.put("sowmya", 30);
		     
		            
		            System.out.println("The Table is: " + hash_table);
		        }
	}
}
		     
		          
		
		
		//---------------------------------------------------------------------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		        
	
	

		            
		        
	

	


