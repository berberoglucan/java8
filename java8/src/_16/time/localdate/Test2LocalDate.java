package _16.time.localdate;

import java.time.LocalDate;

public class Test2LocalDate {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		date = date.plusMonths(2).plusWeeks(5).plusYears(3);
		
		System.out.println(date);
		
		date = date.minusMonths(2).minusWeeks(5).minusYears(3);
		
		System.out.println(date);
	}
}