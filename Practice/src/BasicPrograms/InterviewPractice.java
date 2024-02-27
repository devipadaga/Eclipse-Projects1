package BasicPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class InterviewPractice {

	public static void main(String[] args) {
		
		//****************Reverse string************************************88
		
		String str="welcome",rev="";
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse string id :"+rev);
		System.out.println("***************************************************");
		
		//*********************Reverse Integer************************************************8
		
		int num=12345,rev1=0;
		while(num!=0)
		{
			int rem=num%10;
			rev1=rev1*10+rem;
			num=num/10;		
		}
			System.out.println("REverse Integer is "+rev1);
			System.out.println("***************************************************");
		
		//***********************SWAPPING****************************************************8
			
			int a=10,b=20;
			System.out.println("Before Swapping 'a':"+a);
			System.out.println("Before Swapping 'b':"+b);
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("After Swapping 'a':"+a);
			System.out.println("After Swapping 'b':"+b);
			System.out.println("***************************************************");
			
		//*****************Count no.of words in given string*******************************************************8	
			
			
		String s="welcome to geeks for geeks";
		int count=1;
		
		for(int i=0;i<=s.length()-1;i++)
		{
		if((s.charAt(i)== ' ') && (s.charAt(i+1)!=' '))
		{
			count++;
		}
		}	
		System.out.println("No:of words are :"+count);
		System.out.println("***************************************************");
		
		//*****************count Duplicates of characters in string *******************************************************88
				//    1. USING HASHMAP
			String s1="javaseleniumjava";
					char[] ch=s1.toCharArray();
					HashMap<Character,Integer> hm=new HashMap();
					for(char c:ch)
					{
						if(hm.containsKey(c))
						{
							hm.put(c, hm.get(c)+1);
						}
						else {
							hm.put(c,1);
						}
					}
					for(Entry<Character,Integer>entry:hm.entrySet())
					{
						if(entry.getValue()>1)
						{
							System.out.println("Duplicate characters :"+entry.getKey()+":"+entry.getValue());
						}
					}
					
				//2.WITHOUT USING HASHMAP
	/*	String s4= "javaseleniumjava";
		int count3=0;
		char[] ch1=s4.toCharArray();
		for(int i=0;i<=s4.length();i++)
		{
			for(int j=i+1;j<=s4.length();j++)
			{
				if(ch1[i]==ch1[j])
				{
					System.out.println("duplicate characters without using hashmap : "+ch1[j]);
					count3++;
					break;

				}
			}
		} */
		//****************duplicate words in string*********************************************
		
		System.out.println("***************************************************");
		String[] names={"welcome","java","selenium","java","welcome"};	
		
		HashMap<String,Integer> hm2=new HashMap<>();
		for(int i=0;i<names.length;i++)
		{
			if(hm2.containsKey(names[i]))
			{
				hm2.put(names[i],hm2.get(names[i])+1);
			}
			else {
				hm2.put(names[i], 1);
			}
		}
		
		/*Set<String> s7=new HashSet<>();
		
		for(String data: names)
		{
			if(s7.add(data)==false)
				System.out.println("duplicate words using array"+data);
		}*/
			
		System.out.println("duplicate words using array :"+hm2);	
		System.out.println("***************************************************");	
			
		//         using split method
		
		String str1 = "This this is is done by Saket Saket";
        String[] split = str1.split(" ");
         
                HashMap<String,Integer> map = new HashMap<String,Integer>();
        for (int i=0; i<split.length; i++) {
            if (map.containsKey(split[i])) {
                int count2 = map.get(split[i]);
                map.put(split[i], count2+1);
            }
            else {
                map.put(split[i], 1);
            }
        }
        System.out.println("using split seeing duplicates :"+map);
        System.out.println("***************************************************");	
			
	//              HashMap Iterator using while and enhanced for_loop		
			
	HashMap<String,Integer> map1=new HashMap<>();
	map1.put("TIRUMALA",1);
	map1.put("DEVI",2);
	map1.put("ARUN",3);
	map1.put("KUMAR",4);
	System.out.println(map1);
	
	Iterator itr=map1.entrySet().iterator();
	while(itr.hasNext())
	{
		Map.Entry<String,Integer> entryset=(Map.Entry<String, Integer>) itr.next();
		System.out.println("using while loop = "+entryset.getKey()+":"+entryset.getValue());
	}
	System.out.println("***************************************************");
	System.out.println("using enhanced for loop = ");
	for(Map.Entry m: map1.entrySet())
	{
		
		System.out.println(m.getKey()+":"+m.getValue());
	}
			
	System.out.println("***************************************************");
	
	//                    Itearting ArrayList using while, For-Loop, Iterator
	
	List<String> l= new ArrayList<>();	
	l.add("sowmya");
	l.add("sow");
	l.add("AG");
	l.add("Honey");
	
	System.out.println(l);
	System.out.println("using iterator");
	Iterator itr1=l.iterator();
	while(itr1.hasNext())
	{
		System.out.print(itr1.next()+" ");  
	}
	System.out.println("using enhanced-for-loop");
	for(String s3:l)
	{
		System.out.print(s3+" ");
	}
	System.out.println("using for loop");
	for(int i=0;i<l.size();i++)
	{
		System.out.print(l.get(i)+" ");
	}
	}

}
