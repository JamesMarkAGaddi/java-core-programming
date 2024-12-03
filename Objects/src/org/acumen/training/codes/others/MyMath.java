package org.acumen.training.codes.others;

public class MyMath extends MyAbstractMath {

	public MyMath() {
		super("Trigo"); // tatawagin neto yung extendsnya, yungmga constructor nya ron depends sa dami
					// ng param na available
	}

	@Override
	protected void compute() {
		System.out.println("child computation");
	}

	public void accessComputation() {

		super.compute(); // calls the extends method
		this.compute(); // calls the local method
		
	}
}