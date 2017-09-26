package pl.food_ordering_system.menus;

/*
 * Printing "Lunch Menu" class
 */
public class LunchMenu {
	/*
	 * Method that prints "Lunch Menu" on the screen
	 */
	public static void printLunchMenu() {
		System.out.println();
		System.out.println("Please select the type of cuisines");
		System.out.println("----------------------------------");
		System.out.println("1) Polish");
		System.out.println("2) Mexican");
		System.out.println("3) Italian");
		System.out.println("4) Dessert");
		System.out.println("5) Back to Main Menu");
		System.out.println("----------------------------------");
		System.out.print("Select the number and press Enter: ");
	}
}
