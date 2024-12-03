package org.acumen.training.codes;

public class MasterClass {
	public int x = 10;
	private static String name = "Outer Class";

	public void showLocation() {
		System.out.println("Makati, PHilippines");
	}

	public void accessRersource() {
		SlaveClass sClass = new SlaveClass();
		System.out.println(sClass.name);
		System.out.println(sClass.x);
	}

	public static class SlaveClass {

		public int x = 10;
		private String name = "Outer Class";

		public void accessResource() {
			System.out.println(MasterClass.name); // static lang ang pwede nya maaccess kasi static sya
			System.out.println(name);
		}
	}
}
