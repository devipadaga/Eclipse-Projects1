package Three;

	/*There are 2 ways:
	 		1.java.util.Date
	 		2.java.sql.Date
	 */
		

public class DateANDTime {

	public static void main(String[] args) {
		
		// Using java.util
			//current Date
		
		java.util.Date date=new java.util.Date();
		System.out.println("Using java.util :"+date);
		
			//Current Time
		
		long millis = System.currentTimeMillis(); 
		java.util.Date date1=new java.util.Date(millis);
		System.out.println("                 "+date1);
		
		
		
		// Using java.sql
			//current Date
		
		 java.sql.Date date2 = new java.sql.Date(millis);       
		 System.out.println("Using java.sql :" +date2); 
		
		
		

	}

}
