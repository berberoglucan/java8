package _22.time.duration;

import java.time.Duration;
import java.time.LocalTime;

public class Test1Duration {

	// Duration -> Time (saat , dakika , saniye vs )
	
	public static void main(String[] args) {

		LocalTime localTime = LocalTime.of(10, 30);

		LocalTime now = LocalTime.now();

		Duration d1 = Duration.between(localTime, now); // PT-9H-6M-11.397S // negative
		Duration d2 = Duration.between(now, localTime); // PT9H6M11.397S

		System.out.println(d1);

		System.out.println(d2);
		
		// PT Duration
		// H Hour
		// M Minute
		// S Second
	}

}
