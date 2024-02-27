package simplejavaproject;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Gregorian {

	public static void main(String[] args) {

		String months[] = { "January", "February", "March", "April",   
				"May", "June", "July", "August",   
				"September", "October", "November", "December" };   

		// creating an array for storing AM(Morning) and PM(Evening)  
		String arr[] = { "AM", "PM" };   

		GregorianCalendar obj = new GregorianCalendar();   

		// Showing the time, date, locale, and time zone  
		System.out.print("Today's date = "  
				+ obj.get(Calendar.DATE) + " "  
				+ months[obj.get(Calendar.MONTH)] + ", "  
				+ obj.get(Calendar.YEAR) + "\n"  
				+ "Current time = "  
				+ obj.get(Calendar.HOUR) + "-"  
				+ obj.get(Calendar.MINUTE) + "-"  
				+ obj.get(Calendar.SECOND) + " "  
				+ arr[obj.get(Calendar.AM_PM)] + "\n"  
				+ "Current Time Zone = " + obj.getTimeZone().getDisplayName()   
				+ "\n"  
				+ "Locale = "  
				+ Locale.getDefault().getDisplayName());   

	}

}
