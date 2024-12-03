package org.acumen.training.codes.io;
//kunwari wala pang databse pwede to gamitin

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MySerialization {

	public static void main(String[] args) {

		Employee e1, e2;
		
		e1= new Employee();
		e1.fName = "Juan";
		e1.lName = "Luna";
		e1.id = "101";

		e2 = new Employee();
		e2.fName = "Maria";
		e2.lName = "Clara";
		e2.id = "102";

		FileOutputStream fos;
		try {
			fos = new FileOutputStream(new File("./src/files/employees.db"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(e1);
			oos.writeObject(e2);

			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		FileInputStream fis;
		try {
			fis = new FileInputStream(new File("./src/files/employees.db"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			try {
				Employee temp = (Employee) ois.readObject();
				while (!(temp == null)) {
					System.out.println("%s %s %s".formatted(temp.id, temp.fName, temp.lName));
					temp = (Employee) ois.readObject();
				}
			} catch (Exception e) {
			}
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
