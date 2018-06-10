package _21.time.period;

import java.time.Period;

public class Test2Period {

	public static void main(String[] args) {

		Period p1 = Period.ofYears(2);
		
		Period p2 = Period.ofMonths(4);
		
		Period p3 = Period.ofWeeks(4);
		
		Period p4 = Period.ofDays(20);
		
		System.out.println(p1); // P2Y
		
		System.out.println(p2); // P4M
		
		System.out.println(p3); // P28D
		
		System.out.println(p4); // P20D
		
	}

}
