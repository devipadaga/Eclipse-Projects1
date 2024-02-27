package simplejavaproject;

import java.util.Calendar;

public class Lenient {

	public static void main(String[] args) {
		
		Calendar cal=Calendar.getInstance();
		
		boolean b=cal.isLenient();
		
		System.out.println(b);

	}

}
