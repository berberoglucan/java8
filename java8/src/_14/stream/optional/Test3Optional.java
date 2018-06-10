package _14.stream.optional;

import java.util.Optional;

public class Test3Optional {

	public static void main(String[] args) {
		
		Optional<String> opt1 = Optional.empty();
		
		Optional<String> opt2 = Optional.of("can");
		
		System.out.println(opt1.map(String::length).orElse(-1));
		
		// opt1.map(str -> str.length()).orElseThrow(() -> new RuntimeException());
		
		System.out.println(opt2.map(String::length).orElse(-1));
	}

}
