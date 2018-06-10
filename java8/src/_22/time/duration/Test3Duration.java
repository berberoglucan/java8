package _22.time.duration;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Test3Duration {

	public static void main(String[] args) {
		
		long minuteToSecond = Duration.of(1, ChronoUnit.MINUTES).getSeconds();
		
		long hourToSecond = Duration.of(1, ChronoUnit.HOURS).getSeconds();
		
		long dayToSecond = Duration.of(1, ChronoUnit.DAYS).getSeconds();
		
		
		System.out.println(minuteToSecond);
		System.out.println(hourToSecond);
		System.out.println(dayToSecond);
		
	}

}
