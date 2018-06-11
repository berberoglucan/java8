package _26.trywith.resources;

import java.util.Scanner;

public class Test2TryWithResources {

	public static void main(String[] args) {

		// close metodunu cagirmaya gerek yok!

		try (Scanner scan = new Scanner(System.in)) {
			scan.nextLine();
			scan.close();
		}

		try (Scanner s2 = new Scanner(System.in)) {
			s2.nextLine();
		} catch (Exception e) {
			// s2.nextLine(); // DOES NOT COMPILE
		} finally {
			// s2.nextLine(); // DOES NOT COMPILE
		}

		// The problem is that Scanner has gone out of scope at the end of the try
		// clause
	}

}
