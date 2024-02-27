package pattern;

import java.util.Iterator;

public class assign {

	public static void main(String[] args) {
		
		/*
		    Jayesh
			a    s
			y    e
			e    y
			s    a
			hseyaJ
		     
		     
		 */
		
		String s="Jayesh";
		
		/*
		 * for(int i=s.length()-1;i>=0;i--)
		 * 
		 * { for(int k=i+1;k<s.length();k++) { System.out.print(s.charAt(s.length()-k));
		 * } for(int j=0;j<=i;j++) { System.out.print(s.charAt(j)); }
		 * System.out.println("");
		 * 
		 * }
		 */
		
		
//		for(int i=0;i<s.length();i++)
//		{
//			for(int k=i+1;k<s.length();k++)
//			{
//				System.out.print(s.charAt(s.length()-k));
//			}
//			
//			for(int j=s.length()-1;j>=0;j--)
//			{
//				System.out.print(s.charAt(j));
//			}
//			
//			System.out.println("");
//		}
		
		System.out.println("*******************************");
		
		String str="jayesh";int k=1;
		for(int i=1;i<=str.length();i++) {
			
			for(int j=0;j<str.length();j++) {
				
				if( (i==1||i==str.length()-1) || (j==1) )
				{
					System.out.print(str.charAt(j));
				
				}
				else if(j==str.length()-1)
				{
					System.out.println(str.charAt(j)-1);
				}
				
				else
					System.out.print(" ");
				
			}
			System.out.println("");
			
		}

	}

}
