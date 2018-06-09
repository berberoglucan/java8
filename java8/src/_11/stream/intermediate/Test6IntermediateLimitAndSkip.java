package _11.stream.intermediate;

import java.util.stream.Stream;

public class Test6IntermediateLimitAndSkip {

	public static void main(String[] args) {
		
		// Stream<T> limit(int maxSize)
		// Stream<T> skip(int n)
		
		Stream<Integer> s = Stream.iterate(10, i->i+3);
		s.skip(3).limit(5).forEach(System.out::println);
		
		/*
		19
		22
		25
		28
		31
		 */
	}
}
