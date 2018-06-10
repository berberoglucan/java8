package _20.time.instant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test1Instant {

	public static void main(String[] args) {
		
		Instant instant = Instant.now(); 
		
		System.out.println(instant);
		
		
		ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.systemDefault());
		
		System.out.println(zonedDateTime);
		
	}

}
