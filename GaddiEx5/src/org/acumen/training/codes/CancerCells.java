package org.acumen.training.codes;

public class CancerCells {

	private static final String ECO_R1 = "GAATTC";
	private static final String BAM_H1 = "GATCC"; 
	
	public void locateCovid(String cells) {
		
		byte maxPositions = 100; 
		int[] ecoR1Positions = new int[maxPositions]; 
		int[] bamH1Positions = new int[maxPositions];
		int ecoR1Count = 0; 
		int bamH1Count = 0; 

		System.out.println("Original DNA Sequence: " + cells);
		
		for (int i = 0; i <= cells.length() - ECO_R1.length(); i++) {
			if (cells.startsWith(ECO_R1, i)) {
				ecoR1Positions[ecoR1Count++] = i;
			}
		}
		
		if (ecoR1Count > 0) {
			System.out.print("GAATTC is found at position(s): ");
			for (int i = 0; i < ecoR1Count; i++) {
				System.out.print(ecoR1Positions[i] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i <= cells.length() - BAM_H1.length(); i++) {
			if (cells.startsWith(BAM_H1, i)) {
				bamH1Positions[bamH1Count++] = i;
			}
		}

		if (bamH1Count > 0) {
			System.out.print("GATCC is found at position(s): ");
			for (int i = 0; i < bamH1Count; i++) {
				System.out.print(bamH1Positions[i] + " ");
			}
			System.out.println();
		}
		
		treatDNA(cells);
		
		ecoR1Positions = null;
		bamH1Positions = null;
	}
	/*
	 * This deletes the Covid patterns in the DNA 
	 */
	private static void treatDNA(String cells) {

		System.out.println(cells);
		cells = cells.replaceAll("(GAATTC)|(GATCC)", "");

		System.out.print("Treated DNA Sequence: ");
		System.out.println(cells);
		System.out.println();
	}

}
