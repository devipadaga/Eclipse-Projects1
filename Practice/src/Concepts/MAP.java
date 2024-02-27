package Concepts;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MAP {

	public static void main(String[] args) {
		
		Map<String,Integer> m1=new HashMap<>();
		m1.put("Devi",10);
		m1.put("Arun", new Integer(20));
		m1.put(new String("Kumar"),30);
		
		// Traversing through Map using for-each loop
		
		for(Map.Entry<String,Integer> e:m1.entrySet())
		{
			System.out.println(e.getKey()+""+e.getValue());
		}
		

        // Iterating over Map
        for (Map.Entry<String, Integer> e : m1.entrySet())
        { 
            System.out.println(e.getKey() + " "+ e.getValue());
        }                     
		
		//removing element
        
         System.out.println("map is"+ m1.remove("Devi"));
		
		m1.put("AG",40);
		m1.put("Tiru",50);
		m1.put("Honey",60);
		
		//       Using Type_Casting
		
		for(Map.Entry<String, Integer> e:m1.entrySet())
		{
			String key=(String)e.getKey();
			int value=(int)e.getValue();
			System.out.println("key:"+key+" "+"Values:"+value);
		}
		
		//     Using set
		
		Set<Entry<String, Integer>> entrySet = m1.entrySet();
        
        for (Entry<String, Integer> entry : entrySet) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        
        
        Map<String,Integer> m2=new HashMap<>();
        m2.put("ghhj",1);
        m2.put("hhh",2);
        m2.put("jjj",3);
        m2.put("bbb",4);
        
        System.out.println("mappings of m2:"+m2);
        
        // printing KEY-VALUE PAIR
        
        entrySet = m2.entrySet();
        
        for (Entry<String, Integer> entry : entrySet) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        
       m2.putIfAbsent("mmm", 2); 
       
       System.out.println("new mappings:"+m2);
       
       //RETRIEVING KEY-SET
       
       Set<String> keySet = m2.keySet();
       
       for (String key : keySet) 
       {
           System.out.println(key);
       }
        
       // Retrieving VALUE-SET
       
       Collection<Integer> values=m2.values();
    	  
    	   for(Integer value:values)
    	   {
    	   System.out.println(value);
    	  }
  	   
	}    
        }

	


