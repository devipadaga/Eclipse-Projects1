package topic;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoin {

	public static void main(String[] args) {
		
		//Adding delimiter (,)
		StringJoiner sj=new StringJoiner(",");
		sj.add("Sowmya");
		sj.add("Arun");
		
		System.out.println(sj);
		
		
		//Adding delimiter,prefix and suffix
		StringJoiner sj1=new StringJoiner(",","[","]");
		sj1.add("Devi");
		sj1.add("Arun");
		
		System.out.println(sj1);
		
		
		//merging two StringJoiners
		
		StringJoiner merge=sj.merge(sj1);
		System.out.println("merging two StringJoiners : "+ merge);
		
	//**********************************************************************
		
		System.out.println("***************************************");
		System.out.println("*********StringJoiner Methods*********");
		
							//METHODS
		
		StringJoiner joinNames = new StringJoiner(",");    
        
        // Prints nothing because it is empty  
        System.out.println(joinNames);  
          
        // We can set default empty value.  
        joinNames.setEmptyValue("It is empty");  
        System.out.println(joinNames);  
          
          
        // Adding values to StringJoiner  
        joinNames.add("Rahul");  
        joinNames.add("Raju");  
        System.out.println(joinNames);  
          
        // Returns length of StringJoiner  
        int length = joinNames.length();  
        System.out.println("Length: "+length);  
          
        // Returns StringJoiner as String type   
        String str = joinNames.toString();  
        System.out.println(str);  
          
        // Now, we can apply String methods on it  
        char ch = str.charAt(3);  
        System.out.println("Character at index 3: "+ch);  
          
        // Adding one more element   
        joinNames.add("Sorabh");  
        System.out.println(joinNames);  
          
        // Returns length  
        int newLength = joinNames.length();  
        System.out.println("New Length: "+newLength);  
        
        
        System.out.println("***************************************");
        System.out.println("StringJoiner using ArrayList");
        
        ArrayList<String> al=new ArrayList<>();
        al.add("Tirumala");
        al.add("Kumar");
        al.add("Honey");
        al.add("AG");
        
        
        StringJoiner names=new StringJoiner(",");
        
        names.add(al.get(0)).add(al.get(1));
        System.out.println(names);
        
        StringJoiner names2=new StringJoiner(":");
        names2.add(al.get(2)).add(al.get(3));
        
        names.merge(names2);
        System.out.println("Names after MERGING : "+names);
        System.out.println(names.toString());
        System.out.println(names.length());
        
        
        
    }  
}  

	
