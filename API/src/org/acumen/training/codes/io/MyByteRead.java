package org.acumen.training.codes.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyByteRead {

	public static void main(String[] args) {

		String filePath = "./src/files/memo.txt";
		File file = new File(filePath);

		try {
			byte[] msgBuffer = new byte[(int) file.length()];
			FileInputStream fis = new FileInputStream(file);			
			fis.read(msgBuffer);
			System.out.println(new String(msgBuffer));
			fis.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
