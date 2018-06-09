package _05.consumer;

import java.util.function.Consumer;

public class ConsumerTest1 {
	
	// java.util.function.Consumer
	// void accept(T t);
	
	public static void main(String[] args) {
		
		Consumer<String> consumer = str -> System.out.println(str.toUpperCase());;
		
		// Consumer<String> consumer2 = String::toUpperCase;
		
		consumer.accept("can");
		
		System.out.println();
		
	}

}
