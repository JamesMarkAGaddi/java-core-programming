package org.acumen.training.codes;

//public class Login implements Comparable<Login> { // COmparable sa mismong Java bean iniimplement
public class Login {
	private Integer id;
	private String username;
	private String passwordString;

	// kasda class may constructor na tinatawag
	// default constructor taag kapag di ka nag-instantiate
	// kapag naglagay ka na ng mga constructor like no arg, wal na syang default

	public Login() {
		// this is called no arg constructor
		System.out.println("HELLLO NAKAPAG LOGIN KA NA");
	}

	public Login(Integer id, String username, String passwordString) throws LoginException, Exception { // constructor
																										// injection
																										// meaning
																										// magllaagay ka
																										// ng
		// preliminary values sa mga variables
		System.out.println("Input everything");

		if (id == null || username == null || passwordString == null) {
			throw new LoginException();
		}

		this.id = id;
		this.username = username;
		this.passwordString = passwordString;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswordString() {
		return passwordString;
	}

	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}

//	@Override
//	public int compareTo(Login o) { // bligtaran lang sign ng 2,-2 para maging ascending order
//		if (this.username.compareTo(o.username) == 0) {
//			return 0;
//		} else if (this.username.compareTo(o.username) > 0) {
//			return -2;
//		}
//		return 2;
//	}

	@Override
	public String toString() {
		return String.format("%d %s %s", this.id, this.username, this.passwordString);
	}

	@Override
	public boolean equals(Object obj) {
		Login login2 = (Login) obj;
		String rec = String.format("%d %s %s", login2.id, login2.username, login2.passwordString);
		String rec2 = String.format("%d %s %s", this.getId(), this.getUsername(), this.getPasswordString());
		return rec.equalsIgnoreCase(rec2);
	}

}

class LoginException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String message = "login nyenye mali";

	public LoginException() {

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void printStackTrace() {
		System.out.println(message);
	}

}
