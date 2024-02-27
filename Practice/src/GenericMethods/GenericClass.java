package GenericMethods;

public class GenericClass<T1,T2> {
	
	public void Display(T1 ele1,T2 ele2)
	{
		System.out.println("Name is : "+ele1+" : "+"ID is : "+ele2);
	}
	
	public void Print(T1 t,T2 t2)
	{
		System.out.println(t);
		System.out.println(t2);
	}
	
	

	public static void main(String[] args) {
		
		GenericClass<String,Integer> gc=new GenericClass<>();
		gc.Display("Sowmya",1);
		gc.Display("Arun",2);
		
		GenericClass<Integer,String> gc1=new GenericClass<>();
		gc1.Print(1,"Devi");

	}

}
