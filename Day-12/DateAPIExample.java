package com.day12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAPIExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now(); //current date
		System.out.println("Current date using Local Date :"+date);
		System.out.println("Current date of this month :"+date.getDayOfMonth());

		
		LocalTime time = LocalTime.now(); //current time
		System.out.println("Current time using local time :"+time);
		
		LocalDateTime datetime = LocalDateTime.now();//both current date and time
		System.out.println("Both Current Date and Time: " +datetime);
		
		
	}

}
