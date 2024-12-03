package org.acumen.training.codes.time;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.ValueRange;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class MyHumanTime { //better than calendar kasi yung readable by humana ang time
	// date time na model oriented or databae riented
	public static void main(String[] args) {

		// pag gusto lang na date lang
		// factory method used to create an object for static final like this.
		// pag final di pwede instantiate like LocaLDate d = new LOcalDate();
		LocalDate ld = LocalDate.now();
		System.out.println(ld);

		// pag time in time out
		LocalTime lt = LocalTime.now(); // 24-hr format
		System.out.println(lt);

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		// data and time using timezone
		ZoneId zid = ZoneId.of("Asia/Manila");
		ZonedDateTime zdt = ZonedDateTime.now(zid);
		System.out.println(zdt);

		// local date using of() method
		LocalDate newYear = LocalDate.of(2025, 1, 25);
		System.out.println(newYear);

		// input masking capability
		// ex:
		String BdayFormat = "2001-10-15";
		LocalDate bday = LocalDate.parse(BdayFormat);
		System.out.println(bday.toString());

		String timeFormat = "08:30:55.999";
		LocalTime time = LocalTime.parse(timeFormat);
		System.out.println(time.toString());

		// Getter is a method in java used to retrieve the value of the data members or
		// variables
		// Setter is a method in java used to update or set the value of the data
		// members or variables.

		// Operations
		// Enum - a special "class" that represents a group of constants

		System.out.println(ld.get(ChronoField.DAY_OF_MONTH));
		System.out.println(ld.get(ChronoField.MONTH_OF_YEAR));
		Month month = ld.getMonth();
		System.out.println(month.name()); // name or toString
		System.out.println(month.getValue());
		System.out.println(ld.getYear());
		DayOfWeek weekName = ld.getDayOfWeek();
		System.out.println(weekName.toString());
		System.out.println(weekName.getValue());

		// Modify date fields
		// kapag gusto mo na mag-edit ng date,
		// pero need ng pointer para mapalitan yung dating object kasi immutable na and
		// Date object
		// we dont use set here, we use with
		ld = ld.withYear(2025);
		System.out.println(ld);

		ld = ld.withMonth(10);
		System.out.println(ld);

		ld = ld.with(ChronoField.DAY_OF_WEEK, 5); // generic setting

		ld = ld.plusDays(10);
		System.out.println(ld);

		ld = ld.minusDays(10);
		System.out.println(ld);

		// bulk change or bulk update
		// updating maramihan
		Period period = Period.of(1, 5, 10);
		ld = ld.plus(period);
		System.out.format("Customer magbayad ka na on %s", ld);
		System.out.println();

		// Leap year
		System.out.println(ld.isLeapYear());

		LocalDate deadline = LocalDate.parse("2027-05-15");
		Period deadlinePeriod = ld.until(deadline);
		System.out.format("%d %d %d", deadlinePeriod.getYears(), deadlinePeriod.getMonths(), deadlinePeriod.getDays());
		System.out.println();

		LocalDate today = LocalDate.now();
		Period bdayPeriod = bday.until(today);
		System.out.format("%d %d %d", bdayPeriod.getYears(), bdayPeriod.getMonths(), bdayPeriod.getDays());
		System.out.println();

		// ChronoUnit lang gamit kapag maliliit lang na value or specific
		long ageInYears = bday.until(today, ChronoUnit.YEARS);
		System.out.println(ageInYears);

		System.out.println(bday.isBefore(today));
		System.out.println(bday.compareTo(today));

		// computation range details of the year, monthm day or the month per localdate
		LocalDate febMonth = LocalDate.parse("2020-02-15");

		ValueRange yearRange = febMonth.range(ChronoField.MONTH_OF_YEAR);
		ValueRange dayRange = febMonth.range(ChronoField.DAY_OF_MONTH);
		System.out.println(yearRange);
		System.out.println(dayRange);

		if (dayRange.getMaximum() == 29) {
			System.out.println("It's a leap year");
		}

		// chronounit sa difference sya or sa until lang, si chronofield mas maraming
		// ginagawa, pwede sya mag fetch ganun

		//

		System.out.println(lt);
		lt.with(ChronoField.MILLI_OF_SECOND, 50);
		System.out.println(lt);

		System.out.format("%s \n %s \n %s \n", lt.getHour(), lt.getMinute(), lt.getSecond(), lt.getNano());
		System.out.println(lt.get(ChronoField.MILLI_OF_SECOND));

		// kapag immutable need ng tagasalo in this cae yung new lt ang tagasalo
		lt = lt.withHour(13);
		System.out.println(lt);

		// operations sa time
		lt = lt.plusHours(5);
		System.out.println(lt);
		lt = lt.plus(100, ChronoUnit.MILLIS);
		System.out.println(lt);
		lt = lt.minusHours(5);
		System.out.println(lt);
		
		System.out.println();
		Duration periodTime = Duration.ofHours(100); // parang plus hours lang din
		lt = lt.plus(periodTime);
		System.out.println(lt);

		LocalTime timeInData = LocalTime.of(8, 15);
		LocalTime timeOutData = LocalTime.of(17, 0);
		
		long totalMin = timeInData.until(timeOutData, ChronoUnit.MINUTES);
		System.out.println(totalMin);
		
		long totalMin2 = Duration.between(timeInData, timeOutData).toMinutes();
		System.out.println(totalMin2);
		
		//conversion from util to human time

		TimeZone tz = TimeZone.getTimeZone("Asia/Manila");
		Calendar bday2 = new GregorianCalendar(2001, 2, 15, 0, 30, 100);
		bday2.setLenient(true);
		bday2.setTimeZone(tz);
		
		ZonedDateTime bdayHumanTime = bday2.toInstant().atZone(zid);
		System.out.println(bdayHumanTime);
		
		//reverse naman, human time to calendar
		Calendar calBday = GregorianCalendar.from(bdayHumanTime);
		System.out.println(calBday);
}
}
