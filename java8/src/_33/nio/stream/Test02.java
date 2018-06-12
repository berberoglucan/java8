package _33.nio.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test02 {

	// Files.walk

	public static void main(String[] args) throws IOException {

		Stream<Path> stream = Files.walk(Paths.get("."));

		stream.forEach(System.out::println);

		System.out.println("-----------------------------");

		Stream<Path> stream2 = Files.walk(Paths.get("."), 2);

		stream2.forEach(System.out::println);

		stream.close();

		stream2.close();

	}

}
