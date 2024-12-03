package org.acumen.training.codes.itema;

public class NoNegativeValuesException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message = "Negative values are not allowed for matrix dimensions.";

	public NoNegativeValuesException() {
	}

	public NoNegativeValuesException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void printStackTrace() {
		System.err.println(this.message);
	}

}
