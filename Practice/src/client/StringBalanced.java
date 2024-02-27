package client;

import java.util.Stack;

public class StringBalanced {

	public static void main(String[] args) {
		
		String s="{([)}";
		
		Stack<Character> st=new Stack<>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(st.isEmpty())
			{
				st.push(ch);
			}
			
			else if(ch=='{' || ch=='(' || ch=='[' )
			{
				st.push(ch);
			}
			
			else if(ch=='}' && st.peek()=='{')
			{
				st.pop();
			}
			
			else if(ch==')' && st.peek()=='(')
			{
				st.pop();
			}
			
			else if(ch==']' && st.peek()=='[')
			{
				st.pop();
			}
			
			
		}
		
		if(st.isEmpty())
		{
			System.out.println("String is well Formed");
			
		}
		
		else
			System.out.println("String is not well formed");

	}

}
