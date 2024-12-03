package org.acumen.training.codes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class ExceptionType {

	private static int[] arrData;

	public static void main(String[] args) {
		// unchecked exceptions or runtime exceptions - sa runtime sila lumalabas

		try {
			int sum = add(10, -5);
		} catch (NegativeOperandExeption e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			setArrayData(arrData, 0, 100);

		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		try {
			double[] grades = new double[0];
			grades[0] = 98.5; // ArrayIndexOutOfBoundsException

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		try {
			Scanner scanner = new Scanner(System.in);
			System.err.println("Enter age: ");
			scanner.nextInt();
			scanner.close(); // InputMismatchException
		} catch (IncompatibleClassChangeError e) {
			System.out.println(e.getMessage());
		}

		// using rethrowing - throws then yung exception dun sa ginawang throw class may
		// try catch din
		try {
			inputAge();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// checked exceptions - alam na nya yung results so may try catch na irereco si
		// compiler
		try { // not if, gives you performance glitch, pasok mo rito para safe
			FileOutputStream fos = new FileOutputStream("");
			fos.close();
		} catch (FileNotFoundException e) { // this is for recovery, kung anong lalagay mo rito gagawin kapag may error
											// ka sa try
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// five ways in try catch
		// using simple or single exceptions
		// using hierarchy
		// using union catch
	}
	// throwing and rethrowing for risky methods
	// step 1. apply modular programming
	// 2. validate the error using if-condition or try catch kapag wala namang
	// siguradong magiging mali

	public static void setArrayData(int[] arrLocal, int index, int value)
			throws NullPointerException, ExecutionException {
		if (arrLocal == null) {
			throw new NullPointerException();
		}
		arrLocal[0] = value;
		System.out.println(Arrays.toString(arrLocal));
		// 3. declare/register the thrown or raies exception clasee/es in the method
	}

	public static void inputAge() throws InputMismatchException, Exception {
		//using finally keyword
		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter age: ");
		try {
			int age = scanner.nextInt();
			System.out.println(age);
		} catch (IncompatibleClassChangeError e) {
			throw e;
		}

	}

	public static int add(int x, int y) throws NegativeOperandExeption, Exception {
		if (x < 0 || y < 0) {
			throw new NegativeOperandExeption();
		}
		return x + y;
	}

}


// Best practice
// 1. always  create/use context-based messages
// 2. do not leave catch empty
// 3. do not call return in catch (invalidate)
// 4. do not catch throwable
// 5. do not catch error, let them be
// 6. do not log before throw new
// 7. for closeable API classes, use try-with-resource or finally 