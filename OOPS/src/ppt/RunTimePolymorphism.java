package ppt;
	
	class Shape{  
		void draw(){
			System.out.println("drawing...");
			}  
	}  
	class Rectangle extends Shape{  
		void draw(){
			System.out.println("drawing rectangle...");
			}  
	}  
	class Circle extends Shape{  
		void draw(){
			System.out.println("drawing circle...");
			}  
	}  
	class Triangle extends Shape{  
		void draw(){
			System.out.println("drawing triangle...");
			}  
	}  



public class RunTimePolymorphism {

	public static void main(String[] args) {
		
		Shape s;
		
		s=new Rectangle();  
		s.draw();  
		
		s=new Circle();  
		s.draw(); 
		
		s=new Triangle();  
		s.draw();  
		 

	}

}


//class A 
//{ 
//void food()
//{ 
//   System.out.println("What kind of food do A eat?"); 
//} 
//} 
//class B extends A
//{ 
//	 void food()
//	  { 
//	     System.out.println("What kind of food do B eat?"); 
//	  } 
//	 
// void food(int x)
// { 
//    System.out.println("B eats flesh"); 
// } 
//} 
//public class Sample 
//{ 
//public static void main(String[] args) 
//{ 
//  A a = new B(); 
//    a.food();  
//	 //a.food(20); 
//
// B b = new B();  
//  b.food();  
//  b.food(10);  
//} 
//}


class Bike
{
	int speedlimit=90;
	}

class Honda extends Bike
{
	int speedlimit=150;
	
	public static void main(String args[])
	{
		Bike b=new Honda();
		System.out.println(b.speedlimit);
	}
	
	}
