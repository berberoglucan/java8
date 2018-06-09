package _11.stream.intermediate;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test2IntermediateFilter {

	public static void main(String[] args) {

		// Stream<T> filter(Predicate<? super T> predicate);

		// Predicate<T> boolean test(T t);

		Stream<String> s1 = Stream.of("can", "cem", "mehmet", "onur", "kadir", "ahmet");

		Predicate<String> pre = s -> s.startsWith("c");

		s1.filter(pre).forEach(System.out::println);

		//s1.filter(str -> str.startsWith("c")).forEach(System.out::println);

	}

}
