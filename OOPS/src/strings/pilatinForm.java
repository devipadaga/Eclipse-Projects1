package strings;

public class pilatinForm {

	public static void main(String[] args) {
		
		 String s="devi",s1="",s2="",newSt="";	        	        
	        s=s.toUpperCase();
	        int l=s.length();
	        for (int i=0;i<l;i++)
	        {
	            char ch=s.charAt(i);
	            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	            {
	                s2=s2+ch;	                
	            }
	            else
	            {                
	                s1=s1+ch;
	            }
	        }
	        newSt=s2+s1+"AY";
	        System.out.println(newSt);

	}

}
