package _15.stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test5PartitionBy {

	public static void main(String[] args) {

		Stream<String> s1 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat", "cat");
		Stream<String> s2 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat", "cat");
		Stream<String> s3 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat", "cat");

		Predicate<String> pre = s -> s.length() < 5;

		Map<Boolean, List<String>> map = s1.collect(Collectors.partitioningBy(pre));

		System.out.println(map);

		Map<Boolean, Set<String>> set = s2.collect(Collectors.partitioningBy(pre, Collectors.toSet()));

		System.out.println(set);

		Map<Boolean, Set<String>> treeSet = s3
				.collect(Collectors.partitioningBy(pre, Collectors.toCollection(TreeSet::new)));

		System.out.println(treeSet);

	}

}
