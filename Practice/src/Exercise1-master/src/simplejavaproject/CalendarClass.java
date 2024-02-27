package simplejavaproject;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalendarClass {
	static Calendar c;

	public static void main(String[] args) {

    
		
		Calendar c=Calendar.getInstance();
		
		Date d=c.getTime();
		
		System.out.println(d);
		
		Calendar ca=(Calendar) c.clone();
		System.out.println(ca.getTime());
//		TimeZone timezone=c.getTimeZone();
//		System.out.println(d);
//		System.out.println(timezone.getDisplayName());
//		
//		int i=Calendar.DATE;
//		System.out.println(i);
//		c.add(Calendar.DATE, 12);
//		System.out.println(c.getTime());
//		c.add(Calendar.DAY_OF_MONTH, 10);  
//        // print the modified date and time  
//      System.out.println("" + c.getTime());      
	}

}
