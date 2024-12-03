package org.acumen.training.codes.test;

import org.acumen.training.codes.CancerCells;

public class TestCancerCells {

	public static void main(String[] args) {

		CancerCells cancerCells = new CancerCells();
		String dnaSequence1 = "ACTCGGAATTCGATCCCCACTGGAATTCGATCCGGA";
		String dnaSequence2 = "GAATTCGAATTCGGAATTCGATCCGGAATTCGATCCGATCC";
		String dnaSequence3 = "AAGAATTCGGAATTCGATCCGAATTCGATCCGGAATTCGATCC";
		String dnaSequence4 = "GAATTCGGAATTCGATCCCCGATCCGAATTCGGAATTCGATCC";
		String dnaSequence5 = "GGAATTCGATCCGGAATTCGATCCCGAATTCGATCCGGA";

		cancerCells.locateCovid(dnaSequence1);
		cancerCells.locateCovid(dnaSequence2);
		cancerCells.locateCovid(dnaSequence3);
		cancerCells.locateCovid(dnaSequence4);
		cancerCells.locateCovid(dnaSequence5);
	}
}
