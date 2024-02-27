package strings;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="  India     Is My    Country",nowhitesapce="";
		System.out.println(s);
		
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)!=' ')&&(s.charAt(i)!='\t'))
			{
				nowhitesapce=nowhitesapce+s.charAt(i);
			}
						
		}
		System.out.println(nowhitesapce);
	}

}
