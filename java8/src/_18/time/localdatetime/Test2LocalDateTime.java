package _18.time.localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test2LocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println(ldt);
		
		LocalDate date = ldt.toLocalDate();
		
		System.out.println(date);
		
		LocalTime time = ldt.toLocalTime();
		
		System.out.println(time);
		
		
		int hour = ldt.getHour();
		int minute = ldt.getMinute();
		int year = ldt.getYear();
		Month m = ldt.getMonth();
		DayOfWeek day = ldt.getDayOfWeek();
		
		int dayOfYear = ldt.getDayOfYear();
		
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(year);
		System.out.println(m);
		System.out.println(day);
		System.out.println(dayOfYear);
		

	}

}
