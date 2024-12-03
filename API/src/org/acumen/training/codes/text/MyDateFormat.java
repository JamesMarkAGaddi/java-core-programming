package org.acumen.training.codes.text;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class MyDateFormat {
//Abstract class

	public static void main(String[] args) {

		Calendar xmas = new GregorianCalendar();
		xmas.set(2024, 11, 25);
		xmas.setTimeZone(TimeZone.getTimeZone("Asia/Manila"));

		Date xmasDate = xmas.getTime();
		System.out.println(xmasDate);
		
		DateFormat df1 = DateFormat.getInstance(); //factory method tawag pag ganto walang 'new'
		String xmasDatefmt = df1.format(xmasDate);
		System.out.println(xmasDatefmt); // 12/25/24, 1:52 PM

		DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM);
		String xmasDatefmt2 = df2.format(xmasDate);
		System.out.println(xmasDatefmt2); // December 25, 2024, 1:57:46 PM
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.SHORT);
		String xmasDatefmt3 = df3.format(xmasDate);
		System.out.println(xmasDatefmt3);
		
		DateFormat df4 = DateFormat.getTimeInstance(DateFormat.LONG);
		String xmasDatefmt4 = df4.format(xmasDate);
		System.out.println(xmasDatefmt4);
			
	}

}
