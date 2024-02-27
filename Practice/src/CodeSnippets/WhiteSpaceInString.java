package CodeSnippets;

			// Character.isWhitespace METHOD TO REMOVE SPACES

public class WhiteSpaceInString {

	public static void main(String[] args) {
		
		System.out.println(removeWhiteSpaces("HII HELLO VANAKKAM NAMASTHE AADHAB..... "));

	}
	
	public static String removeWhiteSpaces(String input){
		StringBuilder sb = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		
		for(char c : charArray) {
			if (!Character.isWhitespace(c))
				sb.append(c);
		}
		
		return sb.toString();
	}


}
