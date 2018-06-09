package _11.stream.intermediate;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Test3IntermediateFilter {

	public static void main(String[] args) {

		IntStream.range(0, 9).filter(i -> i % 2 == 0).forEach(System.out::println);

		System.out.println("------------------------------");

		// IntPredicate intPre = (int i) -> isEven(i);

		IntStream.range(0, 9).filter(Test3IntermediateFilter::isEven).forEach(System.out::println);

	}

	public static boolean isEven(int i) {
		return i % 2 == 0;
	}

}
