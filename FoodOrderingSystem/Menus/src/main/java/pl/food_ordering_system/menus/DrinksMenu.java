package pl.food_ordering_system.menus;

/*
 * Printing "Drinks Menu" class
 */
public class DrinksMenu {
	/*
	 * Method that prints "Drinks Menu" on the screen
	 */
	public static void printDrinksMenu() {
		System.out.println();
		System.out.println("Please select the type of drink");
		System.out.println("-------------------------------");
		System.out.println("1) Orange Juice            8 zł");
		System.out.println("2) Cola                    6 zł");
		System.out.println("3) Water                   5 zł");
		System.out.println("4) Drink Extras Menu");
		System.out.println("5) Back to Main Menu");
		System.out.println("-------------------------------");
		System.out.print("Select the number and press Enter: ");
	}

}
