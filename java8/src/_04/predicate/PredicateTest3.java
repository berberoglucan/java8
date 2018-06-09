package _04.predicate;

import java.util.ArrayList;
import java.util.List;

public class PredicateTest3 {
	public static void main(String[] args) {

		List<String> greetings = new ArrayList<>();

		greetings.add("hello");

		greetings.add("world");

		greetings.add("test");

		greetings.add("sample");

		// default boolean removeIf(Predicate<? super E> filter)

		greetings.removeIf(s -> s.startsWith("h"));
		greetings.forEach(System.out::println);

		// default void forEach(Consumer<? super T> action)

	}
}
