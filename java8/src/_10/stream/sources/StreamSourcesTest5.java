package _10.stream.sources;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSourcesTest5 {

	public static void main(String[] args) {
		
		IntStream intStream = new Random().ints().limit(5);
		//new Random().doubles();
		//new Random().longs();
		intStream.forEach(System.out::println);
		
		//
		System.out.println("----------------------------------");
		
		Stream<String> stream = Pattern.compile(" ").splitAsStream("java 8 stream test");
		
		stream.forEach(System.out::println);
		
		
	}

}
