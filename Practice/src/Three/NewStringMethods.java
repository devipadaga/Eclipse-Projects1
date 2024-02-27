package Three;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;

public class NewStringMethods {

	public static void main(String[] args) {
		
	//Java 8 New String Methods-----> join()
		
		System.out.println(" JAVA 8 NEW STRING METHODS");
		
		String languages = String.join("_", "Java", "HTML", "Python", "CSS", "PHP"); 
        System.out.println(languages);      
        List<String> languageList = Arrays.asList("Java", "HTML", "Python", "CSS", "PHP"); 
        languages = String.join(", ", languageList);
        System.out.println(languages); 
        
        
        System.out.println("----------------------------------------------");
        
        
     // Java 9 New String Methods :: 1. chars() and  2.codePoints().Both return IntStream.
        
        "String".chars().forEach(System.out::println);
        "String".codePoints().forEach(System.out::println);
        
        System.out.println("----------------------------------------------");
        
        
        
     //Java 10 New String Methods-------->No new methods.
        
        
     //Java 11 New String Methods-----> isBlank(), lines(), repeat(), strip(), stripLeading() and stripTrailing().
        
        //1.
        System.out.println("".isBlank());                  
        System.out.println("   ".isBlank());               
        System.out.println("\t \t".isBlank());             
        System.out.println("\n \n".isBlank());            
        System.out.println("STRING".isBlank());            
        System.out.println("String \t \n".isBlank());   
        
       // 2.
        System.out.println("1".repeat(5));
        System.out.println("abc".repeat(3));
        System.out.println("1a2b3c".repeat(2));
        
        //3.strip-----> this method to remove all leading and trailing white spaces of the given string.
        System.out.println("   1   ".strip());
        System.out.println("\t A \t".strip());
        System.out.println("\n A1 \n".strip());
        
        //4.---->removes only leading white spaces of a string.
        System.out.println("    1".stripLeading());
        System.out.println("   11".stripLeading());
        
        //5.---->removes only trailing white spaces of a string.
        System.out.println("   1    ".stripTrailing());
        System.out.println("  11    ".stripTrailing());
        
        //6.----->returns a stream of lines extracted from the given string
        System.out.println("\n\n".lines().count());                //Output : 2
        System.out.println("abc \n xyz".lines().count());          //Output : 2
        System.out.println("123 \n 456 \n".lines().count());       //Output : 2
        
        
    
     //Java 12 New String Methods
        
        
        //1. indent()----->applies indentation for each line of the given string according to supplied value.
        System.out.println("123\nabc\nABC".indent(4));
        
        
        //2.transform()---->applies given Function to the string.
        System.out.println("string".transform(String::toUpperCase));
        
        System.out.println("abc".transform(str -> str.concat("xyz"))
                                .transform(String::toUpperCase));
        
        
        //3.describeConstable()-->returns an Optional containing nominal descriptor for the given string, which is the string itself.
        System.out.println("123".describeConstable().get());
        System.out.println("abc".describeConstable().get());
        
        
        //4.resolveConstantDesc()--->This method resolves the given string as ConstantDesc and returns the string itself.
        System.out.println("Java".resolveConstantDesc(MethodHandles.lookup()));
        System.out.println("Python".resolveConstantDesc(MethodHandles.lookup()));
        System.out.println("JavaScript".resolveConstantDesc(MethodHandles.lookup()));
        
        
     
     //Java 13 New String Methods--------> No new methods.

     //Java 14 New String Methods----------> No new methods.

     //Java 15 New String Methods
        
        //1.formatted()--->This method formats the given string with the supplied arguments. This method is similar to String.format(this, args).
        System.out.println("1) %s 2) %s 3) %s ".formatted("Java", "Python", "JavaScript"));
        
        
        // 2.stripIndent()--->This method removes indentation of the given string at the beginning and at the end of every line.
        System.out.println("   123".stripIndent());
        System.out.println("123   ".stripIndent());
        System.out.println("   123   ".stripIndent());
        
        
        //3.translateEscapes()--->This method returns a string with escape sequences translated as if in a string literal.
        String str = "Tab \t Next Line \n Space \s Single Quote \' Double Quote \" ";
        
        System.out.println(str.translateEscapes());
        
        
     
        
     //Java 16 New String Methods-----------> No new methods.

     //Java 17 New String Methods------------>No new methods.
        
        
      
	}

}
