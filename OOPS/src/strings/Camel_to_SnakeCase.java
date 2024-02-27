package strings;

public class Camel_to_SnakeCase {
	
	public static String camelToSnake(String s)
	{
		String result="";
		char c=s.charAt(0);
		result+=Character.toLowerCase(c);
		
		for(int i=1;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				result+='_';
				result+=Character.toLowerCase(ch);
			}
			else
			{
				result+=ch;
			}
		}
		return result;
		
	}

	public static void main(String[] args) {
		
		String s = "GeeksForGeeks";       
        System.out.print(camelToSnake(s));		

	}

}
