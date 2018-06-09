package _10.stream.sources;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamSourcesTest3 {

	public static void main(String[] args) {

		// Stream.generate
		// public static<T> Stream<T> generate(Supplier<T> s) {

		// infinite
		Stream<Double> s1 = Stream.generate(() -> Math.random());

		s1.forEach(System.out::println);

		// five values
		Stream<Double> s2 = Stream.generate(Math::random).limit(5);

		s2.forEach(System.out::println);

		//
		Supplier<Double> supp = () -> Math.random();

		Stream<Double> s3 = Stream.generate(supp).limit(2);

		s3.forEach(System.out::println);
	}

}
