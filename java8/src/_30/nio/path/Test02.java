package _30.nio.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test02 {

	public static void main(String[] args) {

		Path path = Paths.get("folder", "folder2", "folder3");

		Path path2 = Paths.get("C:", "folder", "folder2", "folder3");
		
		Path path3 = Paths.get("../../test/sub/a/b.txt");

		System.out.println(path); // folder\folder2\folder3
		
		System.out.println(path2); // C:\folder\folder2\folder3
		
		System.out.println(path3); // ..\..\test\sub\a\b.txt

		System.out.println(path.isAbsolute()); // false
		
		System.out.println(path2.isAbsolute()); // true
		
		System.out.println(path3.isAbsolute()); // false
		
		System.out.println(path.toAbsolutePath()); // C:\Users\can\git\java8\java8\folder\folder2\folder3
		
		System.out.println(path2.toAbsolutePath()); // C:\folder\folder2\folder3

		System.out.println(path3.toAbsolutePath()); // C:\Users\can\git\java8\java8\..\..\test\sub\a\b.txt
		
		// normalize
		System.out.println(path.toAbsolutePath().normalize()); 
		System.out.println(path2.toAbsolutePath().normalize());
		System.out.println(path3.toAbsolutePath().normalize()); // C:\Users\can\git\test\sub\a\b.txt
		
	
		
	
	}

}
