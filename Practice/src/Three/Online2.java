package Three;

import java.util.ArrayList;
import java.util.List;

//	class P{
//	    P()
//	    {
//	        System.out.println("Hello");
//	    }
//	}
//	class C extends P{
//
//	    C(int c)
//	    {
//	    	//super();
//	        System.out.println("Hello World!");
//	    }
//	}
//
//
//
//	public class Online2 {       
//	public static void main(String[] args) {
//		
//		P p=new P();
//        C c=new C(45);
//
//
//	}
//	
//
//}


//class P6{
//P6()
//{
//System.out.println("Hello");}
//
// P6(int i){
// System.out.println("parameterized constructor "+i);}
//}
//class C6 extends P6{
//
// C6()
//{
//	 super(8);
// System.out.println("Hello World!");}
//}
//
//public class Online2 {       
//	public static void main(String[] args) {
//		
//P6 p=new P6();
// C6 c=new C6();
//}
//}


//class P6{
//	P6()
//	{
//		this(9);
//		System.out.println("Hello");
//		}
//	
//	P6(int i){
//		this(7,6); 
// System.out.println("parameterized constructor "+i);
// }
//	
//	P6(int i, int j)
//	{
//		System.out.println(i*j); 
//		}
//}
//public class Online2 {       
//public static void main(String[] args) {
//
//P6 p=new P6();
//P6 p1=new P6(3);
//P6 p3=new P6(5,6);
//}}




//class P6{
// P6()
//{
// this(9);
// System.out.println("Hello"); 
// }
// 
// P6(int i){
// this(7,6);
// System.out.println("parameterized constructor "+i);
// }
// 
// P6(int i, int j){ System.out.println(i*j);
// }
//}
//class C6 extends P6
//{
//	void P6()
//	{
// System.out.println("Constructor overriding");
// }
//
// C6()
//{
// System.out.println("Hello World!");
// }
//}
//
//public class Online2 {       
//	public static void main(String[] args) {
//P6 p=new P6();
//C6 c=new C6();
//	}}




//public class Online2 {       
//	public static void main(String[] args) {
//List<Number> list=new ArrayList<>();
//list.add(7);
//list.add(55.6f);
//list.add(777.4d);
//System.out.println(list);
//	}}





//class Complex {
//
//
// private double re, im;
//
//
//public Complex(double re, double im)
//{
//this.re = re; 
//this.im = im;
//}
//
// Complex(Complex c)
// {
//System.out.println(" constructor called");
//
// re = c.re;
//im = c.im;
//}
//
// @Override 
// public String toString()
// {
// return "(" + re + " + " + im + "i)";
// }
// }
//
//public class Online2 {       
//	public static void main(String[] args) {
//Complex c1 = new Complex(10, 15);
//
// Complex c2 = new Complex(c1);
// Complex c3 = c2;
//
//System.out.println(c2);
// System.out.println(c3);
//	}}


public class Online2 {       
	public static void main(String[] args) {
//for(int i=0;i<10;) {
//    System.out.print(i++ + " ");
//     
//    System.out.print(i+" ");
//    
//    System.out.print(++i + " ");
//    
//    System.out.print(i++ +" ");
//    
//    System.out.println();
//}
		
		String str="bang lore";
        for(int i=0;i<str.length();i++) {
            System.out.print(str.charAt(i)+"");
            if(str.charAt(i)==' ') {
                return;
               
            }
            
        }
}}



