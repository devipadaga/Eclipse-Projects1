package simplejavaproject;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class JavaCalendargetGreatestMinimumExample1 extends GregorianCalendar {  
	   public static void main(String[] args) {  
	  
	      // create a calendar      
	      GregorianCalendar mycal = new GregorianCalendar(2023, 07, 8);  
	        
	      System.out.println(" Date :" + mycal.getTime() );  
	  
	      // print the greatest min. for year field  
	      int outp1 = mycal.getGreatestMinimum(Calendar.YEAR);  
	      System.out.println("The minimum (Year) is: " + outp1);  
	        
	       int outp2 = mycal.getGreatestMinimum(Calendar.MONTH);  
	      System.out.println("The minimum (Month)  is: " + outp2);  
	        
	       int outp3 = mycal.getGreatestMinimum(Calendar.DAY_OF_WEEK);  
	      System.out.println("The minimum (Day) is: " + outp3);  
	   }  
	}  