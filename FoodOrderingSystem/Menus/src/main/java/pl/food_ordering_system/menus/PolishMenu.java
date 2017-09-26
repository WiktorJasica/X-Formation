package pl.food_ordering_system.menus;

/*
 * Printing "Polish Cuisine Menu" class
 */
public class PolishMenu {
	/*
	 * Method that prints "Polish Cuisine Menu" on the screen
	 */
	public static void printPolishMenu() {
		System.out.println();
		System.out.println("Please select the type of meal");
		System.out.println("---------------------------------");
		System.out.println("1) Pork chop with cabbage   29 zł");
		System.out.println("2) Dumplings with meat      16 zł");
		System.out.println("3) Potato pancakes          20 zł");
		System.out.println("4) Back to Lunch Menu");
		System.out.println("-------------------------------");
		System.out.print("Select the number and press Enter: ");
	}
}
