package _12.stream.terminal;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test2MinMax {

	public static void main(String[] args) {

		Stream<String> animalStream = Stream.of("dog", "monkey", "horse");

		Stream<String> animalStream2 = Stream.of("dog", "monkey", "horse");

		// min

		// int compare(T o1, T o2);
		Comparator<String> comparator = (String str1, String str2) -> str1.length() - str2.length();

		Optional<String> opt = animalStream.min(comparator);

		System.out.println(opt.get());

		// max

		Optional<String> opt2 = animalStream2.max(comparator);

		System.out.println(opt2.get());

		//
		System.out.println("------------------------------");

		IntStream intStream = IntStream.of(10, 59, 1, 7, 2, 78, -1);

		OptionalInt optI = intStream.max();

		System.out.println(optI.getAsInt());

		//
		System.out.println("------------------------------");

		Stream<Integer> stream = Stream.of(2, 47, 12, 350, 14, 250);

		Optional<Integer> opt3 = stream.max((i1, i2) -> i1 - i2);

		System.out.println(opt3.get());

	}

}
