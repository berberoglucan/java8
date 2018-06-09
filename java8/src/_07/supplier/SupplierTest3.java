package _07.supplier;

import java.util.function.Function;
import java.util.function.Supplier;

public class SupplierTest3 {

	public static void main(String[] args) {

		Supplier<String> s1 = () -> new String();

		Supplier<String> s2 = String::new;

		// Supplier<Integer> s3 = Integer::new;
		// compiler error
		// Integer sýnýfýnýn default constructor'ý yok.

		Function<String, Integer> f1 = str -> new Integer(str);

		Function<String, Integer> f2 = Integer::new; // yukarýdaki ile ayný

		Function<Integer, Integer> f3 = (Integer i) -> new Integer(i);

		Function<Integer, Integer> f4 = Integer::new; // yukarýdaki ile ayný

		// Function<Integer, Long> f5 = Integer::new;

		// Integer sinifinda Long alip Integer donen constructor yok!
	}

}
