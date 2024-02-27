package ALL;
import java.util.*;

import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

public class Synchronized_ARRAYLIST {

	public static void main(String[] args) {
		
		List<String> syncAL=Collections.synchronizedList(new ArrayList<String>());
		
		 //Adding elements to synchronized ArrayList
		syncAL.add("Basketball");
		syncAL.add("Baseball");
		syncAL.add("Football");
		
		System.out.println("Synchronized ArrayList Iteration:");
		synchronized (syncAL) {
			Iterator <String> itr=syncAL.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
		}

//Method 2 :Using CopyOnWriteArrayList
		CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();

	    //Adding elements to synchronized ArrayList
	    al.add("Basketball");
	    al.add("Baseball");
	    al.add("Football");

	    System.out.println("**************************\n"
	    		+ "USING METHOD 2\nShowing synchronized ArrayList Elements:");
	    //Synchronized block is not required in this method
	    Iterator<String> iterator = al.iterator(); 
	    while (iterator.hasNext())
	       System.out.println(iterator.next());
	    
	}

}
