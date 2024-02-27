package topic;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		
		String[] s=new String[10];
		s[5]="TIRUMALA DEVI LOVES ARUN KUMAR";
		
		Optional<String> check=Optional.ofNullable(s[5]);
		
		if(check.isPresent())
		{
			String lowerCase=s[5].toLowerCase();
			System.out.println(lowerCase);	
		}
		
		else
		{
			System.out.println("String is not present");
		}
		
		
		
	System.out.println("*************METHODS************************");	
	
	Optional<String> empty=Optional.empty();
	System.out.println(empty);
	
	 Optional<String> value = Optional.of(s[5]);  
     // If value is present, it returns an Optional otherwise returns an empty Optional  
     System.out.println("Filtered value: "+value.filter((s1)->s.equals("Abc")));  
     System.out.println("Filtered value: "+value.filter((s1)->s.equals("TIRUMALA DEVI LOVES ARUN KUMAR")));
     
     // It returns value of an Optional. if value is not present, it throws an NoSuchElementException    
     System.out.println("Getting value: "+value.get());
 
     // It returns hashCode of the value  
     System.out.println("Getting hashCode: "+value.hashCode()); 
     
     // It returns true if value is present, otherwise false  
     System.out.println("Is value present: "+value.isPresent()); 
     
     // It returns non-empty Optional if value is present, otherwise returns an empty Optional  
     System.out.println("Nullable Optional: "+Optional.ofNullable(s[5])); 
     
     // It returns value if available, otherwise returns specified value,  
     System.out.println("orElse: "+value.orElse("Value is not present"));  
     System.out.println("orElse: "+empty.orElse("Value is not present"));  
     
  // printing value by using method reference
     value.ifPresent(System.out::println);    

	}

}
