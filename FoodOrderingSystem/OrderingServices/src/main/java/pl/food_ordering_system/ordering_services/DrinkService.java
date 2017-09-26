package pl.food_ordering_system.ordering_services;

import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Scanner;

import pl.food_ordering_system.drinks.ColaDrink;
import pl.food_ordering_system.drinks.OrangeJuiceDrink;
import pl.food_ordering_system.drinks.WaterDrink;
import pl.food_ordering_system.menus.DrinkExtrasMenu;
import pl.food_ordering_system.menus.DrinksMenu;
import pl.food_ordering_system.menus.MainMenu;
import pl.food_ordering_system.walletDAO.WalletDAO;

public class DrinkService {
	/*
	 * Supports Drinks ordering. Selects correct input from keyboard. According to
	 * user choice finalize order (adds to the wallet). Initializes support of
	 * Drinks Extras ordering
	 */
	public void startDrinkService(WalletDAO wallet) {

		DrinksMenu.printDrinksMenu();
		String choice = new String();

		// Closes this input stream and releases any system resources associated with the stream
		Scanner scanner = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() throws IOException {
			}
		});

		// Loop responsible for Drink choice or initialize Drink Extras ordering
		while (!choice.equals("5")) {

			choice = scanner.next();
			switch (choice) {

			// Orange Juice choice
			case "1": {
				OrangeJuiceDrink orangeJuiceDrink = new OrangeJuiceDrink();
				wallet.addOrder(orangeJuiceDrink);
				System.out.println("\n" + "Thank you very much, you have ordered: Orange Juice");
				System.out.println("If you want to order an extras to your drink, please select option nr 4");
				DrinksMenu.printDrinksMenu();

			}
				break;
			// Cola choice
			case "2": {
				ColaDrink colaDrink = new ColaDrink();
				wallet.addOrder(colaDrink);
				System.out.println("\n" + "Thank you very much, you have ordered: Cola");
				System.out.println("If you want to order an extras to your drink, please select option nr 4");
				DrinksMenu.printDrinksMenu();

			}
				break;
			// Water choice
			case "3": {
				WaterDrink waterDrink = new WaterDrink();
				wallet.addOrder(waterDrink);
				System.out.println("\n" + "Thank you very much, you have ordered: Water");
				System.out.println("If you want to order an extras to your drink, please select option nr 4");
				DrinksMenu.printDrinksMenu();

			}
				break;
			// Choice that initializes Drink Extras Service
			case "4": {
				String extrasChoice = new String();

				while (!extrasChoice.equals("4")) {
					DrinkExtrasMenu.printDrinkExtrasMenu();
					extrasChoice = scanner.next();
					DrinkExtrasService drinkExtrasService = new DrinkExtrasService();
					drinkExtrasService.startDrinkExtrasService(wallet, extrasChoice);
				}
				DrinksMenu.printDrinksMenu();
			}
				break;
			// Back to MainMenu
			case "5": {
				MainMenu.printMainMenu();
			}
				break;
			// Wrong choice
			default: {
				System.out.println("Your choice is incorrect, please try again");
				System.out.println("You have to choose one of the numbers from menu");
				System.out.print("Select the number and press Enter: ");
			}
				break;
			}// end of switch
		} // end of while
		scanner.close();
	}// end of startDrinkService
}// end of DrinkService
