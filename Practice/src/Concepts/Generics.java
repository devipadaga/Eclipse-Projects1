package Concepts;

public class Generics<T,V> {
	T obj1;
	V obj2;
	
	Generics(T obj1,V obj2)
	{
		this.obj1=obj1;
		this.obj2=obj2;
	}
	
	public void print()
	{
		System.out.println(obj1);
		System.out.println(obj2);
	}
	
	public static void main(String[] args) {
		
		Generics<Integer,String> g1=new Generics<Integer,String>(30,"Devi");
		g1.print();
	}

}
