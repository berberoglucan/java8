package _14.stream.optional;

import java.util.Optional;

public class Test1Optional {

	public static void main(String[] args) {

		Optional<String> empty = Optional.empty();
		// java.util.NoSuchElementException: No value present
		// System.out.println(empty.get());

		Optional<String> notEmpty = Optional.of("data");
		System.out.println(notEmpty.get());

		Optional<String> nullStr = Optional.of(null);
		// java.lang.NullPointerException
		// System.out.println(nullStr.get());

		Optional<String> nullableStr = Optional.ofNullable(null);

	}

}
