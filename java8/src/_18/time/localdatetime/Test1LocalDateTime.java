package _18.time.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test1LocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println(ldt);
		
		LocalDate date = LocalDate.now();
		
		LocalTime time = LocalTime.now();
		
		LocalDateTime ldt2 = LocalDateTime.of(date, time);
		
		System.out.println(ldt2);
		
		LocalDateTime ldt3 = LocalDateTime.of(2018, Month.JUNE, 25, 22, 50);
		
		System.out.println(ldt3);
		
		LocalDateTime parsed = LocalDateTime.parse("2018-01-18T21:35:10.886");
		
		System.out.println(parsed);
	}

}
