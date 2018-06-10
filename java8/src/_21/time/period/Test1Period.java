package _21.time.period;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test1Period {

	// Period -> Gun , ay , yil , hafta vs
	
	public static void main(String[] args) {

		LocalDate startDate = LocalDate.of(2014, Month.AUGUST, 25);

		LocalDate endDate = LocalDate.now();

		Period period = Period.between(startDate, endDate);

		System.out.println(period); // P3Y9M17D
		

		// P -> Period
		// Y -> Year
		// M -> Month
		// D -> Day
	}

}
