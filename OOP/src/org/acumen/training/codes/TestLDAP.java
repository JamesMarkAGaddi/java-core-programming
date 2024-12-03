package org.acumen.training.codes;

public class TestLDAP {

	public static void main(String[] args) {
		
		LDAPAuthentication ldap = new LDAPAuthentication();
		PasswordAuthentication pass = new PasswordAuthentication();

		ldap.setName("root");
		ldap.setName("root");
		pass.setName("root2");
		pass.setName("root2");

		System.out.println(ldap.getName());
		System.out.println(pass.getName());

	}
}
