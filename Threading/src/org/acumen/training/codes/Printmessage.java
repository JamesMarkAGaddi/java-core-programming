package org.acumen.training.codes;

public class Printmessage {

	public static void main(String[] args) {

		new MessageThread().run();
		
		
		Runnable task = new Runnable() { // anonymous class using runnable
			
			@Override
			public void run() {
				Printer.printArray();
				
			}
		};
		
		
		Thread runner1 = new Thread(task, "James");
		Thread runner2 = new Thread(task, "Mark");
		Thread runner3 = new Thread(task, "Gaddi");
		
		runner1.start();
		runner2.start();
		runner3.start();
		
		
	}

	public static class MessageThread implements Runnable{

		@Override
		public void run() {
			Printer.printArray();

		}
	}

	private static class Printer {

		private static String[] message = { "I", "love", "CSharp", "." };

		public synchronized  static void printArray() {

			for (String lookString : message) {
				System.out.println(lookString);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
