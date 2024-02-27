package BasicPrograms;

public class PalindromeString {

	public static void main(String[] args) {
	
	/*	String s = "Kayak";    
        boolean flag = true;    
            
        //Converts the given string into lowercase    
        s = s.toLowerCase();    
            
        //Iterate the string forward and backward, compare one character at a time     
        //till middle of the string is reached
        
        for(int i = 0; i < s.length()/2; i++){    
            if(s.charAt(i) != s.charAt(s.length()-i-1)){    
                flag = false;    
                break;    
            }    
        }    
        if(flag)    
            System.out.println("Given string is palindrome");    
        else    
            System.out.println("Given string is not a palindrome");  
            
            */
		
		
/*		int a = 12331;
		String s = Integer.toString(a);
		char[] c = s.toCharArray();
		String t = "KayaK",s="";
		for(int i = t.length()-1;i>=0;i--)
		{
			
			System.out.print(t.charAt(i));
			s=s+t.charAt(i);
		}
		System.out.println("");
		
	//	int b = Integer.valueOf(t);
		if(t==s)
		{
			System.out.println("No is palindrome");
		}else
		{
			System.out.println("No is not palindrome");
		}
		
	*/
		
		String s="madam",rev="";
		String org_str=s;
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	
		if(org_str.equals(rev))
		{
			System.out.println("Given string is a Palindrome");
		}
		else
		{
			System.out.println("Given string not a Palindrome");
		}
		

	}


	}


