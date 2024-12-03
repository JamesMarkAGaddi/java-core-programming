package org.acumen.training.codes;

public class TestMathLib {

	public static void main(String[] args) {
		// Re-usable classes
		MathLib<Integer> math = new MathLib<>();
		// ? wildcard 
		// uses super  (runtime restriction)
		MathLib<Number> math2 = new MathLib<>(); // generic class only recognizes/accepts class types
	    math2.oper1 = 100;
	    math2.oper2 = 200;
	    math2.arrOpers = new Integer[100];
	    
	    System.out.println(math2.subtract(100, 200));
	    MathLib<Number> math3 = new MathLib<>();
	    
	    math3.subtract(10.0F, 20.0F); // type-strict
	    
	    
	    MyCompare comp = new MyCompare();
	    System.out.println(comp.<CharSequence, CharSequence>isDifferent("Abba", "Abba"));
	    System.out.println(comp.<CharSequence, 
	    		CharSequence>isDifferent(new StringBuilder("Abba"), "Abba"));
	    
	    TextConnection text = new TextConnection();
	    System.out.println(text.<CharSequence>mergeChars("", ""));
	}

}
