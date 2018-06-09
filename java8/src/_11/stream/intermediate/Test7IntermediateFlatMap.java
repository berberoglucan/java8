package _11.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Test7IntermediateFlatMap {

	public static void main(String[] args) {

		// <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>>
		// mapper)
		
		// flatMap array, listleri birleþtirerek stream haline getirir.

		List<String> zero = Arrays.asList("Bird", "Dog", "Cat");
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");

		Stream<List<String>> animals = Stream.of(zero, one, two);

		Function<List<String>, Stream<String>> flats = l -> l.stream();

		animals.flatMap(flats).forEach(System.out::println);

		//
		System.out.println("------------------------------------");

		List<Integer[]> listArray = Arrays.asList(new Integer[] { 1, 2, 3 }, new Integer[] { 4, 5 });

		listArray.stream().flatMap(array -> Arrays.stream(array)).map(i -> i * i).forEach(System.out::println);

	}
}
