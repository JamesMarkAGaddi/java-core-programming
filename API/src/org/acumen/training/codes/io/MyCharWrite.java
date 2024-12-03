package org.acumen.training.codes.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyCharWrite {

	public static void main(String[] args) {

		String filePath = "./src/files/memo.txt";
		File file = new File(filePath);
		
		String message = "This is a content\n";
		String message2 = "This is another content\n";

		try {
			char[] msgBuffer = message.toCharArray();
			char[] msgBuffer2 = message2.toCharArray();
			
			FileWriter fw = new FileWriter(file, true); //true for append allowed, non if not overwrite
			fw.write(msgBuffer);
			fw.write(msgBuffer2);

			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
