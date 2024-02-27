package Codes;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumINARRAY {
	
	public static void main(String[] args) {
		
		
		
		
		
		
		
		//   NOT GETTING OUTPUT
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
List<Integer>l=new ArrayList<>();
		
		for(int i=1;i<=30;i++)
		{
			l.add(i);
		}
		
		l.add(23);
		System.out.println("Number added is : "+l.add(23));
		
		System.out.println("Duplicate num is : "+DuplicateNum(l));
		

	}

	public static Integer DuplicateNum(List<Integer> input)
	{
		
		int totalarrsum=0;
		for(int i:input)
		{
			totalarrsum+=i;
		}
		
		int highestNum=input.size()-1;
		
		int sumofNNum=(highestNum*(highestNum+1)/2);
		
		return sumofNNum-highestNum;
		
	}
	
}
