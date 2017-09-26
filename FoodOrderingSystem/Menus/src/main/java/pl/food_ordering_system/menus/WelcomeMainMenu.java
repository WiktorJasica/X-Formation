package pl.food_ordering_system.menus;

/*
 * Printing "First Main Menu" class
 */
public class WelcomeMainMenu {
	/*
	 * Method that prints on the screen first "Main Menu" with greetings
	 */
	public static void printWelcomeMainMenu() {
		System.out.println("Welcome to our restaurant");
		System.out.println("--------------------------------------------------------" + "\n");
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
