package _08.primitive.versions;

import java.util.function.Function;
import java.util.function.IntFunction;

public class PrimitiveFunctionTest {

	// IntFunction, DoubleFunction, LongFunction
	
	// R apply(int t);
	// R apply (double t);
	// R apply(long t);
	
	public static void main(String[] args) {
		
		// public static int abs(int a)
		
		Function<Integer, Integer> normalFunction = Math::abs;
		
		IntFunction<Integer> if1 = (int i) -> Math.abs(i);
		
		IntFunction<Integer> if2 = Math::abs;
		
		System.out.println(if1.apply(-20));
		
		System.out.println(if2.apply(-20));
		
	}

}
