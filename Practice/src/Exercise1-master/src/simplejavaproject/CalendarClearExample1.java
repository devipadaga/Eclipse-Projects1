package simplejavaproject;

import java.util.Calendar;

public class CalendarClearExample1 {      
	   public static void main(String[] args) {  
	      // create a calendar  
	       Calendar cal = (Calendar) Calendar.getInstance();  
	      // display the current date and time  
	      System.out.println("Current Calendar Date: " + cal.getTime());  
	      // use clear method to set year as undefined.  
	       cal.clear(Calendar.SECOND);  
	      // print the result  
	     System.out.println("The calendar shows : " + cal.getTime());        
	   }  
	}  