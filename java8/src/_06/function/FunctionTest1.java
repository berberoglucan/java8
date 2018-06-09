package _06.function;

import java.util.function.Function;

public class FunctionTest1 {

	// java.util.function.Function<T,R>
	// R apply(T t);
	// T -> parameter type
	// R -> return type

	public static void main(String[] args) {
		
		Function<String, Integer> lengthFunc = (String str) -> str.length();
		
		Function<String, Integer> lengthFunc2 = str -> str.length();
		
		Function<String, Integer> lengthFunc3 = String::length;
		
		Function<String, String> upperFunc = String::toUpperCase;
		
		Function<String, Integer> compareFunc = str -> str.compareTo("can");
		
		// Function<String, Integer> compareFunc2 = (str) -> str.compareTo("can");
		
		int i1 = lengthFunc.apply("can");
		
		System.out.println(i1);
		
		System.out.println(lengthFunc2.apply("fenerbahce"));
		
		System.out.println(lengthFunc3.apply("turkey"));
		
		System.out.println(upperFunc.apply("can"));
		
		System.out.println(compareFunc.apply("can"));
		
	}

}
