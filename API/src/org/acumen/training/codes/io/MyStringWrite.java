package org.acumen.training.codes.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class MyStringWrite {
	//gamit ang printwriter partners kapag malakihan na or web, di na pwede ang FOS

	public static void main(String[] args) {
		
		String filePath = "./src/files/memo.txt";
		File file = new File(filePath);
		String message = "This is a content";
		String message2 = "This is another content";	

		try {
			FileOutputStream fos = new FileOutputStream(file, true); //decorator desing pattern need na partner tong dalawa kapag gagmait ka ng print writer
			PrintWriter pWriter = new PrintWriter(fos);
			pWriter.println(message);
			pWriter.println(message2);			
			fos.flush();			
			pWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
