package topic;

import java.util.ArrayList;
import java.util.List;

class ProductName{  
    int id;  
    String name;  
    float price; 
    
    public ProductName(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class filterWITHOUTusingSTREAM {  
    public static void main(String[] args) {  
        
    	List<ProductName> productsList = new ArrayList<ProductName>();  
        //Adding Products  
        productsList.add(new ProductName(1,"HP Laptop",25000f));  
        productsList.add(new ProductName(2,"Dell Laptop",30000f));  
        productsList.add(new ProductName(3,"Lenevo Laptop",28000f));  
        productsList.add(new ProductName(4,"Sony Laptop",28000f));  
        productsList.add(new ProductName(5,"Apple Laptop",90000f));
        
        List<Float> productPriceList = new ArrayList<Float>();  
        for(ProductName p: productsList){  
              
            // filtering data of list  
            if(p.price<30000){  
                productPriceList.add(p.price);    // adding price to a productPriceList  
            }  
        }  
        System.out.println(productPriceList);   // displaying data 
        
    }
}
