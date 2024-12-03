package org.acumen.training.codes;

//para makagawa ng isang worker, extends mo sa isang thread class
public class MyThread extends Thread {

	private String input1;
	private Integer input2;

	public String getInput1() {
		return input1;
	}

	public void setInput1(String input1) {
		this.input1 = input1;
	}

	public Integer getInput2() {
		return input2;
	}

	public void setInput2(Integer input2) {
		this.input2 = input2;
	}

	public MyThread() {

	}

	public MyThread(String input1, Integer input2) {

		this.input1 = input1;
		this.input2 = input2;
	}

	@Override
	public void run() { // may isa lang syang method na magpproprocess ng kayan trabaho
		System.out.println("I am a thread. %d %s".formatted(this.input2, this.input1));
	}
}
