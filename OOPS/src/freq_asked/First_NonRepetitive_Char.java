package freq_asked;

public class First_NonRepetitive_Char {

	public static void main(String[] args) {
		
		String s="eter";
		char[] ch=s.toCharArray();
		
		for(char c:ch)
		{
			if(s.indexOf(c)==s.lastIndexOf(c))
			{
				System.out.println("First Non-Repetitive char is : "+c);
				break;
			}
		}

	}

}
