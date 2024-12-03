package org.acumen.training.codes.test;

import org.acumen.training.codes.FileFilter;

public class TestFileFilter {

	public static void main(String[] args) {

		FileFilter fileFilter = new FileFilter();
		String filePath = "./src/inputs.txt";
		fileFilter.printDuplicates(filePath);
	}
}
