package _11.stream.intermediate;

import java.util.stream.Stream;

public class Test1IntermediatePeek {

	public static void main(String[] args) {
		//peek -> debug için kullanýlýr
		Stream<Integer> s1 = Stream.of(10, 20, 30, 40, 50);
		s1 = s1.peek(i -> System.out.println(i));
		// s1.peek(System.out::println);
		// peek metodu intermediate operation dir.
		// lazy olarak calisir. yani terminal operation yoksa bu calismaz.
		System.out.println(s1.count());
		// count metodu bir terminal operationdir.
		// bir stream uzerinde terminal operation calistiktan sonra , 
		// bir baska terminal operation cagiramayiz!
		
		// Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		//s1.forEach(System.out::println);
	}

}
