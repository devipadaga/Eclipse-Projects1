package Practice;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		
		// present numbers which are present in the set
		
		HashSet<Integer> numbers=new HashSet<Integer>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		numbers.add(6);
		
		System.out.println(numbers);
		
		numbers.add(7);
		
		for(int i=1;i<=10;i++)
		{
			if(numbers.contains(i))
			{
				System.out.println(i+" is present in the set");
			}
			
			else
			{
				System.out.println(i+" is not present in the set");
			}
		}
		
		
		System.out.println(numbers);
	}

}
