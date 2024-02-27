package strings;

import java.util.*;
import java.util.Map.Entry;

public class firstNonRepetitiveCharacter {
	
	
	public static Character firstNonRepeatedCharacterUsingIndexOf(String str)
    {
	 //String inputStr ="teeter";

     for(char i :str.toCharArray()){
     if ( str.indexOf(i) == str.lastIndexOf(i)) {
         System.out.println("First non-repeating character is: "+i);
         break;
     }
     }
	return null;
    }
	
	public static Character firstNonRepeatedCharacter(String str)
    {
	Set<Character> repeatingChars = new HashSet<>();
    List<Character> nonRepeatingChars = new ArrayList<>();
    for(int i=0; i < str.length(); i++) {
        char letter = str.charAt(i);
        if(repeatingChars.contains(letter))
            continue;
        if(nonRepeatingChars.contains(letter)) {
            nonRepeatingChars.remove((Character) letter);
            repeatingChars.add(letter);
        }
        else {
            nonRepeatingChars.add(letter);
        }
    } 
    return nonRepeatingChars.get(0);
    }

	
	public static Character firstNonRepeatedCharacterusingHashMAP(String str)
    {
	HashMap<Character,Integer>  characterhashtable = 
            new LinkedHashMap<Character ,Integer>();
			int length ;
			Character ch;
			length= str.length();  // Scan string and build hash table
			for (int i=0;i < length;i++)
			{
			ch = str.charAt(i);
			if(characterhashtable.containsKey(ch))
			{
			   // increment count corresponding to ch
			   characterhashtable.put(  ch ,  characterhashtable.get(ch) +1 );
			}
			else
			{
			   characterhashtable.put( ch , 1 ) ;
			}
			}
			for(Entry<Character,Integer> entry: characterhashtable.entrySet())
			{
			if(entry.getValue() == 1)
			   return entry.getKey();
			}
			return null;
			}
			   


	public static void main(String[] args) {
	
		//METHOD 1: USING SET AND ARRAYLIST
		

	}

}
