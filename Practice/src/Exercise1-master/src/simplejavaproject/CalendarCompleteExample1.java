package simplejavaproject;

import java.util.GregorianCalendar;

public class CalendarCompleteExample1 extends GregorianCalendar {  
	public static void main(String[] args) {  
		// create a new calendar  
		CalendarCompleteExample1 cal = new CalendarCompleteExample1();  
		// print the current date  
		System.out.println("The current date is : " + cal.getTime());  
		// clear the calendar  
		cal.clear();  
		// set a new year and call complete()  
		cal.set(GregorianCalendar.YEAR, 1998);  
		//protected method  
		cal.complete();  
		// print the current date  
		System.out.println("New date is : " + cal.getTime());  

	}
}
