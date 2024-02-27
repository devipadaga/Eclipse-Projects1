package Three;

public class StringProgram {

	public static void main(String[] args) {
		
//		String s="";
//		
//		String character="";
//		String integer="";
//		

		
		String str="Hydar2gls452";
        String character="";
        String integer="";
        for(int i=0;i<str.length();i++) {
            if(Character.isAlphabetic(str.charAt(i))) {
                character=character+str.charAt(i);
            }else if(Character.isDigit(str.charAt(i))) {
                integer=integer+str.charAt(i);
            }
        }
       System.out.println(character+ " "+ integer);
			
       
       
       String s="Hydar2gls452";
       String s1=s.replaceAll("[a-zA-Z]","");
       String s2=s.replaceAll("[0-9]","");
       System.out.println("using replace  :"+s2+","+s1);
       
		
	}

}
