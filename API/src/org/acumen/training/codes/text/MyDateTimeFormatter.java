package org.acumen.training.codes.text;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyDateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDate dateOnly = LocalDate.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
		System.out.println(dateOnly.format(fmt));

	}
}
