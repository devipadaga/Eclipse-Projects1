package Polymorphism;

public class MethodOverloadingwithChangingDATATYPE {
	
	
	//method overloading is not possible by changing the return type of the method only because of ambiguity.
		// thats y v need to change arguments also....my own words
	
	 int add(int a,int b)
	{
		return a+b;

}
	
	static double add(double a ,double b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		
		MethodOverloadingwithChangingDATATYPE M=new MethodOverloadingwithChangingDATATYPE();
		
		System.out.println(M.add(20, 20));
		System.out.println(add(20.0, 20.0));
		

	}

}
