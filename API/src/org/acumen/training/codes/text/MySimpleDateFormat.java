package org.acumen.training.codes.text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class MySimpleDateFormat {

	public static void main(String[] args) {

		Calendar xmas = new GregorianCalendar();
		xmas.set(2024, 11, 25);
		xmas.setTimeZone(TimeZone.getTimeZone("Asia/Manila"));

		Date xmasDate = xmas.getTime();
		System.out.println(xmasDate);

		SimpleDateFormat sdf = new SimpleDateFormat(); // instantiate
		String xmasDatefm = sdf.format(xmasDate);
		System.out.println(xmasDatefm); // nakashort ang defaut style neto

		SimpleDateFormat sdf1 = new SimpleDateFormat("MMMM dd, yyyy h:M:S.SSS a"); // instantiate
		String xmasDatefmt = sdf1.format(xmasDate);
		System.out.println(xmasDatefmt); // December 25, 2024 2:12:385.385 PM

		/*
		 * 
		 * SimpleDateFormat sdf1 = new SimpleDateFormat("'THis is a text need ng single quote para mabasa' MMMM dd, yyyy h:M:S.SSS a");
		 * //instantiate String xmasDatefmt = sdf1.format(xmasDate);
		 * System.out.println(xmasDatefmt); // December 25, 2024 2:12:385.385 PM
		 * 
		 * SimpleDateFormat sdf1 = new SimpleDateFormat("MMMM dd, yyyy"); //kapag MMMM
		 * buong name , MM digit lang String xmasDatefmt = sdf1.format(xmasDate);
		 * System.out.println(xmasDatefmt);
		 * 
		 * SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm"); //HH 24-HOUR FORMAT,
		 * hh:mm a(a for am/pm) - 12-hour format String xmasDatefmt =
		 * sdf1.format(xmasDate); System.out.println(xmasDatefmt);
		 * 
		 */
		
		//input masking
		String birthdayFormData = "May 10, 2001 10:33";
		//gagawing birthday using Date method
		SimpleDateFormat inputMarkStyle = new SimpleDateFormat("MMMM d, yyyy hh:mm");
		try {
			Date birthday = inputMarkStyle.parse(birthdayFormData);
			System.out.println(birthday);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
