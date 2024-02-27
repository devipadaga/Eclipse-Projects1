package Concepts;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;


//General Example of HashTable

class Book
{
	int id;
	String name,Author,Publisher;
	int quantity;
	

public Book(int id,String name,String Author,String Publisher,int quantity)
{
	this.id=id;
	this.name=name;
	this.Author=Author;
	this.Publisher=Publisher;
	this.quantity=quantity;

}
}

public class GeneralExample {

	public static void main(String[] args) {
		
	Map<Integer,Book> map=new Hashtable<Integer,Book>();
	
	Book b1=new Book(101,"signals","ss","fefeff",10);
	Book b2=new Book(102,"Systems","pp","gdhwguy",20);
	Book b3=new Book(103,"Signals&Systems","SSSS","pppppp",30);
	
	
	map.put(1, b1);
	map.put(2, b2);
	map.put(3, b3);
	
	for(Map.Entry<Integer,Book>e:map.entrySet())
	{
		int a=e.getKey();
		Book b=e.getValue();
		
		System.out.println(b.id+" , "+b.name+" , "+b.Author+" , "+b.Publisher
				+" , " +b.quantity);
	}
	
	

	}

}
