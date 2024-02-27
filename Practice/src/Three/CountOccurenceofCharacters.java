package Three;

import java.util.ArrayList;
import java.util.List;

public class CountOccurenceofCharacters {
	
	/*
	       int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
		output:1  |  2
		2  |  4
		8  |  1
		3  |  1
		5  |  1
	*/

	public static void main(String[] args) {
		
		 int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
		 
		List<Integer> list=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(!list.contains(arr[i]))
			{
				list.add(arr[i]);
				System.out.println(arr[i]+"|"+count);
			}
			
		}
	}
}
		
		
		
