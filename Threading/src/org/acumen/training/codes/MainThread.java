package org.acumen.training.codes;

public class MainThread {
	
		public static void main(String[] args) {
			//concurrent threading meaning run lang nang run, unahan sila 
			System.out.println("This is called the main thread. Ito unang tinatawag sa runtime.");
			System.out.println("This is called a worker.");
			System.out.println("");
			
			//instantiation
			MyThread worker1 = new MyThread("Juan", 101);
			MyThread worker2 = new MyThread("Jose", 102);
			MyThread worker3 = new MyThread("Junmar", 103);
			//runnable stage
			worker1.start(); //we dont call run, start to
			worker2.start(); //we dont call run, start to
			worker3.start(); //we dont call run, start to
			//dead stage kapag huminto na yung thread
			
			//walang order to unahan sila
		}
}
