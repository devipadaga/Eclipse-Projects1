package CodeSnippets;

public class ReverseString {

	public static void main(String[] args) {
		
		//String s="Hello";
		
		System.out.println(reverse("Hello"));

	}
	
	
	
	public static String reverse(String s) {
		
		if(s==null)
			throw new IllegalArgumentException("Null is not Valid");
		
		StringBuilder sb=new StringBuilder();
		
		char[] chars=s.toCharArray();
		
		for(int i=chars.length-1;i>=0;i--)
		{
			sb.append(chars[i]);
		}
		return sb.toString();
		
	}

}
