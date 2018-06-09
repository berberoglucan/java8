package _06.function;

import java.util.function.Function;

public class FunctionTest2 {

	public static void main(String[] args) {

		// public static int parseInt(String s)

		Function<String, Integer> f1 = Integer::parseInt;

		Function<String, Integer> f2 = str -> Integer.parseInt(str);

		Function<String, Integer> f3 = (String str) -> Integer.parseInt(str);

		Function<String, Integer> f4 = (String str) -> {
			return Integer.parseInt(str);
		};

		Integer parsedValue = f1.apply("1000");
		System.out.println(parsedValue);

		System.out.println(f2.apply("2000"));

		System.out.println(f3.apply("2000"));

		System.out.println(f4.apply("2000"));

		// public static int abs(int a)

		Function<Integer, Integer> abs1 = (Integer i) -> Math.abs(i);

		Function<Integer, Integer> abs2 = Math::abs;

		System.out.println(abs1.apply(-20));
		System.out.println(abs2.apply(-39));
	}

}
