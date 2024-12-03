package org.acumen.training.codes;

public class MyObject {
	//lahat ng OOP, may big-Object
	public static void main(String[] args) {

		//kasda class may constructor na tinatawag
		//default constructor taag kapag di ka nag-instantiate
		Object object = new Object();
		
		Login login1 = new Login();
		login1.setId(101);
		login1.setUsername("root");
		login1.setPasswordString("root");

		Login login2 = new Login();
		login2.setId(102);
		login2.setUsername("postgre");
		login2.setPasswordString("postgre");

		System.out.println(login1.toString());
		
		System.out.println(login1.equals(login2));
		
		Class<?> reflectLogin = login1.getClass();
	}

}
