package Topics;

import java.util.Date;

public class CurrentDateandTime {

	public static void main(String[] args) {
		
		System.out.println(java.time.LocalDateTime.now());
		System.out.println(java.time.Clock.systemUTC().instant());
		
		java.util.Date date=new java.util.Date();
		System.out.println(date);
		java.util.Date date1=new java.util.Date();
		System.out.println(date1);
		
		 long millis=System.currentTimeMillis();   
		    java.sql.Date date2 = new java.sql.Date(millis);       
		    System.out.println(date2);  
		
	}

}
