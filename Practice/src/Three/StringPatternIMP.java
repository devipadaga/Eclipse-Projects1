package Three;

public class StringPatternIMP {
	
	/*
	B L U E J
	L U E J
	U E J
	E J
	J
	*/

	public static void main(String[] args) {
		
		String s="BLUEJ";
		int index=s.length();
		
		for(int i=0;i<index;i++)
		{
			for(int j=i;j<index;j++)
			{
				System.out.print(s.charAt(j)+" ");
			}
			
			  System.out.println();
		}
		

		
		/*
		 * B B B B B 
			L L L L 
			U U U 
			E E 
			J
		 */
		System.out.println("---------------------------------------");
		String s1="BLUEJ";
		 int index1=0;
	        for(int i=0;i<s1.length();i++) {
	            
	            for(int j=i;j<s1.length();j++) {
	                System.out.print(s1.charAt(index1)+" ");
	            }
	            index1++;
	            System.out.println();
	        }
		
		/*
		 * J
			E E
			U U U
			L L L L
			B B B B B
		 */
		System.out.println("---------------------------------------");
	        String s2="BLUEJ";
	        int index2=s2.length()-1;
	        for(int i=0;i<s2.length();i++) {
	            
	            for(int j=0;j<=i;j++) {
	                System.out.print(s2.charAt(index2)+" ");
	            }
	            index2--;
	            System.out.println();
		        }
		        
		        
		        /*
		         * J 
					E J 
					U E J 
					L U E J 
					B L U E J 

		         */
		        
		        System.out.println("---------------------------------------");
		        String s3="BLUEJ";
				 int index3=s3.length();
			        for(int i=index3-1;i>=0;i--) {
			            
			            for(int j=i;j<s3.length();j++) {
			                System.out.print(s3.charAt(j)+" ");
			            }
			            index3++;
			            System.out.println();
			        }
			        
			        
			 /*
			  	A B C D D C B A
    				A B C C B A
        				A B B A
           					A A			         
			  */
			  
			        
			        System.out.println("-----------------------------------------");
			        String s4="ABCDDCBA";
			        for(int i=0;i<s4.length();i++)
			        {
			        	for(int j=i+1;j<s4.length();j++)
			        	{
			        	System.out.println(s4.charAt(j));
			        	}
			        	System.out.println();
			        }
			        
			        
		        
	}

}
