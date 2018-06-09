package _11.stream.intermediate;

import java.util.Comparator;
import java.util.stream.Stream;

public class Test8IntermediateSort {

	public static void main(String[] args) {
		
		// Stream<T> sorted()
		// Stream<T> sorted(Comparator<? super T> comparator)
		
		Stream<String> stream  = Stream.of("c","T","d","B","a","Z");
		
		stream.map(s -> s.toLowerCase()).sorted().forEach(System.out::println);
		
		System.out.println("---------------------------------------------");
		
		// reverse order
		
		Stream<String> stream2  = Stream.of("c","T","d","B","a","Z");
		
		stream2.map(s->s.toLowerCase()).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}
}
