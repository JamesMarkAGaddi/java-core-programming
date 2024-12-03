package org.acumen.training.codes.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class MyTemporal {

	public static void main(String[] args) {

		// old date
		Date now = new Date();
		System.out.println(now); // default is 24 hours

		long before = System.currentTimeMillis();
		System.out.println(before); // decoded date
		Date beforeDate = new Date(before);
		System.out.println(beforeDate);

		// Calendar
		Calendar xmas = new GregorianCalendar(); // use this for a fair and precise calendar since it is independent
													// from the hardware

		// method for creation
		xmas.set(2024, 11, 25);
		TimeZone tz = TimeZone.getTimeZone("Asia/Manila");
		xmas.setTimeZone(tz);
		xmas.setLenient(true);
		System.out.println(xmas);

		Calendar now2 = new GregorianCalendar();
		now2.setLenient(true);
		now2.set(2024, 8, 27, 14, 45, 44);
		xmas.setTimeZone(tz);
		System.out.println(now2);

		System.out.println(now2.get(Calendar.YEAR));
		System.out.println(now2.get(Calendar.MONTH));
		System.out.println(now2.get(Calendar.DATE));
		System.out.println(now2.get(Calendar.DAY_OF_WEEK));
		System.out.println(now2.getFirstDayOfWeek());
		System.out.println(now2.getTimeZone());

		now2.set(Calendar.DATE, 28);
		System.out.println(now2);
		now2.set(Calendar.DATE, 10);
		now2.set(Calendar.YEAR, 2025);
		System.out.println(now2);

		// calendar operations
		//minus opeations or deductions in CAlendar object
		now2.add(Calendar.YEAR, -1);
		System.out.println(now2);
		now2.add(Calendar.DATE, 17);
		System.out.println(now2);

		now2.roll(Calendar.DATE, 17);
		System.out.println(now2);
		now2.roll(Calendar.MONTH, 10);
		System.out.println(now2);
		
		Calendar bday = new GregorianCalendar(2001, 2, 15, 0, 30, 100);
		bday.setLenient(true);
		bday.setTimeZone(tz);
		
		System.out.println(bday.equals(now2));
		System.out.println(bday.compareTo(now2) == 1);
		System.out.println(bday.before(now2));
		System.out.println(bday.after(now2));
		
		
	}

}
