package Demo;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringConcat {

	public static void main(String[] args) {

		String s="Sachin"+" Tendulkar";  
		System.out.println(s); 
		//String s=(new StringBuilder()).append("Sachin").append(" Tendulkar).toString(); 

		String str=50+30+"Sachin"+40+40;  
		System.out.println(str);//80Sachin4040 

		//USING CONCAT
		String s1="Sachin ";  
		String s2="Tendulkar";  
		String s3=s1.concat(s2);  
		System.out.println(s3);

		//Using StringBuilder
		StringBuilder s4 = new StringBuilder("String");     
		StringBuilder s5 = new StringBuilder(" Builder");     
		StringBuilder sb = s4.append(s5);   
		System.out.println(sb.toString());   


		//using format method
		String s6 = new String("Hello");     
		String s7 = new String(" World");     
		String sf = String.format("%s%s",s6,s7);     
		System.out.println(sf);  

		//String.join method
		String s8 = new String("String");    
		String s9 = new String(" joinMethod");     
		String sj = String.join("",s8,s9);   
		System.out.println(sj);   


		//Using StringJoiner class
		StringJoiner sjoin = new StringJoiner(", ");     
		sjoin.add("String");       
		sjoin.add("Joiner Class");     
		System.out.println(sjoin);   
		
		//using Collectors.joining() method
		List<String> liststr = Arrays.asList("abc", "pqr", "xyz");   
	    String str1 = liststr.stream().collect(Collectors.joining(" "));  
	        System.out.println(str1); 

	}

}
