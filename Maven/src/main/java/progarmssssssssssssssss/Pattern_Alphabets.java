package progarmssssssssssssssss;

public class Pattern_Alphabets {

	
	//  letter y
	public static void main(String[] args) {
	
		int count = 0;  
        
//        for(int i=0;i<=6;i++)
//        {  
//            for(int j=0;j<=6;j++)
//            {  
//                if(j==count||j==6-count&&i<=6/2)
//                {  
//                    System.out.printf("*");  
//                }
//                else
//                {  
//                    System.out.printf("-");  
//                }  
//            }  
//            if(i<6/2){  
//                count=count+1;  
//            }  
//            System.out.printf("\n");  
//        }  
        
        //letter X
//        int count1=0;
//        for(int i=0;i<=6;i++)
//        {
//        	for(int j=0;j<=6;j++)
//        	{
//        		if(j==count1||j==6-count1)
//        		{
//        			System.out.print("*");
//        			
//        		}
//        		else
//                {  
//                    System.out.print("-");  
//                }  
//        	}
//        	 count1=count1+1;
//        	 System.out.printf("\n");
//        }
		
		//letter T
		
		
//       for(int i=0;i<=6;i++)
//       {
//       	for(int j=0;j<=6;j++)
//       	{
//       		if(i==0)
//       		{
//       			System.out.print("* ");
//       			
//       		}
//       		else if(j==6/2)
//       		{
//       			System.out.print("* ");
//       			
//       		}
//       		else
//               {  
//                   System.out.print("- ");  
//               }  
//       	}
//       	 
//       	 System.out.printf("\n");
//    }  
		
		
		int x, z; 

        for (x = 0; x < 5; x++) {
            for (z = 0; z < 5; z++) {
                if ((z == 2 && x > 1) || (x == z && z < 2) || (x == 0 && z == 4) || (x == 1 && z == 3)) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

	}
}


