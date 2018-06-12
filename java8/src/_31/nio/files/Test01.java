package _31.nio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test01 {

	public static void main(String[] args) throws IOException {
		
		Path path1 = Paths.get("test.txt");
		
		if(!Files.exists(path1)) {
			
			Files.createFile(path1);
		}
		
		Path path2 = Paths.get("dir1", "dir2");
		
		if(!Files.exists(path2)) {
			Files.createDirectories(path2);
		}
		
		Path path3 = Paths.get("folder");
		
		if(!Files.exists(path3)) {
			Files.createDirectory(path3);
		}
		
	}

}
