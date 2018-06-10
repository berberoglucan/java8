package _15.stream.collectors;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3ToCollection {

	public static void main(String[] args) {

		Stream<String> s1 = Stream.of("lions", "tigers", "bears");
		
		TreeSet<String> treeSet = s1.filter(str -> str.startsWith("t"))
				.collect(Collectors.toCollection(() -> new TreeSet<>()));
		
		System.out.println(treeSet);
	}

}
