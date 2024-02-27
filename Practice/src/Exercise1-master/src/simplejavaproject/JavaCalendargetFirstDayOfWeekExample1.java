package simplejavaproject;

import java.util.Calendar;

public class JavaCalendargetFirstDayOfWeekExample1 {  
    public static void main(String[] args) {  
        Calendar calobj = Calendar.getInstance();   
        System.out.println("first day of current week:"  
                + calobj.getFirstDayOfWeek());  
                  
                calobj.add(Calendar.YEAR, 1996);  
                 calobj.add(Calendar.MONTH, 9);  
                  calobj.add(Calendar.DAY_OF_WEEK, 23);  
                    
                  System.out.println("If date is  " + calobj.getTime() + "  then first day of week is  "  
                + calobj.getFirstDayOfWeek());  
                  
        calobj.setFirstDayOfWeek(Calendar.TUESDAY);  
        System.out.println("now first day of week :"   
                + calobj.getFirstDayOfWeek());  
    }  
}  
