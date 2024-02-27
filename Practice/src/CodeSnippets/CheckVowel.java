package CodeSnippets;

public class CheckVowel {

	public static void main(String[] args) {
		
		System.out.println(check("TV"));		//false
		System.out.println(check("Sowmya"));	//true

	}
	
	
	public static Boolean check(String s) {
		
		return	s.toLowerCase().matches(".*[aeiou].*");		//this regex pattern is imp.....
	}

}
