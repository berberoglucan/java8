package _06.function;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class FunctionTest3 {

	public static void main(String[] args) {

		// call my function

		Function<String, Integer> parseMyString = FunctionTest3::parseMyString;

		System.out.println(parseMyString.apply("20"));

		Function<Integer, Integer> abs = Math::abs;

		// Stream.map

		Arrays.stream("-4,-9,-16".split(",")).map(parseMyString).map(abs).forEach(System.out::println);

		// ----------------------------------

		int[] array = { -1, -2, -32, -59, -43, -26, -34 };

		IntStream intStream = Arrays.stream(array);

		IntUnaryOperator intUnary = Math::abs;

		// intUnary = (int i) -> Math.abs(i);

		intStream.map(intUnary).forEach(System.out::println);

		intStream.map(i -> Math.abs(i)).forEach(System.out::println);

	}

	private static int parseMyString(String str) {
		return Integer.parseInt(str);
	}

}
