package aSSIGNMENTS;

public class ReverseSentence {

	public static void main(String[] args) {


		String s ="My name is Devi";
		//System.out.println("Original String :"+s);
		String[] eachWords=s.split(" ");

	     
		String revWord="",revString="";		
		for(int i=0;i<eachWords.length;i++)
		{
			 String word = eachWords[i]+" ";
			for(int j=word.length()-1;j>=0;j--)
			{
				revWord=revWord+word.charAt(j);		
			}
			
		}
		
		revString=revString+revWord+" ";
		System.out.println("Reverese String :"+revString.trim());
		
		
//		String sbWord="";
//		StringBuilder sb=new StringBuilder(s);
//		sb.reverse();
//		sbWord+=sb.toString()+"";
//		System.out.println("USING STRINGBUILDER :"+sbWord);
	}
}
