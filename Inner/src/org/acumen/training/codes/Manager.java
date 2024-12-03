package org.acumen.training.codes;

import java.time.LocalDate;

public class Manager {

	public int x = 100;
	public String fullNameString = "Juan Luna";

	public int y = 10;
	private String name = "Outer Class";
	public int zip = 1020;
	private LocalDate dateTransferred = LocalDate.now();

	public void showLocation() {
		System.out.println("Makati, Philippines");
	}

	public void showDetails() {
		System.out.println("anonymous details");
	}

}
