package topic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class  Products
{
	int id;
	String name;
	float price;
	
	public Products(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
}
public class Filter {

	public static void main(String[] args) {
		
		List<Products> list=new ArrayList<>();
		list.add(new Products(1,"Laptop",20000f));
		list.add(new Products(2,"Mobile",32000f));
		list.add(new Products(3,"Ipad",43000f));
		list.add(new Products(4,"Speakers",41000f));
		list.add(new Products(5,"Pendrive",38000f));
		
		
		
		 // using lambda to filter data  
        Stream<Products> filtered_data = list.stream().filter(p -> p.price > 20000);  
          
        // using lambda to iterate through collection  
        filtered_data.forEach(  
            p-> System.out.println(p.name+": "+p.price)  
        );  

	}

}
