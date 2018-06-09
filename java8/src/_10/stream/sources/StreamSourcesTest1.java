package _10.stream.sources;

import java.util.stream.IntStream;

public class StreamSourcesTest1 {

	// java.util.stream.Stream interface

	// public interface Stream<T> extends BaseStream<T, Stream<T>> {

	// A stream in Java is a sequence of data;

	// pipeline ;

	// Source : kaynak data/ raw data
	// intermediate operartion : transform data , intermediate operationlar geriye
	// Stream donerler.
	// Terminal operation : actually produces result. sonuc ureten metotlar.

	public static void main(String[] args) {

		IntStream intStream1 = IntStream.range(1, 6);

		IntStream intStream2 = IntStream.range(6, 10);

		// stream concatination
		IntStream intStream3 = IntStream.concat(intStream1, intStream2);

		intStream3.forEach(System.out::println);

		// compiler error
		// intStream3.forEach(System.out::println);

		// compiler Error
		// intStream3.peek(System.out::println);

		// -----------------------------------------
		// public static IntStream iterate(final int seed, final IntUnaryOperator f)
		// IntUnaryOperator -> int applyAsInt(int operand);
		
		System.out.println("-------------------------------------");
		IntStream.iterate(3, i -> i+2).limit(5).forEach(System.out::println);
		// 3'den baþla, 2ser 2ser arttirarak 5 tane sayi olustur.
		

	}

}
