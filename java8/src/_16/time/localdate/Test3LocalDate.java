package _16.time.localdate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class Test3LocalDate {
	public static void main(String[] args) {

LocalDate date = LocalDate.now();
		
		int dayOfMonth = date.getDayOfMonth();
		int dayOfMonth2 = date.get(ChronoField.DAY_OF_MONTH);
		int dayOfYear = date.getDayOfYear();
		Month m = date.getMonth();
		
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		
		System.out.println(dayOfMonth);
		System.out.println(dayOfMonth2);
		System.out.println(dayOfYear);
		System.out.println(m);
		System.out.println(dayOfWeek);;
	}
}