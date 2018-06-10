package _13.stream.primitive;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Test1mapToInt {

	// IntStream mapToInt(ToIntFunction<? super T> mapper);
	// maptoDouble
	// mapToLong
	// mapToObs

	public static void main(String[] args) {

		Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5);
		Stream<Integer> s2 = Stream.of(1, 2, 3, 4, 5);
		Stream<Integer> s3 = Stream.of(1, 2, 3, 4, 5);
		IntStream s4 = IntStream.iterate(1, i -> i+1).limit(5);
		
		IntStream intStream = s1.mapToInt(i -> i);
		
		// intStream.forEach(System.out::println);
		
		DoubleStream doubleStream = s2.mapToDouble(d -> d.doubleValue());
		
		// doubleStream.forEach(System.out::println);
		
		LongStream longStream = s3.mapToLong(i -> i.longValue());
		
		//longStream.forEach(System.out::println);
		
		Stream<Integer> stream = s4.mapToObj(i -> i);
		
		// stream.forEach(System.out::println);
		
		
	}

}
