package org.acumen.training.codes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MyBufferedReadWrite {

	public static void main(String[] args) {

		writeByBuffer("src/files/memo.txt", "You are fired\n");
		writeByBuffer("src/files/memo.txt", "You are welcome\n"); // this is overwrite not append

		readByBuffer("src/files/memo.txt");

	}

	// ang class na to ay ginagamit kapag bultuhang retrieval ng info
	private static void readByBuffer(String filename) {

		Path filePath = Paths.get(filename);
		Charset utf8 = Charset.forName("UTF-8");

		try (BufferedReader bReader = Files.newBufferedReader(filePath, utf8)) {
			String lineString = bReader.readLine();

			while (lineString != null) {
				System.out.println(lineString);
				lineString = bReader.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeByBuffer(String filename, String message) {

		Path filePath = Paths.get(filename);
		Charset utf8 = Charset.forName("UTF-8");

		try (BufferedWriter bWriter = Files.newBufferedWriter(filePath, utf8, StandardOpenOption.CREATE,
				StandardOpenOption.APPEND)) { // write is overwrite, append is append

			bWriter.write(message);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
