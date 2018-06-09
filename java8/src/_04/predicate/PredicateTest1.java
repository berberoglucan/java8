package _04.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateTest1 {

	public static void main(String[] args) {

		Predicate<String> predicate = (str) -> str.startsWith("h");

		Stream.of("hello", "world", "sample", "data", "hi").filter(predicate).forEach(System.out::println);

		Stream.of("hello", "world", "sample", "data", "hi").filter(str -> str.startsWith("h"))
				.forEach(System.out::println);

		Predicate<String> predicate2 = str -> str.isEmpty();

		System.out.println(predicate2.test("can"));
		
		
		
		Predicate<String> predicate3 = String::isEmpty;
		
		System.out.println(predicate3.test(""));
		
		String str = "can";
		
		Predicate<String> predicate4 = str::contains;
		
		System.out.println(predicate3.test("can"));

		// BiPredicate<String,String> predicate2 = String::startsWith;

	}

}
// java.util.function.Predicate<T>
// boolean test(T t);