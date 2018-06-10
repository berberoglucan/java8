package _12.stream.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test4Match {

	// boolean anyMatch(Predicate<? super T> predicate);
	// boolean allMatch(Predicate<? super T> predicate);
	// boolean noneMatch(Predicate<? super T> predicate);

	public static void main(String[] args) {

		List<String> list = Arrays.asList("monkey", "2", "horse");
		
		Predicate<String> pre = str -> Character.isLetter(str.charAt(0));
		
		boolean isAnyMatch = list.stream().anyMatch(pre);
		
		boolean isAllMatch = list.stream().allMatch(pre);
		
		boolean isNoneMatch = list.stream().noneMatch(pre);
		
		System.out.println("isAnyMatch => " + isAnyMatch);
		
		System.out.println("isAllMatch => " + isAllMatch);
		
		System.out.println("isNoneMatch => " + isNoneMatch);

	}

}
