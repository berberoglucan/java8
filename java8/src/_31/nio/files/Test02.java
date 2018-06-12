package _31.nio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test02 {

	public static void main(String[] args) throws IOException {
		
		Path path1 = Paths.get("folder");
		
		Path path2 = path1.toAbsolutePath();
		
		System.out.println(path1);
		
		System.out.println(path2);
		
		System.out.println(Files.isSameFile(path1, path2)); // true
		
		Path path3 = Paths.get(path1.getFileName().toString(), "test.txt");
		
		Path path4 = Paths.get("test.txt");
		
		Files.createFile(path3);
		
		System.out.println(Files.isSameFile(path3, path4)); //false
		
	}

}
