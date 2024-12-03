package org.acumen.training.codes;

import java.io.IOException;
import static java.lang.Math.subtractExact;

public class Mileage {

	private String name;
	private int totalMiles;
	private double gallonsUsed;
	private double milesPerGallon;
	private double pricePerGallon;
	private double totalAmountPaid;
	private int initialOdometer;
	private int finalOdometer;

	public void getForm() {
	    byte[] inputBuffer = new byte[1024];
	    boolean validInput;

	    try {
	        do {
	            System.out.print("Enter name: ");
	            int bytesRead = System.in.read(inputBuffer);
	            this.name = new String(inputBuffer, 0, bytesRead).trim();
	            validInput = !this.name.isEmpty();
	            if (!validInput) {
	                System.err.println("Name cannot be empty. Please try again.");
	            }
	        } while (!validInput);

	        do {
	            System.out.print("Enter price per gallon: ");
	            int bytesRead = System.in.read(inputBuffer);
	            try {
	                this.pricePerGallon = Double.parseDouble(new String(inputBuffer, 0, bytesRead).trim());
	                validInput = this.pricePerGallon > 0;
	                if (!validInput) {
	                    System.err.println("Price must be greater than 0. Please try again.");
	                }
	            } catch (NumberFormatException e) {
	                System.err.println("Invalid number format. Please enter a valid decimal number.");
	                validInput = false;
	            }
	        } while (!validInput);

	        do {
	            System.out.print("Enter total price for fill up: ");
	            int bytesRead = System.in.read(inputBuffer);
	            try {
	                this.totalAmountPaid = Double.parseDouble(new String(inputBuffer, 0, bytesRead).trim());
	                validInput = this.totalAmountPaid > 0;
	                if (!validInput) {
	                    System.err.println("Total price must be greater than 0. Please try again.");
	                }
	            } catch (NumberFormatException e) {
	                System.err.println("Invalid number format. Please enter a valid decimal number.");
	                validInput = false;
	            }
	        } while (!validInput);

	        do {
	            System.out.print("Enter initial odometer value: ");
	            int bytesRead = System.in.read(inputBuffer);
	            try {
	                this.initialOdometer = Integer.parseInt(new String(inputBuffer, 0, bytesRead).trim());
	                validInput = this.initialOdometer >= 0;
	                if (!validInput) {
	                    System.err.println("Odometer value must be 0 or greater. Please try again.");
	                }
	            } catch (NumberFormatException e) {
	                System.err.println("Invalid number format. Please enter a valid integer.");
	                validInput = false;
	            }
	        } while (!validInput);

	        do {
	            System.out.print("Enter final odometer value: ");
	            int bytesRead = System.in.read(inputBuffer);
	            try {
	                this.finalOdometer = Integer.parseInt(new String(inputBuffer, 0, bytesRead).trim());
	                validInput = this.finalOdometer > this.initialOdometer;
	                if (!validInput) {
	                    System.err.println("Final odometer value must be greater than the initial value. Please try again.");
	                }
	            } catch (NumberFormatException e) {
	                System.err.println("Invalid number format. Please enter a valid integer.");
	                validInput = false;
	            }
	        } while (!validInput);

	    } catch (IOException e) {
	        System.err.println("Error reading input: " + e.getMessage());
	    }

	    inputDetails();
	}


	public void inputDetails() {
		computeMileage();
		computeGallonsUsed();
		computeMilesPerGal();
		displayResult(totalMiles, gallonsUsed, milesPerGallon);
	}

	public void clearCache() {

		try {
			System.in.skip(System.in.available());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void computeMileage() {

		totalMiles = subtractExact(finalOdometer, initialOdometer);
	}

	private void computeGallonsUsed() {

		gallonsUsed = totalAmountPaid / pricePerGallon;
	}

	private void computeMilesPerGal() {

		milesPerGallon = totalMiles / gallonsUsed;
	}

	private void displayResult(int totalMiles, double gallonsUsed, double milesPerGallon) {

		System.out.print(String.format("%s, ", name));
		System.out.print(String.format("you drove %d miles ", totalMiles));
		System.out.print(String.format("using %f gallons ", gallonsUsed));
		System.out.println(String.format("with an mpg of %f.", milesPerGallon));

	}
}
