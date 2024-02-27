package progarmssssssssssssssss;

import java.util.HashSet;

public class Longest_SUBSTRING {
	
	//input:abcdab
	//output: abcd /bcda/ cdab
	
	//a b c d a b 
	//set====a 
	//1.	a is not in set so add to longestTillNow and longestTillNow length should compare with longestOverall Length.
	//	if tillnow is greater than overall then update the overall value with tillnow.Longest_SUBSTRING.
	//2.	if a is there in set then clear the set and clear the character to till now
		
	//			1.						clear the set and empty till now				2.
	//		longestTillNow=a b c d         longestTillNow=						longestTillNow	=a d
	//		longestOverall=a b c d 			longestOverall=a b c d				longestOverall = a b c d

	public static void main(String[] args) {
		
		String s="abcdab";
		String longestTillNow="",longestOverall="";
		
		
		HashSet<Character> set=new HashSet<>();
		
//		for(int i=0;i<s.length();i++)
//		{
//			char c=s.charAt(i);
//			if(set.contains(c))
//			{
//				set.clear();
//				longestTillNow="";
//				
//			}
//			else
//		{
//			set.add(c);
//			longestTillNow+=c;
//		}
//		}
//		
//		if(longestTillNow.length()>longestOverall.length())
//		{
//			longestOverall=longestTillNow;
//			System.out.println(longestOverall);
//		}

		int j=0;
		for(int i=0;i<s.length();)
		{    
			char c=s.charAt(i);
			if(set.contains(c))
			{
				longestTillNow="";
				set.clear();
				i=++j;
			}
			else {
			set.add(c);
			longestTillNow+=c;
			++i;
			}
			if(longestTillNow.length()>longestOverall.length())
			{
				longestOverall=longestTillNow;
			}

	}
		System.out.println(longestOverall);

}
}
