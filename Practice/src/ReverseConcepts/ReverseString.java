package ReverseConcepts;

public class ReverseString {

	public static void main(String[] args) {
		
		//        1.
		String s="Selenium",rev="";
	
		
		int length=s.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
		//2.USING STRING BUFFER
		System.out.println("USING STRING BUFFER");
		
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());

		// 3.CONVERTING TO CHAR ARRAY
		
		System.out.println(" USING.CONVERTING TO CHAR ARRAY");
		
		String s1="GeeksforGeeks";
		
		char[] ch=s1.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}

}
