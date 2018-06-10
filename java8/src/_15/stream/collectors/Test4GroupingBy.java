package _15.stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test4GroupingBy {

	public static void main(String[] args) {

		Stream<String> s1 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat", "cat");
		Stream<String> s2 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat", "cat");

		Map<Integer, List<String>> map = s1.collect(Collectors.groupingBy(str -> str.length()));
		System.out.println(map);

		Map<Integer, Set<String>> set = s2.collect(Collectors.groupingBy(String::length, Collectors.toSet()));

		System.out.println(set);
	}

}
