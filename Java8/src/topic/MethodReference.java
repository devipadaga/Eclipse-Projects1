package topic;

import java.util.*;
interface Sayable
{
void say();	
}

	//Static Method Reference

public class MethodReference {
	
	public static void saySomething()
	{
		System.out.println("This is Static Method");
	}
	
	
	// Non-static Method Reference
	
	public void saySomeMore()
	{
		System.out.println("This is Non-Static Method");
	}

	public static void main(String[] args) {
		
		  // Referring static method  
		Sayable s=MethodReference::saySomething;
		   // Calling interface method 
		s.say();
		
		//************************************************************
		//&&&&&&&&&&Referring Non-Static Method
		
		// Creating object  
		MethodReference mf=new MethodReference();
		 // Referring non-static method using reference 
		Sayable s1=mf::saySomeMore;
		   // Calling interface method  
		s1.say();
		
		
		//************************************************************
		 // Referring non-static method using anonymous object  
        Sayable s2 = new MethodReference()::saySomeMore; // You can use anonymous object also  
        // Calling interface method  
        s2.say();  

	}

}
