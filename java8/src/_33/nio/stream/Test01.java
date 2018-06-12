package _33.nio.stream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test01 {
	
	// Files.list()
	
	public static void main(String[] args) throws IOException {
		// "." -> current directory
		
		try(Stream<Path> stream = Files.list(Paths.get("."))) {
			
			// stream.forEach(System.out::println);
			
			// stream.forEach(p -> System.out.println(p.getFileName()));
			
			stream.forEach(p -> System.out.println(p.toAbsolutePath().normalize()));
		}
		
		// old version
		
		File file = new File(".");
		File[] files = file.listFiles();
		
		for (File file2 : files) {
			System.out.println(file2);
		}
	}

}
