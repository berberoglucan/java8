package _04.predicate;

import java.util.function.Predicate;

public class PredicateTest2 {

	public static void main(String[] args) {

		// predicate and operator

		Predicate<String> nullCheck = str -> str != null;
		
		Predicate<String> emptyCheck = str -> str.length() > 0;

		Predicate<String> mergePredicate = nullCheck.and(emptyCheck);

		Predicate<String> mergePredicate2 = str -> str != null && str.length() > 0;

		String message = "hello world!";

		String nullStr = null;

		System.out.println(mergePredicate.test(message));

		System.out.println(mergePredicate.test(nullStr));
		
		System.out.println(mergePredicate2.test(message));

		System.out.println(mergePredicate2.test(nullStr));

	}

}
