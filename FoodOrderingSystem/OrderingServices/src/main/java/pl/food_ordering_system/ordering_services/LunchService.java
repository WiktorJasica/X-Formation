package pl.food_ordering_system.ordering_services;

import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Scanner;

import pl.food_ordering_system.menus.DessertMenu;
import pl.food_ordering_system.menus.ItalianMenu;
import pl.food_ordering_system.menus.LunchMenu;
import pl.food_ordering_system.menus.MainMenu;
import pl.food_ordering_system.menus.MexicanMenu;
import pl.food_ordering_system.menus.PolishMenu;
import pl.food_ordering_system.walletDAO.WalletDAO;

public class LunchService {
	/*
	 * Supports the choice of Lunch and Dessert. Selects correct input from
	 * keyboard. Initializes support of Cuisines and Dessert ordering.
	 */
	public void startLunchService(WalletDAO wallet) {
		LunchMenu.printLunchMenu();
		String choice = new String();

		// Closes this input stream and releases any system resources associated with the stream
		Scanner scanner = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() throws IOException {
			}
		});

		// Loop responsible for initializing Cuisine or Dessert ordering
		while (!choice.equals("5")) {
			choice = scanner.next();

			switch (choice) {
			// Choice that initializes Polish Cuisine Service
			case "1": {
				PolishMenu.printPolishMenu();
				String polishChoice = scanner.next();
				PolishCuisineService polishCuisineService = new PolishCuisineService();
				polishCuisineService.startPolishCuisineService(wallet, polishChoice);
				LunchMenu.printLunchMenu();
			}
				break;
			// Choice that initializes Mexican Cuisine Service
			case "2": {
				MexicanMenu.printMexicanMenu();
				String mexicanChoice = scanner.next();
				MexicanCuisineService mexicanCuisineService = new MexicanCuisineService();
				mexicanCuisineService.startMexicanCuisineService(wallet, mexicanChoice);
				LunchMenu.printLunchMenu();

			}
				break;
			// Choice that initializes Italian Cuisine Service
			case "3": {
				ItalianMenu.printItalianMenu();
				String italianChoice = scanner.next();
				ItalianCuisineService mexicanCuisineService = new ItalianCuisineService();
				mexicanCuisineService.startItalianCuisineService(wallet, italianChoice);
				LunchMenu.printLunchMenu();
			}
				break;
			// Choice that initializes Dessert Service
			case "4": {
				DessertMenu.printDessertMenu();
				String dessertChoice = scanner.next();
				DessertService dessertService = new DessertService();
				dessertService.startDessertService(wallet, dessertChoice);
				LunchMenu.printLunchMenu();

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
	}// end of startLunchService
}// end of Lunch/service
