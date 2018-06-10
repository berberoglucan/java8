package _22.time.duration;

import java.time.Duration;
import java.time.Period;

public class Test2Duration {

	public static void main(String[] args) {
		
		Duration d1 = Duration.ofDays(1);
		Period p1 = Period.ofDays(1);
		
		System.out.println(d1); // PT24H
		System.out.println(p1); // P1D
		
		Duration d2 = Duration.ofHours(20); // PT20H
		
		Duration d3 = Duration.ofMinutes(10); // PT10M
		
		Duration d4 = Duration.ofSeconds(75); // PT1M15S
		
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
	}

}
