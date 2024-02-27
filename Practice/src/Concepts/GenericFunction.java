package Concepts;

import java.util.ArrayList;

public class GenericFunction {
	
	public static<T> void GenericMethod(T element)
	{
		System.out.println(element.getClass().getName()+":"+element);
	}

	public static void main(String[] args) {
		
		GenericMethod(11);
		GenericMethod("ArunKumar");
		GenericMethod(4.0);

		 ArrayList<String> al = new ArrayList<String>();
		  
	        al.add("Sachin");
	        al.add("Rahul");
	  
	        // Typecasting is not needed
	        String s1 = al.get(0);
	        String s2 = al.get(1);
	        System.out.printf(s1);
	}

}
