package _16.time.localdate;

import java.time.LocalDate;
import java.time.Month;

public class Test1LocalDate {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		System.out.println(date);

		LocalDate date1 = LocalDate.of(2018, Month.JUNE, 25);

		System.out.println(date1);

		LocalDate date2 = LocalDate.of(2018, 12, 31);

		System.out.println(date2);

		LocalDate date3 = LocalDate.parse("2016-12-02");

		System.out.println(date3);

		LocalDate date4 = LocalDate.ofEpochDay(1000);

		System.out.println(date4);

		LocalDate date5 = LocalDate.ofYearDay(2018, 36);

		System.out.println(date5);

		// LocalDateTime dateTime = date.atStartOfDay();
		//
		// System.out.println(dateTime);
		//
		// dateTime = date.atTime(20, 14);
		//
		// System.out.println(dateTime);
		//
		// int length = date.lengthOfYear();
		// System.out.println(length);

	}
}
