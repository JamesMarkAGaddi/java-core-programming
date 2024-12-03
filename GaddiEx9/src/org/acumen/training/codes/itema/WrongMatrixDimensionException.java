package org.acumen.training.codes.itema;

public class WrongMatrixDimensionException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message = "Matrices dimensions do not match.";

	public WrongMatrixDimensionException() {
	}

	public WrongMatrixDimensionException(String message) {
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
