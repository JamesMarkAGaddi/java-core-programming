package org.acumen.training.codes;

public class Shadowing {
	
	public static void main(String[] args) {
		//inheritance(uses abstract class
		AdminUser admin = new AdminUser();
		User admin2 = new AdminUser();
		//shadowing gamit kapag nagtitipid ng virtual machine so kahit di mo na iload lahat
		//kunwari need mo lahat ng AdminUser, yungun gamitn mo
		//nashashadow meaning pwede mong gamitin yung mga derived classes ng adminuser basta meron din si user
		
		//shadowig through poly
		Dog dog = new Dog();
		IAnimal dog2 = new Dog();
		//so di mo mababasa yung mga kay dog kasi IAnimal ang pointer mo so yun algn ang nakahilight is yung sa IANimal interface
		ICanine dog3 = new Dog();
		

	}
}
