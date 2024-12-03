package org.acumen.training.codes.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyBinaryFile {

	public static void main(String[] args) {

		File file = new File("./src/files/grades.bin"); // instantiate a binary file
		FileOutputStream foStream;
		try {
			foStream = new FileOutputStream(file); // papasa lang kasi walang printer
			DataOutputStream dos = new DataOutputStream(foStream);
			dos.writeDouble(99.5);
			dos.writeDouble(88.9);
			dos.writeDouble(90.7);
			dos.writeDouble(45.65);
			dos.writeDouble(98.65);
			dos.flush();
			dos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			DataInputStream dataInputStream = new DataInputStream(fis);
			while(dataInputStream.available()>0) {
				double grade = dataInputStream.readDouble();
				System.out.println(grade);
			}
			
			dataInputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
