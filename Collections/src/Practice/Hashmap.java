package Practice;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		
			HashMap<Integer, String> hm= new HashMap();
			hm.put(1,"HAI");
			hm.put(2,"AG");
			hm.put(3,"HELLO");
			
			
			//***********Traversing Elements**********************************8
			        //***FOR EACH LOOP     ***************8
			for(Map.Entry<Integer, String> s:hm.entrySet())
			{
				//System.out.println("Entries are:"+s +" ");
				System.out.println("key:"+s.getKey()+" "+"Value:"+s.getValue());
				
			}
			
			//*************ADDING ELEMENTS****************************************8
			hm.put(4, "GOOD MORNING");
			System.out.println("After Adding:"+hm);
			
			//"""""""""""REMOVING elements"""""""""""""""""""""""""""""""""""""""""""""
	
			hm.remove(3);
			System.out.println("After Removing:"+hm);
	
			// **********Another kind of Initialization****************************************
			HashMap<Integer, String>hm2=new HashMap<>(hm);
			System.out.println(hm2);
			
			
			//**********Methods in HashMap**********************************8888
			//1.clear()
			hm.clear();
			System.out.println("After clearing:"+hm);
			
			//2.isEmpty()
			System.out.println(hm.isEmpty());
			
			hm.put(1,"HAI");
			hm.put(2,"AG");
			hm.put(3,"HELLO");
			System.out.println("Mappings are:"+hm);
			
			//3.containsKey()
			System.out.println("Is Key 2 Present:"+hm.containsKey(2));
			System.out.println(hm2);
			System.out.println("Is Key  Present:"+hm.containsKey(3));
	
			//4.containsValue()
			System.out.println("Is value Present:"+hm2.containsValue("AG"));
			
			//5.get()
			
			System.out.println("value is:"+hm.get(1));
			System.out.println("value is:"+hm.get("HAI"));
			
			
			
			//6.toString
			ArrayList<AbstractMap.SimpleEntry<String, String> >
            arrayList = new ArrayList<AbstractMap.SimpleEntry<String, String> >();
  
        // add values
            
        arrayList.add(new AbstractMap.SimpleEntry(" 001AB ", " Emp 1"));
        arrayList.add(new AbstractMap.SimpleEntry(" 011AC ", " Emp 2"));
        arrayList.add(new AbstractMap.SimpleEntry(" 111AD ", " Emp 3"));
        arrayList.add(new AbstractMap.SimpleEntry(" 101BE ", " Emp 4"));
        arrayList.add(new AbstractMap.SimpleEntry(" 110CE ", " Emp 5"));
  
        // print keys
        for (int i = 0; i < arrayList.size(); i++) {
  
            // get map from list
            AbstractMap.SimpleEntry<String, String> map= arrayList.get(i);
  
            // get representation of map using toString()
            String value = map.toString();
  
            System.out.println(value);
        }
	}
}

			
	

