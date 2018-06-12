package _31.nio.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Test05 {

	public static void main(String[] args) throws IOException {

		Path p1 = Paths.get("buffered.txt");

		try (BufferedWriter bw = Files.newBufferedWriter(p1)) {
			bw.write("line1\nline2\nline3");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedReader br = Files.newBufferedReader(p1)) {
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// dosya icerigini satir satir listeye atmakta!
		// buyuk dosyalar icin probleme neden olabilir Outofmemory!
		List<String> lines = Files.readAllLines(p1);
		System.out.println(lines);

	}

}
