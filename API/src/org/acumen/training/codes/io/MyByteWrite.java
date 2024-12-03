package org.acumen.training.codes.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyByteWrite {

	public static void main(String[] args) {

		// write files streams, u dont need to call the create new file, it will do the
		// work
		String filePath = "./src/files/memo.txt";
		File file = new File(filePath);
		String message = "This is a content\n";
		String message2 = "This is another content\n";

		try {
			FileOutputStream fos = new FileOutputStream(file, true); // kpaag per byte na write lang
			// write the content
			byte[] msgBuffer = message.getBytes();
			byte[] msgBuffer2 = message2.getBytes();
			fos.write(msgBuffer);
			fos.write(msgBuffer2);			
			fos.flush();
			fos.close(); // important to before writing
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
