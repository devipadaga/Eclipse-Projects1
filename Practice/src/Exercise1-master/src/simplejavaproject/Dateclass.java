package simplejavaproject;

import java.util.Date;

public class Dateclass {
	
	public static void main(String [] args) {
		
		
		
		Date date1 =new Date();
		
		System.out.println(date1);
		
	
		//second way
		long millis=System.currentTimeMillis(); 
		
		Date date=new Date(millis); 
		long l=	date.getTime();
		System.out.println(l);
		System.out.println(date);  
	} 

}
