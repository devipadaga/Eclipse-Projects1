package simplejavaproject;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendargetactualmaximumExample1 {  
	   public static void main(String[] args) {  
	      // create a calendar  
	      Calendar cal1 = Calendar.getInstance();  
	     GregorianCalendar cal2 = (GregorianCalendar) GregorianCalendar.getInstance(); 
	     GregorianCalendar cal3= (GregorianCalendar) Calendar.getInstance();
	      // get the maximum value that year field can have  
	      int year = cal1.getActualMaximum(Calendar.YEAR);  
	      int year2 = cal2.getActualMaximum(GregorianCalendar.YEAR);  
	      System.out.println("Maximum year value of Calendar is:" + year);  
	System.out.println("Maximum year value of Gregorian Calendar is :" + year2);     
	   }  
	}  