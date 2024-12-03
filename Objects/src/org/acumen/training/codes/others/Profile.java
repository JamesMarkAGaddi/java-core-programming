package org.acumen.training.codes.others;

public class Profile {

	// constuctor chaining
	private String firstName;
	private String lastName;

	public Profile() {
		System.out.println("asfafsdadfsa");
	}

	public Profile(String firstName, String lastName) {
		this();
		
		//verify mo rito kung may laman si firstname tas nullpointerexception
		this.firstName = firstName;
		this.lastName = lastName;

		System.out.println("nyenyenye");
	}

	public Profile(String firstName) {
		this(firstName, "" );
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
