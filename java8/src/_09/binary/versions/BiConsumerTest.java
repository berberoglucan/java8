package _09.binary.versions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerTest {
	
	// public interface BiConsumer<T, U>
	// void accept(T t, U u);
	
	public static void main(String[] args) {
		
		// boolean add(E e); -> boolean dönsede BiConsumer kullanabilir
		BiConsumer<List<Integer>, Integer> bic1 = 
				(List<Integer> list, Integer i) -> list.add(i);
				
		BiConsumer<List<Integer>, Integer> bic2 = List::add;
		
		List<Integer> list = new ArrayList<>();
		bic2.accept(list, 10);
		bic2.accept(list, 2);
		bic2.accept(list, 12);
		bic2.accept(list, 32);
		list.forEach(System.out::println);
		
		
		// BiConsumer<String, String> bic3 = String::concat;
		
		
	}

}
