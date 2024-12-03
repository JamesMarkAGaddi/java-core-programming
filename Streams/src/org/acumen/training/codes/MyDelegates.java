package org.acumen.training.codes;

public class MyDelegates {

	public static void main(String[] args) {
		IDelegate addition = new IDelegate() {}; 
		System.out.println(IDelegate.welcome());
		int sum = addition.sum(10, 20);
		System.out.println(sum);
		
		ITrueDelegate delagate = new ITrueDelegate() {

			@Override
			public void showData() {
				System.out.println("data data data");
				
			}
		};
		
		// Lambda expression
		// formal parameter list
		ITrueDelegate delagate2 = () -> {
			System.out.println("data data data");
		};
	}

}

// Function Interface
@FunctionalInterface
interface ITrueDelegate {
	
	public void showData();
	default public void welcome() {
		System.out.println("Welcome...");
	}
	
}

// Reusable interface
interface IDelegate{
	// constants
	
	// abstract methods
	
	// implemented methods (default method)
	
	default public int sum(int x, int y) {
		return x + y;
	}
	
	public static String welcome() {
		return "Hi, I am a delegate";
	}
	
	public static void main(String[] args) {
		System.out.println("Hello I am weird.");
	}
	
	private void hello() {
		System.out.println("Hello I am weird again...");
	}
	
}
