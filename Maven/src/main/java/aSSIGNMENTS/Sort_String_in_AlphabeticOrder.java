package aSSIGNMENTS;

public class Sort_String_in_AlphabeticOrder {

	public static void main(String[] args) {
		
		String s="Program";
		s=s.toLowerCase();
		
		for(int i=97;i<=122;i++)
		{
			for(int j=0;j<s.length();j++)
			{
				char c=s.charAt(j);
				if(c==(char)i)
				{
					System.out.print(c);
				}
			}
		}

		
		//another approach
	System.out.println("\n************************");
		char[] ch=s.toCharArray();
		int length=ch.length;
		for(int i=1;i<length;i++)
		{
			for(int j=0;j<length-i;j++)
			{
				if(ch[j]>ch[j+1])
				{
					char temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		System.out.println(ch);
	}

}
