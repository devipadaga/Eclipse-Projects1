package Three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintStringArrayEndsWITHletterA {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<>();
        names.add("Adam");
        names.add("Jhon");
        names.add("Rama");
        names.add("Shama");
        names.add("Smita");
        
        String names1[]=names.toArray(new String[names.size()]);
       int n=names1.length;         
        for(int i=0;i<names1.length;i++)
	    {
	        if(names1[i].endsWith("a"))
	        {
	            System.out.println(names1[i].toUpperCase());
	        }
	    }
        
        List al = Arrays.asList(names1);
        System.out.println("after list conversion :"+al);
        
        
        

	}

}
