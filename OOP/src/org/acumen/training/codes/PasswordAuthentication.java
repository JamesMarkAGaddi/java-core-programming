package org.acumen.training.codes;

public class PasswordAuthentication extends Authentication { // use extends keyword for inheritance
	
	public PasswordAuthentication() {
		
		System.out.println("Created password Auth...");
	}
	
	@ Override // this is what we call an annotation
	public boolean authentication(String name, String password) {
		return false;
	}

	@Override
	public String createMethod() {
		return null;
	}
}
