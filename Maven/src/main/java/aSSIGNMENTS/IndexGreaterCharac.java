package aSSIGNMENTS;

public class IndexGreaterCharac {

	public static void main(String[] args) {

		String s="Jayesh";
		//output:-Jysh

		int n=s.length();
		char[] alpha = new char[26];
		for(int i=0;i<26;i++){
			alpha[i]=(char)('a'+i);
		}

		System.out.println(alpha);
		for(int i=0;i<n;i++)
		{
			char c=s.toLowerCase().charAt(i);
			if(c>=alpha[5])
			{
				System.out.print(s.charAt(i));
			}

		}
	}

}


