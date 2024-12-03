package org.acumen.training.codes.test;

import org.acumen.training.codes.CreditCardPerks;

public class TestCreditCardPerks {

    public static void main(String[] args) {
    	
        CreditCardPerks perks = new CreditCardPerks();
		String fileName = "./src/flights.txt";
        double totalMiles = perks.processFrequentFlier(fileName);
        System.out.println("Total frequent flyer miles earned: " + totalMiles);
    }
}
