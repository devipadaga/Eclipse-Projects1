package simplejavaproject;

import java.util.Calendar;

public class CalendargetExample1 {  
public static void main(String[] args) {  
    // creating a calendar named  as cal1  
    Calendar cal1 = Calendar.getInstance();  
    //  DATE field is passed as parameter to get method  
    System.out.println("Day of month is: " +  
                        cal1.get(Calendar.DATE));  
    //  MONTH field DATE field is passed as parameter to get method  
    System.out.println("Month of year is: " +  
                        cal1.get(Calendar.MONTH));  
    //  YEAR field DATE field is passed as parameter to get method  
    System.out.println("and year is : " +   
                        cal1.get(Calendar.YEAR));  
    System.out.println("Today is "+cal1.get(Calendar.DATE) + " Day  of " + cal1.get(Calendar.MONTH)  
    + " Month  of  the year " + cal1.get(Calendar.YEAR) );  
}  
}  