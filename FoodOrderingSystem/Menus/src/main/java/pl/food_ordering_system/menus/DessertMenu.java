package pl.food_ordering_system.menus;

/*
 * Printing "Dessert Menu" class
 */
public class DessertMenu {
	/*
	 * Method that prints "Dessert Menu" on the screen
	 */
	public static void printDessertMenu() {
		System.out.println();
		System.out.println("Please select the type of dessert");
		System.out.println("---------------------------------");
		System.out.println("1) Vanilla ice cream         10 zł");
		System.out.println("2) Tiramisu                 15 zł");
		System.out.println("3) Doughnut                  5 zł");
		System.out.println("4) Back to Lunch Menu");
		System.out.println("---------------------------------");
		System.out.print("Select the number and press Enter:");
	}
}
