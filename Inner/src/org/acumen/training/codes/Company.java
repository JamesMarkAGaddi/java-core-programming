package org.acumen.training.codes;

public class Company {

	public void createManager(Manager mgr) {
		mgr.showLocation();
	}

	public Manager createManager() {
		return new Manager() { };
	}
}