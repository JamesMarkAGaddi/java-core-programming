package org.acumen.training.codes;

public class LDAPAuthentication extends Authentication { // use extends keyword for inheritance
	public LDAPAuthentication() {
		System.out.println("Created ldap Auth...");
	}

	@Override
	public String createMethod() {
		return null;
	}
}
