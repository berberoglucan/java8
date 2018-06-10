package _13.stream.primitive;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Test2Average {


	public static void main(String[] args) {

		IntStream is1 = IntStream.rangeClosed(1, 10);
		IntStream is2 = IntStream.rangeClosed(1, 10);
		IntStream is3 = IntStream.rangeClosed(1, 10);
		IntStream is4 = IntStream.rangeClosed(1, 10);
		
		
		OptionalDouble od = is1.average();
		
		System.out.println(od.getAsDouble());
		
		OptionalInt oi = is2.max();
		
		System.out.println(oi.getAsInt());
		
		OptionalInt oi2 = is3.min();
		
		System.out.println(oi2.getAsInt());
		
		System.out.println(is4.sum());
		
		
		
		
	}

}
