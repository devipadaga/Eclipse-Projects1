package Three;

import java.util.Arrays;

public class SaggregateEVENandODD {

	public static void main(String[] args) {
		
//		int arr[]=new int[] {2,3,4,5,6,7,8,9};
//		System.out.println("Array before saggregate : "+Arrays.toString(arr));
//		
//		  int left=0;
//		  int right=arr.length-1;
//		  for (int i=0;i< arr.length; i++) {
//		 
//		   while(arr[left]%2==0)
//		   {
//		    left++;
//		   }
//		   while(arr[right]%2==1)
//		   {
//		    right--;
//		   }
//		 
//		   if(left<right)
//		   {
//		    int temp=arr[left];
//		    arr[left]=arr[right];
//		    arr[right]=temp;
////		    left++;
////		    right--;
//		   }
//		  }
//		  
//		  System.out.println("Array After saggregate  : "+Arrays.toString(arr));
//		  
		
		
		
		
		
//		for(int i=0;i<arr.length;i=i+2)
//        {
//            System.out.print(arr[i]+" ");
//        }
//        for(int i=1;i<arr.length;i=i+2)
//        {
//            System.out.print(arr[i]+" ");
//        }

		
		//KAVITHA  CODE
		
		
//		int arr[]=new int[] {2,3,4,5,6,7,8,9};
//		int j=0;
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i]%2==0)
//            {
//                int temp=arr[j];
//                arr[j]=arr[i];
//                arr[i]=temp;
//                j++;
//            }
//        }
//        for(int i=0;i<arr.length;i++)
//        {
//                System.out.print(arr[i]+" ");
//        }
		
		//Jayesh code
		
		
		int arr[]=new int[] {2,3,4,5,6,7,8,9};
        int newarr[]=new int[arr.length];
       int index=0;
       int last=arr.length-1;
           for(int i=0;i<arr.length;i++) {
               if(arr[i]%2==0) {
                   newarr[index++]=arr[i];
                     
               } 
               else {
                   newarr[last--]=arr[i];
               }
               
           }
           
          // Arrays.sort(newarr);
           //arr=newarr;
           System.out.println(Arrays.toString(newarr));
	}

}
