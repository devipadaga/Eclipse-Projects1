package simplejavaproject;

import java.util.Calendar;
import java.util.Date;

public class CalendarbeforeExample1 {  
	public static void main(String[] args) {  
		// create calendar objects.  
		Calendar cal = (Calendar) Calendar.getInstance();  
		Calendar past = (Calendar) Calendar.getInstance();  
		// print the current date  
		System.out.println("Current date: " + cal.getTime());  
		// change year in future calendar  
		past.set(Calendar.YEAR, 2045);  
		System.out.println("Year is " + past.get(Calendar.YEAR));  
		// check if calendar date is after current date  
		Date time = past.getTime();  
		if (past.before(cal)) { 
			
			System.out.println("Date " + time + " is before current date.");  
		}  else {
			System.out.println("Date " + time + " is after current date."); 
		}
	}  
}  