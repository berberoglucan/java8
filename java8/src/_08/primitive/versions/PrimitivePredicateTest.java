package _08.primitive.versions;

import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.function.IntPredicate;

public class PrimitivePredicateTest {

	// IntPredicate, DoublePredicate, LongPredicate
	// boolean test(int t)
	// boolean test(double t)
	// boolean test(long t)

	public static void main(String[] args) {

		Predicate<Integer> normalPredicate = (Integer i) -> i % 2 == 0;

		IntPredicate ip = (int i) -> i % 2 == 0;

		System.out.println(normalPredicate.test(30));

		System.out.println(ip.test(30));

		// IntStream filter(IntPredicate predicate);
		// public static IntStream range(int startInclusive, int endExclusive)
		
		IntStream.range(0, 10).filter(ip).forEach(System.out::println);

	}

}
