package org.acumen.training.codes.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyStringRead {
	
	public static void main(String[] args) {

		String filePath = "./src/files/memo.txt";
		File file = new File(filePath);
		FileReader fReader;
		
		try {
			fReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fReader);
			String line = br.readLine();
			
			while(!(line==null)) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
}
