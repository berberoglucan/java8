package _09.binary.versions;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateTest {

	// BiPredicate<T,U>
	// boolean test(T t, U u);

	public static void main(String[] args) {

		// boolean contains(Object o);

		BiPredicate<List<Integer>, Integer> bip = (List<Integer> list, Integer i) -> list.contains(i);

		BiPredicate<List<Integer>, Integer> listContains = List::contains;

		List<Integer> aList = Arrays.asList(10, 20, 30);
		System.out.println(listContains.test(aList, 20));

		// ----------------------------------------
		// public boolean startsWith(String prefix)
		
		BiPredicate<String, String> b1 = 
				(String str1, String str2) -> str1.startsWith(str2);
				
		BiPredicate<String, String> b2 = String::startsWith;
		
		System.out.println(b1.test("hello", "h"));
		
		System.out.println(b2.test("java", "j"));
		
		

	}

}
