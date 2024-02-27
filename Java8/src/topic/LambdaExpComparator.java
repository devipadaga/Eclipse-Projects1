package topic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product
{
	int id;
	String name;


public Product(int id,String name)
{
	this.id=id;
	this.name=name;
	
	}
}

public class LambdaExpComparator {

	public static void main(String[] args) {
		
		List<Product> list=new ArrayList<>();
		list.add(new Product(1,"Laptop"));
		list.add(new Product(2,"Mobile"));
		list.add(new Product(3,"Ipad"));
		
		Collections.sort(list,(p1,p2)->{
		return p1.name.compareTo(p2.name);
		});
		
		for(Product p:list)
		{
			System.out.println(p.id+" : "+p.name);
		}
		
	}

}
