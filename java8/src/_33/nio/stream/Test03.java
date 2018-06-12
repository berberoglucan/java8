package _33.nio.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class Test03 {

	// Files.find()

	public static void main(String[] args) throws IOException {

		Path p1 = Paths.get(".");

		BiPredicate<Path, BasicFileAttributes> biPreMatcher = (path, attribute) -> attribute.isRegularFile()
				&& path.toString().endsWith(".java");

		try (Stream<Path> stream = Files.find(p1, 4, biPreMatcher)) {
			stream.forEach(System.out::println);
		}

	}

}
