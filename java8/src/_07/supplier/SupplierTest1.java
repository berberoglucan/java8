package _07.supplier;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest1 {

	// public interface Supplier<T>
	// T get();
	// T -> return type

	// public int nextInt()
	public static void main(String[] args) {

		Random random = new Random();

		Supplier<Integer> supplier = () -> random.nextInt();

		Supplier<Integer> supplier2 = random::nextInt;
		// nextInt metodu static degil, bu case icin direkt
		// sinifIsmi::methodIsmi seklinde KULLANAMAYIZ!!!

		System.out.println(supplier.get());

		System.out.println(supplier2.get());
		
		// iki tane sayý üretir
		Stream.generate(supplier).limit(2).forEach(System.out::println);
		
		//Stream.generate(() -> random.nextInt()).limit(2).forEach(System.out::println);
		
	}

}
