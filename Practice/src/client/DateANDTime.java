package client;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateANDTime {

	public static void main(String[] args) {
		
		// to display current date
		LocalDate LD=LocalDate.now();
		System.out.println("Current Date is "+LD);
		
		
		//to display current time
		LocalTime LT=LocalTime.now();
		System.out.println("Current Time is "+LT );
		
		
		//to dispaly both date and time
		LocalDateTime LDT=LocalDateTime.now();
		System.out.println("Current Date and Time is "+ LDT);
		
		
		//to format date and time
		LocalDateTime obj1=LocalDateTime.now();
		System.out.println("Before Modifying Date and Time is "+obj1);
		DateTimeFormatter DF=DateTimeFormatter.ofPattern("dd-MM-yyyy :: HH:mm:ss");
		
		String formattedDate=obj1.format(DF);
		System.out.println("Foramtted Date is  "+ formattedDate);
		
		
		

	}

}
