package telran.view.test;

import telran.view.ConsoleInputOutput;
import telran.view.DateOperationsMenu;
import telran.view.Item;
import telran.view.Menu;
import telran.view.NumbersOperationsMenu;

public class CalculatorTest {
	static NumbersOperationsMenu num = new NumbersOperationsMenu();
	static DateOperationsMenu dat = new DateOperationsMenu();

	public static void main(String[] args) {
		Menu menu = new Menu("Calculator", getItems());
		menu.perform(new ConsoleInputOutput());
	}

	private static Item[] getItems() {
		Item[] res = { new Menu("Calculate numbers", num.getNumbersOperationsMenu()),
			new Menu("Calculate period of dates", dat.getDateOperationsMenu()), Item.exit() };
		return res;
	}

}
