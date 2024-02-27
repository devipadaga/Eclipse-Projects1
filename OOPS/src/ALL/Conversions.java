package ALL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Conversions {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<>();
		ll.add("MANGO");
		ll.add("APPLE");
		ll.add("ORANGE");
		ll.add("BANANA");
		ll.add("GUAVA");
		System.out.print("Linked list :"+ll);
		
// Converting LinkedList to ArrayList
		List<String> al=new ArrayList<>(ll);
		System.out.print("\n*****************\nArray list :"+al);
		
//ArrayList to Array
		String[] arr= new String[al.size()];
		arr=al.toArray(arr);
		System.out.println("\n**************************\nArrayList to String Array are:");
		
		for(String str:arr)
		{
			System.out.print(str+"  ");
			
		}
		
	/*   another way to convert HashSet to Array in Java is by traversing the HashSet elements 
		 and add them to the Array object as shown below in the example:
	*/	
		
		HashSet<Integer> hs=new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		System.out.println("\n***********************\nHashSet :"+hs);
		
		Integer[] array=new Integer[hs.size()];
		int index=0;
		
		for(int ele:hs)
		{
			array[index++]=ele;
		}
		
		for(int e:array)
		{
			System.out.println("Array :"+e);
		}
		
//****************ARRAY TO TREESET
		   
	    Integer[] num = {7,34,45,23,38,56,21};
	    //First we convert an Array to List then from list to set
	      
	    List<Integer> list = Arrays.asList(num);
	    Set<Integer> set = new TreeSet<Integer>(list);
	    System.out.println("The Set elements are :");
	    for(Integer var : set)
	    {
	        System.out.println(var);
	  }
	    
//ARRAYLIST TO ARRAY
	    ArrayList<String> l=new ArrayList<>();
	    l.add("delhi");
	    l.add("hyd");
	    
	    //method 1
	    String[] a=new String[l.size()];
	    for(int i=0;i<l.size();i++)
	    {
	    	a[i]=l.get(i);
	    }
	    System.out.println("*******************\nARRAYLIST TO ARRAY");
	    for(String v:a)
	    {
	    	System.out.println(v);
	    }
	    
	    // method 2
	   // ArrayList to String array conversion using toArray()
	      String citinames[]=l.toArray(new String[l.size()]);
	      
	   System.out.println("\nARRAYLIST TO ARRAY  :::::\nMETHOD 2");
	    for(String v:citinames)
	    {
	    	System.out.println(v);
	    }
	    
 //Map to set
	    HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"MANGO");
		hm.put(2,"APPLE");
		hm.put(3,"ORANGE");
		
		//1.
		Set<Integer> set1=new HashSet<>(hm.keySet());
		Set<String> set2=new HashSet<>(hm.values());
		System.out.println("HashMap to Set : : : :");
		System.out.println("Map to set using method 1         "+set1 +" & "+ set2);
		
		//2.using streams
		Set<Integer> s1=hm.keySet().stream().collect(Collectors.toSet());
		Set<String>  s2=hm.values().stream().collect(Collectors.toSet());
		System.out.println("Map to set using method 2(Java 8) "+s1 +" & "+ s2);
		
//HASHSET TO ARRAYLIST
		HashSet<String> hashset = new HashSet<String>();
	    hashset.add("Mango");
	    hashset.add("Banana");
	    System.out.println("HashSet contains : "+ hashset);
	    
	    // Converting HashSet to ArrayList
	    List<String> list1 = new ArrayList<String>(hashset);
	    System.out.println("ArrayList contains :"+list1);
	}

}
