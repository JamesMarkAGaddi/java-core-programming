package org.acumen.training.codes;

import java.util.List;

public class TestLoginRepo {

	public static void main(String[] args) {
		
		LoginRepository reppo = new LoginRepository();
		List<Login> recList = reppo.getAllLogins();
		System.out.println(recList);
		
		recList.remove(0);
		System.out.println(recList);
	}
}
