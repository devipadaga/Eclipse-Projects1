package simplejavaproject;

import java.util.Locale;

public class JavaCalendargetavailablelocalsExample1 {  
public static void main(String args[]) {  
       // an object of local class called strlocal(array) is created   
       Locale[] strlocal = new Locale[5];  
  
      // all available locals are accessed and stored in strlocal  
      strlocal = Locale.getAvailableLocales();  
  
      // print all available locals   
      System.out.println("The first 5 locales installed in runtime environment are :-\n");  
      for (int i = 0; i < 6; i++) {  
         System.out.println(strlocal[i].getISO3Country());  
        }  
   }  
}  