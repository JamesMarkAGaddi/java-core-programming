package org.acumen.training.codes.records;

public class TestProfile {

	public static void main(String[] args) {

		Profile profile = new Profile(101, "James", 123.12);
		System.out.println(profile.id()); // matic get na to 

		Profile profile2 = new Profile(102);
		System.out.println(profile2.name()); // matic get na to 

		Profile profile3 = new Profile();
		System.out.println(profile3.name()); // matic get na to 
		
	
		
		
	}
}
