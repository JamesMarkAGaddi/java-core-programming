package org.acumen.training.codes.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyCharRead {

	public static void main(String[] args) {

		String filePath = "./src/files/memo.txt";
		File file = new File(filePath);

		try {
			char[] msgBuffer = new char[(int) file.length()];
			FileReader fir = new FileReader(file);
			fir.read(msgBuffer);
			System.out.println(new String(msgBuffer));
			
			fir.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
