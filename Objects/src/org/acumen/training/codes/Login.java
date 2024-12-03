package org.acumen.training.codes;

//public class Login implements Comparable<Login> { // COmparable sa mismong Java bean iniimplement
public class Login {
	private Integer id;
	private String username;
	private String passwordString;

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
}
