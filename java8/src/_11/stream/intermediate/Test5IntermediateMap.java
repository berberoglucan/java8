package _11.stream.intermediate;

import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test5IntermediateMap {

	public static void main(String[] args) {

		Function<Integer, Integer> f = i -> i * 2;

		Stream.of(1, 2, 3, 4, 5, 6).map(f).forEach(System.out::println);

		Stream.of(1, 2, 3, 4, 5, 6).map(i -> i * 2).forEach(System.out::println);

		//
		System.out.println("-----------------------");

		DoubleStream ds = DoubleStream.of(4.0, 9.0, 16.0).map(d -> Math.sqrt(d));

		ds = ds.peek(s -> System.out.println(s));

		double sumValue = ds.sum();

		System.out.println("Sum : " + sumValue);

		//
		System.out.println("-----------------------");
		
		long count = IntStream.of(1,2,3,4,5).map(i->i*i).peek(System.out::println).count();
		
		System.out.println("Count : " + count);
	}
}
