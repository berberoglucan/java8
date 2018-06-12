package _30.nio.path;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test01 {

	public static void main(String[] args) throws IOException {
							// 0	1		2			3
		Path path = Paths.get("C:\\folder1\\folder2\\test.txt");
		
		System.out.println(path.getClass());
		
		System.out.println(path);
		
		System.out.println(path.getFileName()); // test.txt
		
		System.out.println(path.getRoot()); // C:\
		
		System.out.println(path.getParent()); // C:\folder1\folder2
		
		System.out.println(path.getNameCount()); // 3
		
		System.out.println(path.getFileSystem()); // sun.nio.fs.WindowsFileSystem@7852e922
		
		System.out.println(path.getName(2)); // folder2
		
		System.out.println(path.subpath(0, 2)); // folder1\folder2
		
		path.forEach(System.out::println);
		
		File file1 = path.toFile();
		
		System.out.println(file1); // C:\folder1\folder2\test.txt
		
		Path fileToPath = file1.toPath();
		
		System.out.println(fileToPath); // C:\folder1\folder2\test.txt
		
	}

}
