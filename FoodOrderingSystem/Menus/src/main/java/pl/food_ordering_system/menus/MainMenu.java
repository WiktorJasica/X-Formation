package pl.food_ordering_system.menus;

/*
 * Printing "Main Menu" class
 */
public class MainMenu {
	/*
	 * Method that prints "Main Menu" on the screen
	 */
	public static void printMainMenu() {
		System.out.println("\n" + "--------------------------------------------------------");
		System.out.println("Please select one of the following options from our menu");
		System.out.println("1) Lunches");
		System.out.println("2) Drinks");
		System.out.println("3) Check your order");
		System.out.println("4) Cancel your order");
		System.out.println("5) Payment");
		System.out.println("6) Exit ordering system");
		System.out.println("--------------------------------------------------------");
		System.out.print("Select the number and press Enter: ");
	}
}
