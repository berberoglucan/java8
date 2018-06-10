package _19.time.zoneddatetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test1ZonedDateTime {

	public static void main(String[] args) {
		
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		
		System.out.println(zoneId);
		
		LocalDateTime ldt = LocalDateTime.now(zoneId);
		
		System.out.println(ldt); // paris date now
		
		ZonedDateTime zdt = ZonedDateTime.of(ldt, zoneId); // paris zone 
		// ZonedDateTime = LocalDateTime + ZoneId
		
		System.out.println(zdt);
		
		ZonedDateTime zdt2 = ZonedDateTime.now();
		
		System.out.println(zdt2); // default zone date and time
		
		LocalDate localDate = zdt2.toLocalDate();
		LocalTime localTime = zdt2.toLocalTime();
		LocalDateTime dateTime = zdt2.toLocalDateTime();
		Instant instant = zdt2.toInstant();
		
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println(dateTime);
		System.out.println(instant); // Greenwich now date and time
	}

}
