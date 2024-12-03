package org.acumen.training.codes.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class MyProperties {

	public static void main(String[] args) {

		// create a file using Properties object
		Properties props = new Properties();
		props.setProperty("url", "jdbc:postgresql://localhost:5403/hrms");
		props.setProperty("username", "postgres");
		props.setProperty("password", "admin2255");
		System.out.println(props.toString());

		// output towards the file
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("./src/files/db.properties");
			props.store(fos, "My first Property file");
			fos.flush(); // clear cache
			fos.close();
			System.out.println("Created an INI file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Reading a prop file
		// from walang laman, lalagyan si emp
		// from ini file par amaretirve using their keys kasi dictionary ang output
		// setProperty
		Properties emp = new Properties();
		// input to the VM yung hinugot mo using load
		FileInputStream fis;
		try {
			fis = new FileInputStream("./src/files/db.properties");
			emp.load(fis);
			System.out.println(emp.getOrDefault("url","INVALID"));
			System.out.println(emp.getOrDefault("username","INVALID"));
			System.out.println(emp.getOrDefault("password","INVALID"));
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}