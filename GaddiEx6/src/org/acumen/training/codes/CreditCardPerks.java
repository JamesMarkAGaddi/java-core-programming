/*
 * The process is as follows: 
 * 1. Using scanner, the file will be scanned
 * 2. Using while-loop, the file will be traversed line per line as long as there is a nextLine()
 * 3. Using split(), the items per line will be split into 2 to make an array with 2 items
 * 4. ticketType = first item which is the flight type, miles = second item which is the miles
 * 5. Using the formula, compute the flyer miles
 * 6. after one line, the loop will repeat as long as condition is met
 */
package org.acumen.training.codes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CreditCardPerks {

	public double processFrequentFlier(String filePath) {

		double totalMiles = 0;

		try {
			File file = new File(filePath);
			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] parts = line.split(" ");

				String ticketType = parts[0];
				double miles = (double) Integer.parseInt(parts[1]);

				switch (ticketType.toLowerCase()) {
				case "coach": {
					totalMiles += miles;
				}
					break;
				case "firstclass": {
					totalMiles += miles * 2;
				}
					break;
				case "discount": {
					totalMiles += 0;
				}
					break;
				default: {
					System.out.println("Unknown ticket type: " + ticketType);
				}
					break;
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + filePath);
		}

		return totalMiles;
	}
}
