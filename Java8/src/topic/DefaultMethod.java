package topic;


interface Sayble
{
	default void say()					// default method
	{
		System.out.println("This is Default Method");
	}
	
	abstract void saymore(String msg);		//Abstract Method
	
	
	static void saySomeMore(String msg)		//Static Method
	{
		System.out.println(msg);
	}

}

public class DefaultMethod implements Sayble{
	
	public void saymore(String msg) {		 // implementing abstract method 
		System.out.println(msg);
		
	}

	public static void main(String[] args) {
		
		DefaultMethod dm=new DefaultMethod();
		dm.say();									  // calling default method 
		dm.saymore("This is Abstract Method");			  // calling Abstract Method
		
		Sayble.saySomeMore("This is Static Method");
	}

}
