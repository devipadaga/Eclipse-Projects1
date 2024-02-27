package Three;

import java.util.Arrays;

public class StringArrayinASCENDINGORDER {

	public static void main(String[] args) {
		
		String names[] = {"Rohit", "Devesh", "Indrani", "Shivangi", 
				"Himanshu", "Rishi", "Piyush", "Deepak", "Abhishek", "Kunal"};
		System.out.println("Before sorting :"+Arrays.toString(names));
		
		
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					String temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		System.out.println("After sorting :"+Arrays.toString(names));

		
		
		//***************ANOTHER CODE WITH SINGLE WORD*****************************************************************8
		
		
		String s="Grhombus";		
		char[] c=s.toCharArray();
		System.out.println("Before Sorting : "+Arrays.toString(c));
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(c[i]>c[j])
				{
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		
		System.out.println("After sorting : "+Arrays.toString(c));
		
		
	}

}
