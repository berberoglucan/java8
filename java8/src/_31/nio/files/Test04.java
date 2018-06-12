package _31.nio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test04 {

	public static void main(String[] args) throws IOException {
		
		Path p1 = Paths.get("myFolder");
		
		if(!Files.exists(p1)) {
			Files.createDirectory(p1);
		}
		
		Path p2 = Paths.get("renamed");
		
		Files.move(p1, p2);
		
	}

}
