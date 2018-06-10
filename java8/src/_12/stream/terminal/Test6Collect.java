package _12.stream.terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6Collect {
	
	// <R, A> R collect(Collector<? super T, A, R> collector);
	
	public static void main(String[] args) {
		
		Stream<String> s1 = Stream.of("horse", "dog", "bird", "monkey", "cat");
		Stream<String> s2 = Stream.of("horse", "dog", "bird", "monkey", "cat");
		Stream<String> s3 = Stream.of("horse", "dog", "bird", "monkey", "cat");
		Stream<String> s4 = Stream.of("horse", "dog", "bird", "monkey", "cat");
		Stream<String> s5 = Stream.of("horse", "dog", "bird", "monkey", "cat");
		
		// stream to list
		List<String> list = s1.collect(Collectors.toList());
		System.out.println(list);
		
		// stream to list
		List<String> list2 = s2.filter(animal -> animal.length() > 3).collect(Collectors.toList());
		System.out.println(list2);
		
		// stream to hashset
		Set<String> set = s3.collect(Collectors.toSet());
		System.out.println(set);
		
		// stream to TreeSet
		TreeSet<String> treeSet = s4.collect(Collectors.toCollection(()-> new TreeSet<>()));
		// s4.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(treeSet);
		
		// stream to Map
		
		Map<String, Integer> nameLengthMap = s5.collect(Collectors.toMap(name -> name, name -> name.length()));
		
		System.out.println(nameLengthMap);
	}

}
