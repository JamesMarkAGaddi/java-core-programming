package org.acumen.training.codes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Sleep {

	public static final int HOURS_PER_DAY = 8;

	public void inputDates() {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter your birthdate: ");
			String birthDate = scanner.nextLine();
			System.out.println("Enter today's date: ");
			String todayDate = scanner.nextLine();
			convertDates(birthDate, todayDate);
		}

	}

	private static void convertDates(String birthDate, String dateToday) {

		SimpleDateFormat inputDateFormat = new SimpleDateFormat("MMMM d, yyyy");
		ZoneId zid = ZoneId.of("Asia/Manila");

		try {
			Date bday = inputDateFormat.parse(birthDate);
			Date today = inputDateFormat.parse(dateToday);

			LocalDate bdayLocalDate = bday.toInstant().atZone(zid).toLocalDate();
			LocalDate todayLocalDate = today.toInstant().atZone(zid).toLocalDate();

			long totalDays = ChronoUnit.DAYS.between(bdayLocalDate, todayLocalDate);
			computeSleepDuration(totalDays);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private static void computeSleepDuration(long totalDays) {

		long totalHours = totalDays * HOURS_PER_DAY;
		printTotalHours(totalHours);
	}

	private static void printTotalHours(long totalHours) {

		System.out.println("You have slept approximately %d hours in your life.".formatted(totalHours));

	}

}
