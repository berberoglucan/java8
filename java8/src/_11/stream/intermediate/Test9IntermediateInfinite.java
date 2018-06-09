package _11.stream.intermediate;

import java.util.stream.Stream;

public class Test9IntermediateInfinite {

	public static void main(String[] args) {

		// Stream.generate(() -> "Elsa").filter(n -> n.length() ==4).sorted().limit(2).forEach(System.out::println);
		// infinite datayi sort etmeye calisiyoruz. Mumkun olmadigi icin takilir
		// Exception in thread "main" java.lang.OutOfMemoryError: Java heap space

		// true

		Stream.generate(() -> "Elsa").filter(n -> n.length() == 4).limit(2).sorted().forEach(System.out::println);
	}
}
