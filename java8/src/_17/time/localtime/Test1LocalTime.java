package _17.time.localtime;

import java.time.LocalTime;

public class Test1LocalTime {

	public static void main(String[] args) {

		LocalTime time = LocalTime.now();

		System.out.println("Time now : " + time);

		LocalTime time2 = LocalTime.of(20, 50);

		LocalTime time3 = LocalTime.of(22, 50, 10);

		LocalTime time4 = LocalTime.of(23, 30, 59, 500);

		LocalTime time5 = LocalTime.parse("21:27");

		LocalTime time6 = LocalTime.parse("21:27:09");

		System.out.println(time2);

		System.out.println(time3);

		System.out.println(time4);

		System.out.println(time5);

		System.out.println(time6);

	}

}
