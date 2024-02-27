package progarmssssssssssssssss;

public class Panagram {
	
		//definition::::Panagram means checks whether string contains all the 26 characters 
	//The five boxing wizards jumps quickly
	//The quick Brown fox jumps over a Lazy Dog
			
	public static void main(String[] args) {

		String str="The quick Brown fox jumps over a Lazy Dog";
		str=str.replaceAll("","").toLowerCase();
			//System.out.println(str.length());
		String s="";
		for(char ch= 'a';ch<= 'z'; ch++)
		{			
			if(str.indexOf(ch)!=-1){
				s=s+ch;		// empty string+character
			}
		}

		if(s.length()==26)
			System.out.println("String is Panagram ");

		else
			System.out.println("Not Panagram");
	}	
}


