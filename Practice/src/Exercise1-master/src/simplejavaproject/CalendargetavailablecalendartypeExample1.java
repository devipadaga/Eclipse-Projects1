package simplejavaproject;

import java.util.Calendar;
import java.util.Set;

public class CalendargetavailablecalendartypeExample1 {  
    public static void main(String[] args) {  
    System.out.println(" All Available Calendar types: ");  
                //method will return all available calendar types   
                //returnd calendar types are stored in a set.  
    Set set = Calendar.getAvailableCalendarTypes();  
                set.forEach((s) -> {  
                 System.out.println(s);  
            });                   
}  
}  