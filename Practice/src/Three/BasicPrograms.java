package Three;

public class BasicPrograms {

	public static void main(String[] args) {
		

	//Java program to count the number of occurrences of any character on String.
		
		String s="Today is a Monday";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
				count++;
				
		}
		System.out.println("count of a is " + count);
		
		
		
	//Java program to the first non repeated character of a given String.
		
		String s1="AToday is a Monday";
		
		
		int count1=0;
		
			for(int i=0;i<s1.length();i++)
			{
				
				for(int j=i+1;j<s1.length();j++)
				{
					
					if(s1.charAt(i)==s1.charAt(j))
					{
						count1++;
					}
				}			
			if(count1==1)
				System.out.println("non repeated character of a given String is :" +s1.charAt(i));
			
			}
		}


	}


