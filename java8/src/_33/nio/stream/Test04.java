package _33.nio.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test04 {
	
	
	// Files.lines()
	
	public static void main(String[] args) throws IOException {
		
		try(Stream<String> stream = Files.lines(Paths.get("lines.txt"))) {
			stream.forEach(System.out::println);
		}
		
	}

}
