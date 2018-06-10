package _21.time.period;

import java.time.LocalDate;
import java.time.Period;

public class Test3Period {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);

		Period p1 = Period.ofMonths(3);

		date = date.plus(p1);

		System.out.println(date);

	}

}
