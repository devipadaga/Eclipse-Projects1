package Concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListToSetConversion {

	public static void main(String[] args) {
		
		List<String> al=new ArrayList();    
		 	// (or)
	//	List<String> al=new ArrayList<>(Arrays.asList("sai","devi","sai"));
		
		al.add("sai");
		al.add("devi");
		al.add("sai");
		
		System.out.println(al);
		
		System.out.println("                              ");
		
		Set<String> hs=new HashSet<String>(al);
		for(String x:hs)
		{
			System.out.println("Created hashset is:"+x+" ");
		}
		System.out.println("                              ");
		Set<String> treeSet = new TreeSet<String>(al);
		for(String y:treeSet)
		{
			System.out.println("Created TreeSet is:"+y+" ");
		}
		

		//*************Another way*****************************************
		
		System.out.println("   Another way                           ");
		
		 List<String> aList = Arrays.asList("sai", "devi",
                 "arunkumar", "sow");

    Set<String> hSet = new HashSet<String>();
    for (String x : aList)
        hSet.add(x);

    System.out.println("Created HashSet is");
    for (String x : hSet)
        System.out.println(x);
    
    //*****************Using addAll***********************************************
    
    List<String> aList1 = Arrays.asList("sai", "devi",
            "arunkumar", "sow");

    	Set<String> hSet1 = new HashSet<String>(aList1);
    	hSet1.addAll(aList1);
    	System.out.println("Created HashSet is");
    	for (String x : hSet1)
    		System.out.println(x);

    	Set<String> tSet = new TreeSet<String>(aList1);
    	tSet.addAll(aList1);
    	System.out.println("Created TreeSet is");
    	for (String x : tSet)
    		System.out.println(x);

	}

}
