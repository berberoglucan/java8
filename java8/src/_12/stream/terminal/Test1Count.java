package _12.stream.terminal;

import java.util.stream.Stream;

public class Test1Count {

	public static void main(String[] args) {
		
		// long count();
		
		Stream<String> s1 = Stream.of("element1","element2","element");
		
		System.out.println(s1.count());
		
	}

}
