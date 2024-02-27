package Three;

import java.util.Arrays;

public class ArrayLeftRotation {

	public static void main(String[] args) {
		
		int[] arr=new int[] {1,2,3,4,5};
	   System.out.println("*******ARRAY LEFT ROTATION*************\n>>>>>>>>>>");
       System.out.println(Arrays.toString(arr));
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++) {
            
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
       System.out.println(Arrays.toString(arr));
       
       
       
       //************************************************
       System.out.println("**********************************");
       
       int[] arr1=new int[] {1,2,3,4,5};
       System.out.println(Arrays.toString(arr1));
       int limit=2;
       for(int k=1;k<=limit;k++) {
       int temp1=arr1[0];
       for(int i=0;i<arr1.length-1;i++) {
           
           arr1[i]=arr1[i+1];
       }
       arr1[arr1.length-1]=temp1;
       }
       
      System.out.println(Arrays.toString(arr1));
      
      
      System.out.println("***********************************88");
      
      int[] arr3=new int[] {1,2,3,4,5};
      System.out.println(Arrays.toString(arr3));
      int limit3 =3;
      for(int k=1;k<=limit3;k++)
      {
    	  int temp3=arr3[0];
    	  for(int i=0;i<arr3.length-1;i++)
    	  {
    	  arr3[i]=arr3[i+1];
    	  }
    	  arr3[arr3.length-1]=temp3;
      }
      System.out.println(Arrays.toString(arr3));
      
      
      System.out.println("*********************************************");
      
      int[] a=new int[] {1,2,3,4,5,6,7,8,9};
      
	}

}
