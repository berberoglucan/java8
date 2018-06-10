package _14.stream.optional;

import java.util.Optional;

public class Test4Optional {

	public static void main(String[] args) {

		Optional<Integer> opt = Optional.of(123);
		threeDigit(opt);

		threeDigitBetter(opt);
	}

	private static void threeDigitBetter(Optional<Integer> opt) {
		opt.map(n -> "" + n).filter(str -> str.length() == 3).ifPresent(System.out::println);
	}

	private static void threeDigit(Optional<Integer> opt) {

		if (opt.isPresent()) {
			Integer num = opt.get();
			String str = "" + num;
			if (str.length() == 3)
				System.out.println(str);
		}

	}

}
