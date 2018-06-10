package _12.stream.terminal;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Test5Reduce {

	// Optional<T> reduce(BinaryOperator<T> accumulator);

	public static void main(String[] args) {

		Stream<String> s1 = Stream.of("w", "o", "l", "f");

		// BinaryOperator<String> bo2 = String::concat;
		BinaryOperator<String> bo = (str1, str2) -> str1 + str2;
		// T apply(T t, T u);

		Optional<String> opt = s1.reduce(bo);

		System.out.println(opt.get());

		//
		System.out.println("---------------------------");

		Stream<String> s2 = Stream.of("w", "o", "l", "f");

		// baþa / ekler
		String reduced = s2.reduce("/", bo);

		System.out.println(reduced);

		//
		System.out.println("---------------------------");

		Stream<Integer> s3 = Stream.of(1, 3, 4);

		System.out.println(s3.reduce(2, (a, b) -> a * b)); // (1 * 3* 4) * 2 = 48;

	}

}
