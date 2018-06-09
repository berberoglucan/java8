package _10.stream.sources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSourcesTest4 {

	public static void main(String[] args) {
		
		IntStream intStream1 = IntStream.rangeClosed(1, 6);
		
		IntStream intStream2 = IntStream.rangeClosed(7, 9);
		
		IntStream intStream3 = IntStream.concat(intStream1, intStream2);
		
		intStream3.forEach(System.out::println);
		
		//
		System.out.println("----------------------------------");
		List<String> list1 = Arrays.asList("a","b","c");
		List<String> list2 = Arrays.asList("d","e","f");
		
		Stream<String> s1 = list1.stream();
		
		Stream<String> s2 = list2.stream();
		
		Stream<String> s3 = Stream.concat(s1, s2);
		
		s3.forEach(System.out::println);
		
		//
		System.out.println("----------------------------------");
		
		Stream<String> st1 = Arrays.stream(new String[] {"can","cem"});
		
		Stream<String> st2 = Arrays.stream(new String[] {"can2","cem2"});
		
		Stream<String> st3 = Stream.concat(st1, st2);
		
		st3.map(s->s.toUpperCase()).forEach(System.out::println);
		
	}

}
