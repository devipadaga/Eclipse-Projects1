package Three;

public class RemoveVowels {

	public static void main(String[] args) {


		String s="Hyderabad";
        String s1 = "";
//        s1 = s.replaceAll("[aeiou]", ""); 
//        System.out.println("String after removing vowel using replace method  : "+s1); 
//	
		s=s.toLowerCase();
		
		for(int i=0;i<s.length();i++)
		{
					if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' &&
					s.charAt(i)!='u')
					{
						s1=s1+s.charAt(i);
					}
		}
		
		System.out.println("using for loop: "+s1);

	}

}
