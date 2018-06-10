package _15.stream.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1Averaging {

	public static void main(String[] args) {

		Stream<String> animalStream = Stream.of("dog", "monkey", "horse", "bird", "cat");

		Double d = animalStream.collect(Collectors.averagingInt(str -> str.length()));

		System.out.println(d);

		//

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		Double d2 = list.stream().collect(Collectors.averagingInt(i -> i));

		System.out.println(d2);

	}

}
