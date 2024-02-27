package Concepts;

public class IntegerToStringConversion {

	public static void main(String[] args) {
		
		
		// **************888  using toString
		int a = 1234;
	    int b = -1234;
	    String str1 = Integer.toString(a);
	    String str2 = Integer.toString(b);
	    System.out.println("String str1 = " + str1);
	    System.out.println("String str2 = " + str2);
	    
	    //********** using String.valueOf(int)************8
	    
	    int c=30;
	    String str3=String.valueOf(c);
	    System.out.println(str3);

	       			//   (or) we can pass like this
	    
	    String str4=String.valueOf(140).toString();
	    System.out.println(str4);
	    
	    //******************   Integer(int).toString()------ it use instance to invoke into string
	    
	    int d=12345;
	    Integer i=new Integer(d);
	    String str5=i.toString();
	    System.out.println(str5);
	    
	    		// (or)
	    
	    int e=23451;
	    //String str6=new Integer(e).toString();
	    
	    String str6=new Integer(73451).toString();
	    System.out.println(str6);
	    
	    //***********Using String buffer*****************8
	    
	    int f = 1234;
	    StringBuffer sb = new StringBuffer();
	    sb.append(f);
	    String str7 = sb.toString();
	    System.out.println("String str7 = " + str7);
	    
	       //    or
	    
	    String str8=new StringBuffer().append(2222).toString();
	    System.out.println(str8);
	    
	    
	    //************Using StringBuilder*********************
	    
	    String str9=new StringBuilder().append(3333).toString();
	    System.out.println(str9);

	    
	    
	}

}
