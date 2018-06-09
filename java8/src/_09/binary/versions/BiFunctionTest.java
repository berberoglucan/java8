package _09.binary.versions;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class BiFunctionTest {

	// BiFunction<T, U, R>

	// R apply(T t, U u);

	public static void main(String[] args) {

		BiFunction<String, String, String> concat = (String str1, String str2) -> str1.concat(str2);

		BiFunction<String, String, String> concat2 = String::concat;

		System.out.println(concat2.apply("key1", "key2"));

		// --------------------------------------------

		// public static int compare(double d1, double d2)
		BiFunction<Double, Double, Integer> bif1 = (Double d1, Double d2) -> Double.compare(d1, d2);

		BiFunction<Double, Double, Integer> bif2 = Double::compare;

		System.out.println(bif2.apply(2.0, 3.0));

		// ---------------------------------------------
		// public int compareTo(Double anotherDouble)
		
		BiFunction<Double, Double, Integer> bif3 = 
				(Double d1, Double d2) -> d1.compareTo(d2);
				
		BiFunction<Double, Double, Integer> bif4 = Double::compareTo;
		
		System.out.println(bif4.apply(2.0, 3.0));
		
		
		// -------------------------------------------
		
		// public String toUpperCase()
		Function<String, String> f1 = String::toUpperCase;
		
		Function<String, String> f2 =(str1) -> str1.toUpperCase();
		
		// public char[] toCharArray()
		Function<String, char[]> f3 = (str) -> str.toCharArray();
		
		Function<String, char[]> f4 = String::toCharArray;
		
		// public int length()
		
		Function<String, Integer> f5 = String::length;
		
		BiFunction<String,String,Integer> f6 = String::indexOf;
		
		BiFunction<String,Integer,Integer> f7 = String::codePointAt;
		
		BiFunction<String, Integer, Integer> f8 = (str,i)-> str.codePointAt(i);
		
		System.out.println(f8.apply("can", 0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
