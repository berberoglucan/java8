package _23.time.chronounit;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Test1ChronoUnit {

	public static void main(String[] args) {
		
		LocalTime one = LocalTime.of(5, 15);
		
		LocalTime two = LocalTime.of(6, 30);
		
		LocalDate date = LocalDate.of(2014, 5, 21);
		
		LocalDate dateNow = LocalDate.now();
		
		System.out.println(ChronoUnit.HOURS.between(one, two)); // 1
		
		System.out.println(ChronoUnit.MINUTES.between(one, two)); // 75
		
		System.out.println(ChronoUnit.YEARS.between(date, dateNow)); // 4 years
		
		System.out.println(ChronoUnit.MONTHS.between(date, dateNow)); // 48 months
		
	}

}
