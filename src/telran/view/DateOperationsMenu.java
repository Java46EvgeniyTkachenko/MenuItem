package telran.view;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateOperationsMenu {

	Menu menu = new Menu("", getDateOperationsMenu());

	public static Item[] getDateOperationsMenu() {
		Item[] res = { Item.of("Add days", DateOperationsMenu::addDays),
				Item.of("Subtract days", DateOperationsMenu::subtractDays),
				Item.of("Between days", DateOperationsMenu::betweenDays),
				Item.of("Age according to the birthdate", DateOperationsMenu::birthDateAge), Item.exit() };

		return res;
	}

	static void addDays(InputOutput io) {
		String pattern = "yyyy-MM-dd";
		LocalDate date = io.readDate("Enter date in formate " + pattern, pattern);
		Integer days = io.readInt("Enter number of days for add", "no number");
		io.writeLine(date.plusDays(days));
	}

	static void subtractDays(InputOutput io) {
		String pattern = "yyyy-MM-dd";
		LocalDate date = io.readDate("Enter date in formate " + pattern, pattern);
		Integer days = io.readInt("Enter number of days for subtract ", "no number");
		io.writeLine(date.minusDays(days));
	}

	static void betweenDays(InputOutput io) {
		String pattern = "yyyy-MM-dd";
		LocalDate from = io.readDate("Enter start date in formate " + pattern, pattern);
		LocalDate to = io.readDate("Enter finish date in formate " + pattern, pattern);
		io.writeLine(Math.abs((int) ChronoUnit.DAYS.between(from, to)));
	}

	static void birthDateAge(InputOutput io) {
		String pattern = "yyyy-MM-dd";
		LocalDate from = io.readDate("Enter birthdate in formate " + pattern, pattern);
		LocalDate to = LocalDate.now();
		io.writeLine(Math.abs((int) ChronoUnit.YEARS.between(from, to)));

	}

}
