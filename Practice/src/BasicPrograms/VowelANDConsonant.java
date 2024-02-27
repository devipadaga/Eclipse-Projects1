package BasicPrograms;

public class VowelANDConsonant {

	public static void main(String[] args) {
		
		//       1.FIRST APPROACH
		
		char ch='a';
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch+" is vowel");
		}
		
		else
		{
			System.out.println(ch+" is consonant");
		}
	
	//    2.SECOND APPROACH
		
		System.out.println("USING 2ND APPROACH");
		
		switch(ch) 
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch+" is vowel");
		break;
		
		default:
			System.out.println(ch+" is consonant");
		
		
		
		}
	
	}

}
