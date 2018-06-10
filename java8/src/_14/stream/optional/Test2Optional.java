package _14.stream.optional;

import java.util.Optional;

public class Test2Optional {

	public static void main(String[] args) {

		Optional<String> opt = Optional.of("can");
		// isPresent -> deger varsa
		if (opt.isPresent()) {
			System.out.println(opt.get());
		}
		
		// ifPresent -> deger varsa sunu yap
		opt.ifPresent(System.out::println);

	}

}
