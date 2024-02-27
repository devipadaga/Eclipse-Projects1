package Concepts;

public class StringToIntegerConversion {

	public static void main(String[] args) {
		
	//*****************Using Integer.ParseInt()****************************88
	
		 int decimalExample = Integer.parseInt("20");
	        int signedPositiveExample = Integer.parseInt("+20");
	        int signedNegativeExample = Integer.parseInt("-20");
	        int radixExample = Integer.parseInt("20", 16);
	        int stringExample = Integer.parseInt("geeks", 29);
	 
	        
	        System.out.println(decimalExample);
	        System.out.println(signedPositiveExample);
	        System.out.println(signedNegativeExample);
	        System.out.println(radixExample);
	        System.out.println(stringExample);
	        
	  //******************Using ValueOf****************************   
	        
	        int decimalExample1 = Integer.valueOf("20");
	        int signedPositiveExample1 = Integer.valueOf("+20");
	        int signedNegativeExample1 = Integer.valueOf("-20");
	        int radixExample1 = Integer.valueOf("20", 16);
	        int stringExample1 = Integer.valueOf("geeks", 29);
	 
	       System.out.println("                          ");
	        System.out.println(decimalExample1);
	        System.out.println(signedPositiveExample1);
	        System.out.println(signedNegativeExample1);
	        System.out.println(radixExample1);
	        System.out.println(stringExample1);
	        

	}

}
