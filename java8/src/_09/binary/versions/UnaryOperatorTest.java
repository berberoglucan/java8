package _09.binary.versions;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
	
	// @FunctionalInterface
	// public interface UnaryOperator<T> extends Function<T, T> {
	// T apply(T t);
	// T -> Paramater Type
	// T -> Return type
	public static void main(String[] args) {
		
		UnaryOperator<Integer> uo  = (Integer i) -> Math.abs(i); // parametre türü ve return türü Integer
		
		UnaryOperator<Integer> uo2 = Math::abs;
		
		// UnaryOperator<Float>  uo3 = Math::abs;
		
		List<Integer> list = Arrays.asList(-20,-30,-40,-50);
		
		list.replaceAll(i -> Math.abs(i));
		
		//list.replaceAll(uo2);
		
		list.forEach(System.out::println);
		
		
		
	}

}
