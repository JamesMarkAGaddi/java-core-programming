package org.acumen.training.codes.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyScanner {

	private InputStreamReader isr; // reader to ng ubffer object MyScanner
	private BufferedReader bReader;

	public MyScanner(InputStream inputStream) {

		isr = new InputStreamReader(inputStream);
		bReader = new BufferedReader(isr);
	
	}
	
	public String next() {
		
		try {
			String input = bReader.readLine();
			return input.split(" ")[0];
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public String nextLine() {
		
		try {
			String input = bReader.readLine();
			return input;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
		
	}

}
