package Polymorphism;

    class Tree
    {
    	void eat()
    	{
    		System.out.println("eating in parent class");
    	}
    }
    
    class Cat extends Tree
    {
    	void bark()
    	{
    		System.out.println("Barking in Child class");
    	}
    	
    	void eat()
    	{
    		System.out.println("Eating in child class");
    	}
    	
    	void work()
    	{
    		super.eat();
    		
    	}
    }

public class SuperINVOKINGparentMethod {

	public static void main(String[] args) {
		
		Cat c=new Cat();
		c.work();
		c.bark();
		c.eat();

	}

}
