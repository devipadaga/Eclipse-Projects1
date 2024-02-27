package Codes;

import java.util.Arrays;

public class Saggregate0AND1 {

	public static void main(String[] args) {
	
		//1.
		int[] a= {1,0,1,0,1,0,1,0,1};
		
		int left=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				int temp=a[left];
				a[left]=a[i];
				a[i]=temp;
			
			
			left++;
		}
	}

	
	 System.out.print("Array after segregation is: ");
	 
     for (int i = 0; i < a.length; i++) {

         // Printing elements in array
         System.out.print(a[i] + " ");
     }
     
     System.out.println();
     
     System.out.println("***************************************");
     
     //2.
     int[] b= {1,0,1,0,1,0,1,0,1,0,1,0,1};
     int count=0;
     
     for(int i=0;i<b.length;i++)
     {
    	 if(b[i]==0)
    	 {
    		 count++;
    	 }
       }
     
     System.out.println("No: of zeros are : "+count);

     
     for(int i=0;i<count;i++)
     {
    	 b[i]=0;
     }
    	 
     for(int i=count;i<b.length;i++)
     {
    	 b[i]=1;
     }
    	 
    	 System.out.println("USING 2ND METHOD : ");
     for (int i = 0; i < b.length; i++) {
 
         System.out.print(b[i] + " ");
     }
        
	 System.out.println();
    	 
    //3.  USING SORT METHOD
     
     
     Arrays.sort(b);
     
     System.out.println("Using SORTING METHOD : ");
     
     for(int i=0;i<b.length;i++)
     {
    	 System.out.print(b[i]+" ");
     }
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
 
}
}
