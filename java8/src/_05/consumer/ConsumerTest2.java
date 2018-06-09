package _05.consumer;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerTest2 {

	public static void main(String[] args) {
		
		Stream<String> strings = Stream.of("cem", "can","arzu");
		
		//public void println(String x)
		
		Consumer<String> printString = System.out::println;
		
		strings.forEach(printString);
		
		// Consumer<String> consumer = String::hashCode;
		

	}

}
