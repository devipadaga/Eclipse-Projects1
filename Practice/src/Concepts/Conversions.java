package Concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Conversions {

	public static void main(String[] args) {
	
	//************Array to ArrayList***************************************
		
		///     1. Using Arrays.asList()
		String[] s= {"Arun","Kumar"};
		
		//List al=Arrays.asList(s);      //through run time error therefore we go for below i.e create new arraylist and pass Arrays.asList()
		List<String> al=new ArrayList<String>(Arrays.asList(s));
		System.out.println(al);
		
		al.add("Tirumala");
		al.add("Devi");
		System.out.println("Using Arrays.asList:"+al);
		
		///         2.Collections.addAll()
		
		String[] s1= {"Tirumala","Devi",};	
		
		 List<String> al1 = new ArrayList<String>();
		 
	        // adding elements of array to arrayList.
	        Collections.addAll(al1,s1);
	 
	        System.out.println("Using Collections.addAll:"+al1);
		
	        ///     3. Manual method to add elements from array to list 
	        
	        String[] s2= {"AG","SOWMYA"};
	        
	        List<String> al2= new ArrayList<String>();	  
	        
	        for(String s3:s2)
	        {
	        	al2.add(s3);
	        	al2.add("hwdhgw");
	        	System.out.println("Using manual :"+al2);	
	        	}
	        
	//*******************ArrayList to Array Conversion**************************************************        

	        //   1. Object[] to array
	        
	  System.out.println("                        ");
	  System.out.println("ARRAYLIST TO ARRAY CONVERSION");
	        
	        List l=new ArrayList();
	        l.add(10);
	        l.add(20);
	        l.add(30);
	        l.add(40);
	        
	      Object[] objects=l.toArray();
	      
	      for(Object obj:objects)
	      {
	    	  System.out.print(obj+"  ");
	      }
	        
	       // 2.
	      
	      List<String> l1=new ArrayList<String>();
	      l1.add("sai");
	      l1.add("baba");
	      l1.add("jhvhjg");
	      
	      String[] arr = new String[al.size()];
	      
	      for(String s11:arr)
	      {
	    	  System.out.println(s11+" ");
	      }
	      
	      
	      //  using 
	      List<Integer> al4 = new ArrayList<Integer>();
	        al4.add(60);
	        al4.add(70);
	        al4.add(80);
	        al4.add(90);
	  
	        Integer[] arr1 = new Integer[al.size()];
	  
	        // ArrayList to Array Conversion
	        for (int i = 0; i < al.size(); i++)
	            arr1[i] = al4.get(i);
	  
	        for (Integer x : arr1)
	            System.out.print(x + " "); 
	        
	 
	        
	}

}
