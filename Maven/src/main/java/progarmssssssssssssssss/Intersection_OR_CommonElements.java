package progarmssssssssssssssss;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection_OR_CommonElements {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		int b[]= {4,5,6,7,8};
		
		HashSet<Integer> s=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			s.add(a[i]);
		}
		
		for(int j=0;j<b.length;j++)
		{
			if(s.contains(b[j]))
			{
				System.out.println(b[j]);
			}
		}
		

	}

}
