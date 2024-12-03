package org.acumen.training.codes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ClassRecordGenerator {

	public void createRecords(String filename) {

		Scanner scanner = new Scanner(System.in);
		char smiley = '\u263a';
		System.out.format("Good day Teacher Nina! %c\n", smiley);
		System.out.print("How many student records would you like to enter? ");
		int numberOfRecords = scanner.nextInt();
		scanner.nextLine();

		try {

			FileOutputStream fos = new FileOutputStream(filename);

			for (int i = 0; i < numberOfRecords; i++) {

				System.out.print("Enter student name: ");
				String studentName = scanner.nextLine();

				System.out.print("Enter quiz scores (separated by space): ");
				String quizScores = scanner.nextLine();
				String[] scoresArray = quizScores.split(" "); // array for score per student

				byte[] nameBytes = new byte[30]; // record of names
				byte[] nameData = studentName.getBytes(); // saves the name per input
				int min = Math.min(nameData.length, nameBytes.length);
				System.arraycopy(nameData, 0, nameBytes, 0, min); // copy the input name to the record
				fos.write(nameBytes);

				for (String score : scoresArray) {
					byte[] scoreBytes = score.getBytes(); // record of grades per student
					fos.write(scoreBytes);
					fos.write(' ');
				}
				fos.write('\n');
			}
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		scanner.close();
	}

	/*
	 * This method returns the name of the highest scorer in the file by: 
	 * 1. fis reads the content of the file 
	 * 2. innermost while-loop uses parseDouble to convert String score(from file)
	 *  to double and save it to an array (scores) 
	 * 3. adds count to total number of scores per line 
	 * 4. computes the average
	 * 5. compares every average until all students in the file are done
	 */
	public String queryHighestAverage(String filename) {

		String highestScorer = "";
		double highestAverage = 0.0;

		try {

			FileInputStream fis = new FileInputStream(filename);
			byte[] nameBytes = new byte[30]; // assume array size only
			int read;

			while ((read = fis.read(nameBytes)) >= 0) {

				double[] scores = new double[10]; 
				double totalScore = 0.0;
				double average = 0.0;
				int count = 0;
				
				String studentName = new String(nameBytes).trim(); //save name
				StringBuilder scoreItem = new StringBuilder(); //container for each score

				while ((read = fis.read()) != '\n' && read >= 0) {

					if (read == ' ') { // delimiter to check score before a space

						if (count < scores.length) {
							scores[count] = Double.parseDouble(new String(scoreItem)); //save sb saver to scores[]
							count++; // count number of scores
						}
						scoreItem = new StringBuilder(); // reset sb saver
					} else {
						scoreItem.append((char) read); // add space to sb saver
					}
				}

				for (int i = 0; i < count; i++) {
					totalScore += scores[i];
				}
				average = totalScore / count;

				if (average > highestAverage) {
					highestAverage = average; // Set new highest average
					highestScorer = studentName; // Set new highest scorer
				} else if (average == highestAverage) {
					highestScorer += ", " + studentName; // Handle ties
				}
			}
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  catch (IOException e) {
			e.printStackTrace();
		}

		return highestScorer;
	}
}
