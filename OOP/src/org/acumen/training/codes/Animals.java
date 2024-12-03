package org.acumen.training.codes;

public class Animals {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		//check for inheritance
		System.out.println(dog instanceof IAnimal);
		System.out.println(cat instanceof IAnimal);
		
		//polymorphism - they are the same in the inheritance(poly) but they still have different forms(morph)
		//Java interface = contract given para malaman kung ano role ng variables
		System.out.println(dog instanceof ICanine);
		System.out.println(cat instanceof ICanine);
		System.out.println(dog instanceof IFeline);
		System.out.println(cat instanceof IFeline);
		

	}
}
