package org.acumen.training.codes.itema;

public class InvalidMatrixOperationException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message = "At least two matrices are required.";

	public InvalidMatrixOperationException() {
	}

	public InvalidMatrixOperationException(String message) {
		this.setMessage(message);
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
