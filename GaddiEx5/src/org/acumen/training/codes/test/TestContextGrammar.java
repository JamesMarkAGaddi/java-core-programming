package org.acumen.training.codes.test;

import org.acumen.training.codes.ContextGrammar;

public class TestContextGrammar {

	public static void main(String[] args) {
		
		ContextGrammar cg = new ContextGrammar();

		String testData1 = "abaabbcbaccb";
		System.out.println(String.format("String testData1: %s", testData1));
		System.out.println(String.format("New context is: %s", cg.parseCfg(testData1)));
		System.out.println();

		String testData2 = "bbbbbbb";
		System.out.println(String.format("String testData1: %s", testData2));
		System.out.println(String.format("New context is: %s", cg.parseCfg(testData2)));
		System.out.println();
		
		String testData3 = "bccbccbb";
		System.out.println(String.format("String testData1: %s", testData3));
		System.out.println(String.format("New context is: %s", cg.parseCfg(testData3)));
		System.out.println();
		
		String testData4 = "aaabbb";
		System.out.println(String.format("String testData1: %s", testData4));
		System.out.println(String.format("New context is: %s", cg.parseCfg(testData4)));
		System.out.println();
		
		String testData5 = "ccabbc";
		System.out.println(String.format("String testData1: %s", testData5));
		System.out.println(String.format("New context is: %s", cg.parseCfg(testData5)));
		System.out.println();
	}
	
}
