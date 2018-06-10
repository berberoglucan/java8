package _16.time.localdate;

import java.time.LocalDate;
import java.time.ZoneId;

public class Test4LocalDate {
	public static void main(String[] args) {

		LocalDate dateNow = LocalDate.now();
		System.out.println("Local date now : " + dateNow);
		LocalDate date = LocalDate.now(ZoneId.of("Asia/Singapore"));
		System.out.println("Singapore date now : " + date);
	}
}