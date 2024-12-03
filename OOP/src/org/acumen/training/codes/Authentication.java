package org.acumen.training.codes;

public abstract class Authentication { // abstract mo ang super class para di sya mainstantiate kasi gagmaitin naman
										// siya ng dalaw nyang subclass

	private String nameString;
	private String password;

	public Authentication() {
		System.out.println("Created Auth...");
	}

	public String getName() {
		return nameString;
	}

	public void setName(String nameString) {
		this.nameString = nameString;
	}

	public boolean authenticate(String name, String password) {
		return true;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean authentication(String name, String password) {
		return false;
	}

	public abstract String createMethod(); // abstract method used for some unimplemented methods
}
