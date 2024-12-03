package org.acumen.training.codes;

public abstract interface IAnimal extends ILiving {
	public void eats();

	public void rest();

	public void respire();

	public void excrete();

	public static void main(String[] args) {

	}
}

interface ILiving {
	void move();
}

class Dog implements IAnimal, ICanine { // base classes and tawag sa interface, not super class

	@Override
	public void eats() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub

	}

	@Override
	public void respire() {
		// TODO Auto-generated method stub

	}

	@Override
	public void excrete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void meow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scratch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		
	}

}

class Cat implements IFeline {

	@Override
	public void meow() {
		// TODO Auto-generated method stub

	}

	@Override
	public void flex() {
		// TODO Auto-generated method stub

	}

}