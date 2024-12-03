package org.acumen.training.codes;

public class MyThrowable {
	
	public static void main(String[] args) {
		
		Throwable throwable = new Throwable();
		
		//two tyoes throwables:
		Throwable errThrowable = new Error(); //unmanageable by devs, need infra dept
		Throwable exceThrowable = new Exception(); //this is programmer-dependent os dapat mahandle mo to nang maayos
	}
}
