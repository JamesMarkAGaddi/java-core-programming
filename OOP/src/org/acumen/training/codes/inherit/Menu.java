package org.acumen.training.codes.inherit;

public abstract class Menu {
	// constant var
	public static final int WIDTH = 100;
	public static final int HEIGHT = 50;
	// instance var
	public String titleMessage = "This is a title bar";

	// instance of a class
	public void colorHeader() {
		System.out.println("COlor the header black");
	}

	public void colorFooter() {
		System.out.println("COlor the footer white");
	}

	public abstract void hoverTextField();

	public abstract boolean retriveFormField();

//kapag abstratc class pwednge gawa na yung methid tas iooverride na lang
//pag templating ang usapan, inheritance ang ilaban
}