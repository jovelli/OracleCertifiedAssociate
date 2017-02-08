import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeExamples {

	public static void main(String[] args) {
		DateTimeExamples dte = new DateTimeExamples();
		dte.dateExamples();
	}

	public void dateExamples() {
		LocalDate date = LocalDate.now();
		System.out.println("Date now [" + date + "]");

		LocalDate date2 = LocalDate.of(2016, 4, 13);
		System.out.println("Date2 [" + date2 + "]");

		date = date.minus(10, ChronoUnit.YEARS);
		date = date.plus(1, ChronoUnit.CENTURIES);

		LocalDate date3 = date;

		System.out.println("Date3 [" + date3.minusYears(1000) + "]");
		System.out.println("Date3 [" + date3 + "]");
		System.out.println("date3 == date [" + (date2 == date) + "]");

		System.out.println("date3.isBefore(date2) [" + date3.isBefore(date2) + "]");
		System.out.println("date3.isAfter(date2) [" + date3.isAfter(date2) + "]");

		System.out.println("date3.compareTo(date2) [" + date3.compareTo(date2) + "]");
	}

	public void timeExamples() {}

	public void DateTimeExamples() {}
}
