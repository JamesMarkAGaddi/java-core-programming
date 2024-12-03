/*
 * The process is as follows:
 * 1. using Scanner, the file is scanned and traversed through hasNextLine method. As long as there is a nextline, the traversing continues
 * 2. saved the words in a String[] array named tokens by splitting them by whitespace regex
 * 3. initialized a StringBuilder to have a container for the output
 * 4. used i variable to iterate through the array tokens
 * 5. innermost while condition is used to compare the latter word tokens[1+1] if equals to the former word currentToken
 * 6. innermost if condition used to append to the output StringBuilder the word and count(increments when item 5 = true)
 */
package org.acumen.training.codes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileFilter {

	public void printDuplicates(String filePath) {

		try {
			File file = new File(filePath);
			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] tokens = line.split("\\s+");
				StringBuilder output = new StringBuilder();
				int i = 0;

				while (i < tokens.length) {
					String currentToken = tokens[i];
					int count = 1;

					while (i + 1 < tokens.length && tokens[i + 1].equals(currentToken)) {
						count++; //counter for occurrences
						i++; //counter for iterator to skip counted word
					}

					if (count > 1) {
						if (output.length() > 0) {
							output.append(" ");
						}
						output.append(currentToken).append("*").append(count); 
					}

					i++;
				}

				if (output.length() > 0) {
					System.out.println(output.toString());
				}
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + filePath);
		}
	}
}