package progarmssssssssssssssss;

public class Pattern {
	
	/*
	 		1
			22
			333
			4444
			55555
	 */
	public static void Pattern1(int rows)
	{
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
	}
	
	/*
	 			* * * * *
	 			* * * *
	 			* * *
	 			* *
	 			*
	 */
	
	public static void Pattern2(int rows)
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
	
	
	
	/*
	 			1 2 3 4 5 
				6 7 8 9 
				10 11 12 
				13 14 
				15 
	 */
	
	public static void increasingRytTriangleNum(int rows,int kvalue)
	{
		int k=kvalue;
		for(int i=rows;i>=1;i--)
		{		
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println(" ");
		}
	}
	
	/*
	 			    *
	 			   **
	 			  ***
                 ****
                *****
	 */
	
	public static void Pattern3(int rows)
	{
		for (int i = 1; i <= rows; i++)
        {
            for (int j = rows - i; j >= 1; j--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
	}
	

	
				/*	 
				  				  1
   						        2 2 2
  				              3 3 3 3 3
 				            4 4 4 4 4 4 4
			*/
			
			public static void pyramid1(int rows)
			{
			for(int i=0;i<rows;i++)
			{
			for(int j = rows - i; j >= 1; j--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
			}
			
			

			/*	 
			  				1 
		  				  1 2 1
		                1 2 3 2 1
		              1 2 3 4 3 2 1
		*/
			
			public static void PyramidType2()
			{

		        for (int i = 1; i <= 5; i++)
		        {
		            for (int j = 5 - i; j >= 1; j--)
		            {
		                System.out.print(" ");
		            }
		            for (int j = 1; j <= i; j++)
		            {
		                System.out.print(j);
		            }
		            for (int j = i - 1; j >= 1; j--)
		            {
		                System.out.print(j);
		            }
		            System.out.println();
		        }
			}
			
			/*
			
			 			 *********
			 			  *******
			 			   *****
			 			   	***
			 			   	 *
			 */
			
			public static void PyramidReverse()
			{
				for (int i = 5; i >= 1; i--)
		        {
		            for (int j = 5 - i; j >= 1; j--)
		            {
		                System.out.print(" ");
		            }
		            for (int j = 1; j <= 2 * i - 1; j++)
		            {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		    }
						
				/*
				
						123454321
						 1234321
						  12321
						   121
						    1
				 */
							
			public static void PYRAMIDReverse2()
			{
	        for (int i = 5; i >= 1; i--)
	        {
	            for (int j = 5 - i; j >= 1; j--)
	            {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(j);
	            }
	            for (int j = i - 1; j >= 1; j--)
	            {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
			}
	    
			/*
			 		
						    *
						   ***
						  *****
						 *******
						*********
						 *******
						  *****
						   ***
						    *
			 */
			
			public static void Diamond()
			{
				for (int i = 1; i <= 5; i++)
		        {
		            for (int j = 5 - i; j >= 1; j--)
		            {
		                System.out.print(" ");
		            }
		            for (int j = 1; j <= 2 * i - 1; j++)
		            {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		        for (int i = 4; i >= 1; i--)
		        {
		            for (int j = 5 - i; j >= 1; j--)
		            {
		                System.out.print(" ");
		            }
		            for (int j = 1; j <= 2 * i - 1; j++)
		            {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		    }
	

	public static void main(String[] args) {
		
		Pattern1(5);
		System.out.println("----------------------------");
		Pattern2(5);
		System.out.println("----------------------------");
		Pattern3(5);		
		System.out.println("----------------------------");
		increasingRytTriangleNum(5, 1);
		System.out.println("----------------------------");
		pyramid1(5);
		System.out.println("----------------------------");
		PyramidType2();
		System.out.println("----------------------------");
		PyramidReverse();
		System.out.println("----------------------------");
		PYRAMIDReverse2();
		System.out.println("----------------------------");
		Diamond();
		
	}

}
