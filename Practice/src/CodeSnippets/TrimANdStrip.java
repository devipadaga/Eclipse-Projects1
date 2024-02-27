package CodeSnippets;

	/*The strip() method was added to the String class in Java 11.
		However, the strip() method uses Character.isWhitespace() method to check if the character is a whitespace. 
		  This method uses Unicode code points whereas the trim() method identifies any character having
		     codepoint value less than or equal to ‘U+0020’ as a whitespace character.
	The strip() method is the recommended way to remove whitespaces because it uses the Unicode standard.
	*/

	public class TrimANdStrip {

		public static void main(String[] args) {
		
		String s = "       abc  def\t"
				+ "jhwhcgwhgh\n"
				+ "cwhbc\t                                   hjdchu               ";
		System.out.println("without deleting spaces : "+s);
		System.out.println(DeleteSpacesUsingSTRIP(s));
		System.out.println(DeleteSpacesUsingTRIM(s));
	}
	
	public static String DeleteSpacesUsingSTRIP(String s) {
	
	return s.strip();	
	}
	
	public static String DeleteSpacesUsingTRIM(String s) {
		
		return s.trim();	
	}	

}
