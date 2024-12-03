package org.acumen.training.codes;

import java.security.PublicKey;

//nested inner class
public class OuterClass {
	// class na nasa loob ng isa pang class
	// kunwari isang class lang namana ang gagamit sakanya, dito mo na sya gamitin,
	// wag ka na magdefault or gumawa ng isa pang file.java

	public int dd = 12;
	private int ddd = 21;
	protected int ee = 234;
	public String nameString = "Outer Class";

	public void showLoca() {
		System.out.println("Makati");

	}

	public class InnerClass {

		public int x = 10;
		private String nameString = "Inner Class";

		public void showData() {
			System.out.println(OuterClass.this.nameString);
			System.out.println(this.nameString);
		}

		private String getName() {
			return nameString;
		}

	}

	protected class InnerInnerClass {

		protected void showData() {

			System.out.println(dd);
		}
	}

	private class PrivateInnerClass {

		private void showData() {

			System.out.println(dd);
		}
	}

	class DefaultClass {

	}

}
