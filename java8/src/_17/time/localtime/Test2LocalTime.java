package _17.time.localtime;

import java.time.LocalTime;

public class Test2LocalTime {

	public static void main(String[] args) {

		LocalTime localTime = LocalTime.now();
		
		System.out.println(localTime);
		
		localTime = localTime.plusHours(4).plusMinutes(25);
		
		System.out.println(localTime);
		
		localTime = localTime.minusSeconds(25).minusHours(3).minusMinutes(50);
		
		System.out.println(localTime);
		
		System.out.println(localTime.isAfter(LocalTime.now()));
		
		System.out.println(localTime.isBefore(LocalTime.now()));
	}

}
