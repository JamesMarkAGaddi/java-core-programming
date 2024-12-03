package org.acumen.training.codes;

public class TestOuterClass {

	public static void main(String[] args) {
		// long cut version of accessing inner classes
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();// this is how you instatntiate the inner classes

		// lahat lang ng mga nasa innner class
		System.out.println(innerClass.x);

		// this is hte short cut version
		OuterClass.InnerClass innerClass2 = new OuterClass().new InnerClass();
		innerClass2.showData();
		
		MasterClass.SlaveClass slaveClass = new MasterClass.SlaveClass();
		
		
	}
}
