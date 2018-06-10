package _13.stream.primitive;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.IntStream;

public class Test3SummaryStatistics {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		IntStream is = IntStream.generate(() -> r.nextInt()).limit(5);
		
		// ozet istatistiki bilgiler
		IntSummaryStatistics stats = is.summaryStatistics();
		
		System.out.println(stats.getAverage());
		System.out.println(stats.getCount());
		System.out.println(stats.getMax());
		System.out.println(stats.getMin());
		System.out.println(stats.getSum());
		
	}

}
