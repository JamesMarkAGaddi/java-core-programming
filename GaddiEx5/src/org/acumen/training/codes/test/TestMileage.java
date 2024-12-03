package org.acumen.training.codes.test;

import java.io.IOException;

import org.acumen.training.codes.Mileage;

public class TestMileage {

	public static void main(String[] args) {
		Mileage mileage = new Mileage();
		mileage.getForm();
		
		try {
			System.in.skip(System.in.available());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
