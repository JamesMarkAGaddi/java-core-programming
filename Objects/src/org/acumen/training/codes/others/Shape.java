package org.acumen.training.codes.others;

abstract class Figure {

	public Figure() {
		System.out.println("This is a figure");
	}

	public Figure(String type) {
		System.out.println("This is a figure with type");
	}
}

public class Shape extends Figure {
	// initialization blocks (IB)

	{ // IB
		System.out.println("Loading utility features...");
	}

	{ // IB
		System.out.println("Loading other features...");

	}

	// static IB
	// inuunahan nanya yung mga constructors kung anong napili natin
	// pwede mo gamitin to para madetect agad yung mga initialization exceptions na magiging error
	static { //once lang to tinatawag kunwari initialization ng database ganun di namna need paulit-ulit tinatawag yun
		// kunwari di nakatulong yung chianing so pampabilis to
		System.out.println("Connect to the database");

	}
	
	static { //pwedeng dalawang static ib
		System.out.println("Connect to the network");

	}

//chaining
	public Shape() {
		super(""); // calling naman yung abstract class
		System.out.println("Creating a shape object.");
	}

	public Shape(String name) {
		this(); // calling no param Shape() explicitly
		System.out.println("Creating a shape object %s".formatted(name));
		System.out.println("Load the GUI color");

	}

	public Shape(String name, int width, int height) {
		this(name); // calling Shape(String name) explicitly
		System.out.println("Creating a shape object %s with %d x %d".formatted(name, width, height));
	}

}
