package _12.stream.terminal;

import java.util.Optional;
import java.util.stream.Stream;

public class Test3Find {

	// Optional<T> findFirst();

	public static void main(String[] args) {

		Stream<String> s1 = Stream.of("key1", "key2", "key3");

		Stream<String> s2 = Stream.of("can", "cem", "ahmet");

		Optional<String> opt = s1.findFirst();

		System.out.println(opt.get());

		Optional<String> opt2 = s2.findAny(); // can

		System.out.println(opt2.get());

	}

}
