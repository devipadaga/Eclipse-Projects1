package simplejavaproject;

import java.util.Calendar;

public class CalendargetactualminimumExample1 {  
	   public static void main(String[] args) {  
	  // create a calendar  
	      Calendar cal = Calendar.getInstance();  
	  // return the minimum value that Year field can have.  
	      int year = cal.getActualMinimum(Calendar.YEAR);  
	      System.out.println("Minimum year value:" + year);  
	      // return the minimum value that Year field can have.  
	      int Month = cal.getActualMinimum(Calendar.MONTH);  
	      System.out.println("Minimum Month value:" + Month);  
	      // return the minimum value that day field can have.  
	      int day = cal.getActualMinimum(Calendar.DAY_OF_WEEK);  
	      System.out.println("Minimum Day value:" + year);  
	    
	   }  
	}  