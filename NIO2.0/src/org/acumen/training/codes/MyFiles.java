package org.acumen.training.codes;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class MyFiles {

	public static void main(String[] args) {

		// file system basis
		// no java path meaning no need na ng dot
		Path filePath = Path.of("/src/files/data.txt");
		Path filePath2 = Path.of("src", "files", "data2.txt");

		try {
			Files.createFile(filePath);
			Files.createFile(filePath2);
		} catch (IOException e) {
			System.err.println("File already created!");
		}

		FileSystem system = FileSystems.getDefault();
		for (FileStore store : system.getFileStores()) {
			try {
				System.out.println(store.getTotalSpace());
				System.out.println(store.getBlockSize());
				System.out.println(store.name());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(system.toString());

		//BUffered read and write
		
		
		
		
		
		
		//buffer object
		
		
		
		
		
		
		//byte mapped buffer
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
