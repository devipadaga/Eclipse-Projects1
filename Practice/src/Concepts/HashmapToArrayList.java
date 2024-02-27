package Concepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapToArrayList {

	private static final boolean String = false;

	public static void main(String[] args) {
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("ELR",1);
		hm.put("Vjy",1);
		hm.put("HYD",1);
		hm.put("VIZAG",1);
		System.out.println(hm.size());
		System.out.println(hm);
		
/*	Set<String>	keys=hm.keySet();
	ArrayList<String> ListofKeys=new ArrayList<String>(keys);
	for(String k:ListofKeys)
	{
		System.out.print(k+" ");
	}
	
	Collection<Integer> values=hm.values();
	ArrayList<Integer> ListofValues=new ArrayList<Integer>(values);
	for(Integer v:ListofValues)
	{
		System.out.print(v+" ");
		
	}
*/	
	System.out.println();
	
	Set<Entry<String,Integer>> entryset=hm.entrySet();
	ArrayList<Entry<String,Integer>> ListofEntryset=new ArrayList<Entry<String,Integer>>(entryset);
	for(Entry<String,Integer> pairs:ListofEntryset)
	{
		System.out.println(pairs.getKey()+"  "+pairs.getValue());
	}
	}

}
