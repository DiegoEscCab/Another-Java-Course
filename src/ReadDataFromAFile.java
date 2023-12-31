package core.diego.esc;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadDataFromAFile {

	public static void main(String[] args) {
		try {
			loadFile("file.txt");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	static void loadFile(String fileName) throws IOException {
	Path file = FileSystems.getDefault().getPath("", fileName);
	List<String> lines = Files.readAllLines(file);
	/*for( int i = 0; i < lines.size(); i++) {
		System.out.println(lines.get(i));
	} */
	//lines.forEach((str) -> System.out.println(str));
	lines.forEach(System.out::println);
	}
}
