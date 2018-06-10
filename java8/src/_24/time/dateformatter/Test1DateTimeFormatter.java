package _24.time.dateformatter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test1DateTimeFormatter {

	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String formatDate = formatter.format(LocalDate.of(2016, 5, 3));
		
		System.out.println(formatDate);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(timeFormatter.format(time));
	}

}
