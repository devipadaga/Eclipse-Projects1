package simplejavaproject;

import java.util.Calendar;

public class CalendaraddExample1 {   
	
	
	 public static void main(String[] args) {  
		 
	      // create a new calendar  
	      Calendar cal =  Calendar.getInstance();  
	      // print the current date and time  
	      System.out.println("" + cal.getTime());        
	// add 9 years   
	      cal.add((Calendar.MONTH), -4);  
	      // print the modified date and time  
	      System.out.println("" + cal.getTime());  
	   }  
	}  