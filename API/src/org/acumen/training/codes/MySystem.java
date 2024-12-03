package org.acumen.training.codes;

import java.io.IOException;

public class MySystem {

	public static void main(String[] args) {
		System.out.println("lang is a CORE PACKAGE because you dont need to import");

		// 5 uses of system
		// utilizing output buffer - BIOS
		System.out.println("System.out.print with new line");
		System.out.print("System.out.print with no new line");
		// padding output
		System.out.format("The name is %25s of age %-10d with salary %80.2f\n", "Juan Luna", 60, 123423.555);
		System.out.println();

		// Employee records
		Employee e1 = new Employee();
		e1.fullName = "Jose Rizal";
		e1.age = 321;
		e1.salary = 500000.00;

		Employee e2 = new Employee();
		e2.fullName = "Apo Mabini";
		e2.age = 532;
		e2.salary = 1234.43;

		Employee[] records = { e1, e2 };

		for (Employee lookup : records) {
			System.out.format("The name is %25s of age %-10d with salary %-100.2f\n", lookup.fullName, lookup.age,
					lookup.salary);
		}

		// utilizing input buffer // remember to clear cache after receiving inputs
		try {
			System.out.print("ENTER A LETTER: ");
			char letter = (char) System.in.read();// pag character character lang pwede na to
			System.out.println("you typed: " + letter);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		try {
			System.in.skip(System.in.available());  //clears cache
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		byte[] inputBuffer = new byte[1024]; //create buffer muna, array of bytes
		try {
			System.out.print("Enter name: ");
			System.in.read(inputBuffer); // kapag String
			System.out.print("yout typed: ");
			System.out.println(new String(inputBuffer));
		} catch (IOException e) {
			e.printStackTrace();
		}

		// utilizing error buffer
		
		byte[] inputBuffer2 = new byte[1024]; 
		try {
			System.out.print("Enter name: ");
			System.in.read(inputBuffer2); 
			System.out.println(new String(inputBuffer2));
		} catch (IOException e) {
			System.err.print(e.getMessage());
		}
		
		System.err.print("Error detedted!"); //error message
		
		// utilizing system env variables - directories, folders, etc
		System.out.print(System.getProperty("user.home"));
		System.getProperties().list(System.out); //retrieve System properties includes folders and directories
		
		
		// copying array data System.arrayCopy()
		
		// estimating runtime performance
		long before = System.nanoTime();
		for ( int i =0 ; i < 100000; i++) {
			
		}
		
		long timeElapsed = System.nanoTime() - before; 
		System.out.println(timeElapsed);
		
		// garbage collection
		System.gc(); //VM cleaning for Infra or Admin // needs the server to be off before doing this
		

	}
}
