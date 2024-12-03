package org.acumen.training.codes.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class MyFiles {
//java file lang walang directory info gnaun ganun
	public static void main(String[] args) {

		// File file = new File();// abstraction lang to walang creation or what
		// so need ng file path
		System.out.println("File");
		String filePath = "./src/files/memo.txt";
		File file = new File(filePath); // file pointer lang to kaya ganyan ang path

		boolean exist = file.exists();
		System.out.println(exist); // check first if existing na

		try {
			boolean isCreated = file.createNewFile(); // to create the file if not existing
			System.out.println(isCreated); // check for existence
			exist = file.exists();
			System.out.println(exist);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(file.length());
		System.out.println(file.getName());
		System.out.println(file.getPath()); // .\src\files\memo.txt
		System.out.println(file.getAbsolutePath()); // C:\Training\Demo\Track3\API\.\src\files\memo.txt
		try {
			System.out.println(file.getCanonicalPath()); // C:\Training\Demo\Track3\API\src\files\memo.txt
		} catch (IOException e) {
			e.printStackTrace(); // getAbsolutePath pero may exception kapag wala kang rights sa device driver
		}
		
		//setters
		System.out.println(file.setReadable(true));
		System.out.println(file.setWritable(true));
		System.out.println(file.setExecutable(true));
		
		//validators //mga is is boolean methods
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.canExecute());
		System.out.println(file.isDirectory());
		System.out.println(file.isHidden());
		System.out.println(new Date(file.lastModified()));
		
		// Directory
		System.out.println("\nDirectory");
		String dirPath = "./src/files/data";
		File dir = new File(dirPath);

		boolean exist2 = dir.exists();
		System.out.println(exist2);

		boolean isMade = dir.mkdir();
		System.out.println(isMade);

		exist2 = dir.exists();
		System.out.println(exist2);

		String treeDir = "./src/files/db/config";
		File dir2 = new File(treeDir);
		isMade = dir2.mkdirs();
		System.out.println(isMade);
		
		String files = "./src/files";
		File dirFile = new File(files);
		
		for ( File file2 : dirFile.listFiles()) {
			System.out.println(file2.getName());
		}
		System.out.println("========================================");

		for (String name : dirFile.list()) {
			System.out.println(name);
		}
		System.out.println("========================================");


	}

}
