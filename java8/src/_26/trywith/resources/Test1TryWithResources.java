package _26.trywith.resources;

import java.io.FileWriter;
import java.io.IOException;

public class Test1TryWithResources {

	public static void main(String[] args) {

		// old version

		FileWriter fw = null;

		try {
			fw = new FileWriter("file.txt");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// new version
		// try- with resource
		// try-with resource yaklasimi kullanildiginda arka planda otomatik olarak close
		// islemi yapilir.
		try (FileWriter fw2 = new FileWriter("file.txt")) {
			fw2.write("test");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
