package Concepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicatesInArray {

	public static void main(String[] args) {
		
		   // String[] names=new String[]{"java","phythan","rubby","java","java","phythan"};
		    String[] names= {"java","phython","java","ruby"};
		    
		        HashMap<String,Integer> hm=new HashMap<String,Integer>();
		        for (int i=0;i< names.length;i++)
		        {
		        if(hm.containsKey(names[i]))
		        {
		       
		           hm.put(names[i],hm.get(names[i])+1);
		        }
		        else{
		        	hm.put(names[i],1);
		        }

		        }
		        //System.out.println(hm);  
		        		//or
		        
		        for(Entry<String,Integer>entry:hm.entrySet())
				{
					if(entry.getValue()>1)
					{
						System.out.println(entry.getKey()+":"+entry.getValue());
					}
				}
		    }
		}

	



