package org.acumen.training.codes;

import java.util.ArrayList;
import java.util.List;

public class LoginRepository {

	public List<Login> getAllLogins() {

		Login login = new Login();
		login.setId(101);
		login.setUsername("root");
		login.setPasswordString("root");

		Login login2 = new Login();
		login2.setId(102);
		login2.setUsername("postgre");
		login2.setPasswordString("postgre");

		Login login3 = new Login();
		login3.setId(103);
		login3.setUsername("scottie");
		login3.setPasswordString("thompson");

		List<Login> recoList = new ArrayList<Login>();
		recoList.add(login);
		recoList.add(login2);
		recoList.add(login3);

		return recoList;

	}
}
