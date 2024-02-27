package BasicPrograms;

import java.util.Arrays;

public class Anagram {
	
	public static boolean isAnagram(char[] s1,char[] s2)
	{
		
		int n1=s1.length;
		int n2=s2.length;
		
		if(n1!=n2)
			return false;
		
		Arrays.sort(s1);
        Arrays.sort(s2);
 
        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (s1[i] != s2[i])
                return false;
 
        return true;
	}
	
	public static void main(String[] args) {
		
		char s1[] = { 'p', 'e', 'e', 'k' };
        char s2[] = { 'k', 'e', 'e', 'p' };
       
        if (isAnagram(s1, s2))
            System.out.println("The two strings are anagram of each other");
        else
            System.out.println("The two strings are not anagram of each other");
			
	}

}
