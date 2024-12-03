package org.acumen.training.codes;

public class NegativeOperandExeption extends Exception {

	private static final long serialVersionUID = 1L;
	private String message = "Negative operand not allowed.";

	public NegativeOperandExeption() {
	}

	public NegativeOperandExeption(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.getMessage();
	}

	@Override
	public void printStackTrace() {
		System.err.println(this.message);
	}

}
