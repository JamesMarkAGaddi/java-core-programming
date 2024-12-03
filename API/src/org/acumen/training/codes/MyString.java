package org.acumen.training.codes;

import java.util.Arrays;

public class MyString {

	public static void main(String[] args) {
		String str = new String("This is a proper instantiation of string to be allocated with memory address");
		String str1 = "This is another string but not sure if it is a new object or refurbished"; // immutable
		String str2 = """
				This is new and is called 'textblock'. This is used for paragraphs to unconsider indentation or punctuations
				""";

		// count the number of chars
		int len = str.length();
		System.out.println(len);

		// array of chars
		char[] letters = new char[] { 'a', 's', 'p', 'i', 'n' };

		// array to string
		String dog = new String(letters);
		System.out.println(dog);

		// string to array
		char[] redog = dog.toCharArray();
		System.out.println(Arrays.toString(redog)); // to print an array

		byte[] dogB = dog.getBytes();
		System.out.println(Arrays.toString(dogB));

		// access individual char
		for (int i = 0; i < dog.length(); i++) {
			System.out.print(dog.charAt(i) + " ");
		}
		System.out.println();

		// access the index
		int index = dog.indexOf('a');
		System.out.println(index);
		int indexAtRight = dog.lastIndexOf('a');
		System.out.println(indexAtRight);

		/*
		 * // concat System.out.println(str); System.out.println(str.hashCode()); str =
		 * str.concat(" A character sequence "); // need ni concat ng address para di
		 * sya gumawa ng another object at
		 */ // iadd nya yung strng sa una
		System.out.println(str);
		System.out.println(str.hashCode());

		// instead of concat use this
		String newStr = String.format("%s A character sequence", str); // use this to implement printf but a reusable
																		// one
		System.out.println(newStr);

		System.out.printf("%s A character sequence", str);

		// to concat strings in different types use join
		String concatStr = String.join(" ", "I am a string", new StringBuilder("I am an sb"),
				new StringBuffer("I am a buff"));
		System.out.println(concatStr);

		// to convert all chars
		str = str.toUpperCase();
		System.out.println(str);
		str = str.toLowerCase();
		System.out.println(str);

		// validation methods
		String uname = "\t\t\t\t\n\n\t";
		System.out.println(uname.isEmpty());
		System.out.println(uname.isBlank());

		// reg ex
		String userRule = "[a-zA-Z0-9]+";
		System.out.println(uname.matches(userRule));

		// try
		String userRule2 = "(\\(\\+63\\))[0-9]{3}-[0-9]{3}-[0-9]{4}";
		String num = "(+63)912-312-1432";
		System.out.println(num.matches(userRule2));

		String emailRule = "[A-Z][a-z]+[0-9]*@(securitybank.com.ph)";
		String email = "JAGaddi@securitybank.com.ph";
		System.out.println(email.matches(emailRule));

		String minRule = "[a-zA-Z]{8,}"; // minimun is 8
		String tryMin = "qweryfgreewrw";
		System.out.println(tryMin.matches(minRule));

		String prefix = "\t";
		String suffix = ".";
		System.out.println(str.startsWith(prefix));
		System.out.println(str.endsWith(suffix));

		System.out.println(str.contains("cat"));
		String string = "this is a string";
		System.out.println(str.contentEquals(string));
		System.out.println(str);

		// substring
		String lastWord = str.substring(3);
		System.out.println(lastWord);

		String misWord = str.substring(5, 8);// offset not index so di nasa yung last kasi nagstart yung index count
												// dito sa 1
		System.out.println(misWord);
		String midWord = str.substring(5, 9);
		System.out.println(midWord);

		// sanitations
		String password = "\0\0\0\t\train\n\n";
		System.out.println(password);
		System.out.println(password.strip());
		System.out.println(password.isBlank());
		String password2 = "\0\0\0\t\train\n\n";
		System.out.println(password2);
		System.out.println(password2.trim());
		System.out.println(password2.isBlank());

		// Comparison
		// Immutable = value-centric kapag walang new yung same value dun na rin nya
		// ipopoint
		String employee1 = "Juan Luna";
		String employee2 = "Juan Luna"; // sa employee1 na rin nya dadalhin kasi same value ang tinuro ng gantong
										// declaration
		System.out.println(employee1 == employee2);

		String employee3 = new String("Juan     Luna");
		String employee4 = new String("Juan luna");
		System.out.println(employee3.equals(employee4)); // case-sensitive
		System.out.println(employee3.equalsIgnoreCase(employee4));
		System.out.println(employee3.compareTo(employee4) == 0);
		System.out.println(employee3.compareTo(employee4) > 0);
		System.out.println(employee4.compareTo(employee3) > 0);

		String message = "The fox jumps over the dog.";
		String words[] = message.split(" ");// gawa ka regex pag need ng slicer "[ \\.]" like this par aaalis si
											// punstuation mark
		for (String lookup : words) {
			System.out.println(String.format("%s ", lookup));
		}

		message = message.replace('f', 'b');
		System.out.println(message);

		message = message.replace("over", "under");
		System.out.println(message);

		message = message.indent(8); //indents 8 spaces
		System.out.println(message);
		
		int age = 90;
		String ageStr = String.valueOf(age); //converts priitve tto String
		System.out.println(ageStr);
		
		//String interpolation
		String fName = "Juan";
		String lName = "Luna";
		double salary = 85043.00;
		String logMessage = "The person is %s %s with salary %.3f".formatted(fName,lName,salary);
		System.out.println(logMessage);
		
	}

}
