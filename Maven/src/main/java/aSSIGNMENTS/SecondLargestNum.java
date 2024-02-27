package aSSIGNMENTS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SecondLargestNum {

	public static void main(String[] args) {

		int a=90,b=30,c=10;
		
		if(a>b&&a<c || a>c&&a<b)
		{			
			System.out.println(a);
			//System.out.println("b is small");
		}

		else if(b>a&&b<c || b>c&&b<a)
		{
			System.out.println(b);			
		}
		
		else 
		{
		System.out.println(c);
		}
		
		
		//"*****************USING ARRAYS*************************************************"
		
		int arr[]={14, 46, 47, 86, 92, 52, 48, 36, 66, 85};
	    int largest = arr[0];
	    int secondLargest = arr[0];
	   
	    for(int i=0;i<arr.length;i++) 
	    {	 
	      if(arr[i]>largest) 
	      {
	        secondLargest=largest;
	        largest= arr[i];
	 
	      } 
	      else if(arr[i]>secondLargest) 
	      {
	        secondLargest=arr[i];	 
	      }
	    }
	 
	    System.out.println("Second largest number is:" + secondLargest);
	    
	    
	    //********************EVEN AND ODD NUMBER SEPARATION********************************
	    
	    int array[]= {1,2,3,4,5,6,7,8,9,10,11,13,18,22};
	      // output:{1,3,5,7,8,9,11,13,2,4,6,8,10,18,22};
	    System.out.print("org array is :");
	    System.out.println(Arrays.toString(array));
    
	    int size=array.length,temp;
	 
	    for(int i=0;i<size;i++)
	    {
	    	for(int j=i+1;j<size;j++)
	    	{    	
	    	if(array[j]%2!=0)
	    	   {
	    	    temp=array[i];
	    	    array[i]=array[j];
	    	    array[j]=temp;
	    	   }
	    	if(array[j]%2==0)
	    	{
	    		temp=array[i];
	    		array[i]=array[j];
	    		array[j]=temp;
	    	}
	    }
	    }
	    

	    System.out.println("\narray after saggregating  :");
	    System.out.println(Arrays.toString(array));
	   
	    //**************REVERSING THE ARRAY*******************************
	    
	    int[] array1= {22, 18, 10, 8, 6, 4, 2, 13, 11, 9, 7, 5, 3, 1};
	    int index=array1.length-1;
	    for(int i=0;i<array1.length/2;i++) {	        
	            int temp1=array1[i];
	            array1[i]=array1[index];
	            array1[index]=temp1;          
	         index--;
	    }	    
	    System.out.println("Array Reverse :"+Arrays.toString(array1));
	    
	    
	    //************UPPERCASE TO LOWERCASE(String)*****************************
	    
	    String s="Java Is Good";
//	    output:jAVA iS gOOD
	    
	    //******************METHOD 1*********************************************************
	    
//	    String[] str=s.split(" ");
//	    for(String words:str)
//	    {
//	    	String first=words.substring(0,1);
//	    	String next=words.substring(1);    	
//	    	String FinalWord=first.toLowerCase()+next.toUpperCase()+" ";	    
//	    	System.out.print(FinalWord);	    
//	    }
//	    
	    
	    
	    //******************METHOD 2*********************************************************
	    
	    
	    for(int i=0;i<s.length();i++)
	    {
	    	int ch=s.charAt(i);    	
	    	if(ch>64&&ch<91)
	    	{
	    		ch=ch+32;
	    		System.out.print((char)ch);
	    	}	    	
			else if(ch>96&&ch<123)
			{
				ch=ch-32;
				System.out.print((char)ch);
			}
			if(ch==32)
			{
				System.out.print(" ");
			}	
	    }
	    System.out.println();
	    
	    //******************METHOD 3********************************************8
	    String s1="";
	     for(int i=0;i<s.length();i++) {
	         if(s.charAt(i)!=' ') {
	             String t=String.valueOf(s.charAt(i));
	             if(Character.isUpperCase(s.charAt(i))){
	                 t=t.toLowerCase();
	                s1=s1+t;
	             }else {
	                t= t.toUpperCase();
	                 s1=s1+t;
	             }
	         }else {
	             s1=s1+s.charAt(i);
	         }
	     }
	     System.out.println("using 3rd approach :"+s1);
	     
	     //************REMOVE DUPLICATES IN ARRAY*******************************
	     int a1[] = {5,2,6,8,6,7,5,2,8};
	     System.out.println("\nREMOVE DUPLICATES IN ARRAY :");
//	     int a2[]=new int[a1.length];
//	    int j=0;
//	    // o/p:[5, 2, 6, 8, 7]
//	     for(int i=0;i<a1.length-1;i++)
//	     {
//	    		 if(a1[i]!=a1[i+1])
//	    		 {
//	    			 a2[j]=a1[i];
//	    			 j++;
//	    		 
//	    		 arr[j++] = arr[a1.length-1];
//	    		 System.out.print(a2[j]);
//	    	 }
//	    	
//	     }
	     
	     	ArrayList<Integer> al=new ArrayList<>(Arrays.asList(5,2,6,8,6,7,5,2,8));			
			Set<Integer> set=new HashSet<>(al);
			System.out.println("After removing Duplicates :");
			for(Integer NonDup:set)
			{
				System.out.print(NonDup+" ");
			}
	     

}
}
