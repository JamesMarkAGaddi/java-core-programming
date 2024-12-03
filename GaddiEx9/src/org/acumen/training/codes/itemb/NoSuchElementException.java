package org.acumen.training.codes.itemb;

public class NoSuchElementException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message = "Element not found in the list.";

	public NoSuchElementException() {
	}

	public NoSuchElementException(String message) {
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
