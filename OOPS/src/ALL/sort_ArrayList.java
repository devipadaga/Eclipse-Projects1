package ALL;

import java.util.ArrayList;
import java.util.Collections;

public class sort_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList();
		al.add("Apple");
		al.add("Banana");
		al.add("Pear");
		al.add("Mango");

        
        System.out.println("ArrayList Before Sorting:");
        for(String s: al){
           System.out.println(s);
        }
        
        Collections.sort(al);
        System.out.println("ArrayList in Ascending order:");
           System.out.println(al);
        

        /* Sorting in decreasing (descending) order*/
           
        Collections.sort(al, Collections.reverseOrder());
      //  Collections.reverse(al);
      
        System.out.println("ArrayList in descending order:");
        for(String str2: al){
           System.out.println(str2);
        }

	}
	

}
