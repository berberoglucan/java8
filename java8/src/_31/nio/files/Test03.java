package _31.nio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test03 {

	public static void main(String[] args) throws IOException {
		
		Path path1 = Paths.get("original", "file.txt");
		
		Path path2 = Paths.get("copied", "copied.txt");
		
		if(!Files.exists(path2)) {
			Files.createDirectories(path2.getParent());
			//Path path3 = Paths.get(path1.getFileName().toString(),"test.txt");
			//Files.createFile(path3);
		}
		
		Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);
		// mevcut dosyani uzerine yazar! gunceller
	}

}
