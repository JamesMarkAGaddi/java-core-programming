package org.acumen.training.codes;

public class MyVolatile {

	private volatile static int counter = 0; // gamit kang vlatile kapag may isang copy lang na vlaue tas nag-aagawan
												// sila

	public static void main(String[] args) {
		new CounterThread().start();
		new PrintThread().start();
	}

	private static class CounterThread extends Thread {

		@Override
		public void run() {
			int temp = counter;
			while (temp < 5) {
				System.out.println("The counter is at %d".formatted(temp));
				counter = ++temp;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static class PrintThread extends Thread {

		public void run() {
			int temp = counter;
			while (temp < 5) {
				if (temp != counter) {
					System.out.println("Printing the counter at %d".formatted(counter));
					counter = temp;
				}
			}
		}
	}
}
