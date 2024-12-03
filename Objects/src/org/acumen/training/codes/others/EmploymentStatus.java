package org.acumen.training.codes.others;

//ganito yung pinagmulan ng Enum

public class EmploymentStatus {

	private String name;

	private EmploymentStatus(String name) {
		this.name = name;
	}

	private static final EmploymentStatus CONTRACT = new EmploymentStatus("Contract");
	private static final EmploymentStatus TENURED = new EmploymentStatus("Tenured");
	private static final EmploymentStatus PROBATIONARY = new EmploymentStatus("Probationary");

	public String toString() {
		return this.name;
	}
}