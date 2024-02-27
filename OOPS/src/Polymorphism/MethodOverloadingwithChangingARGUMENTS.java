package Polymorphism;

public class MethodOverloadingwithChangingARGUMENTS {
	
	//Definition:If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
	
	static int add(int a,int b)
	{
		return a+b;
	}
	
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		
		System.out.println(add(20, 20));
		
		System.out.println(add(20, 20, 20));
	}

}
