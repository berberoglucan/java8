package _10.stream.sources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSourcesTest2 {

	public static void main(String[] args) {
		
		// empty stream
		Stream<String> empty = Stream.empty();
		
		// Stream.of
		// public static<T> Stream<T> of(T... values) {
		
		Stream<String> s1 = Stream.of("data1","data2","data3","data4");
		
		s1.forEach(System.out::println);
		
		
		//List.stream
		//List.parallelStream
		
		List<String> list = Arrays.asList("a","b","c");
		Stream<String> s2 = list.stream();
		Stream<String> s3 = list.parallelStream();
		
		s2.forEach(System.out::println);
		s3.forEach(System.out::println);
	}

}
