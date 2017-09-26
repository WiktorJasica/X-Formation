package pl.food_ordering_system.ordering_services;

import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Scanner;

import pl.food_ordering_system.italian_cuisine.LasagnaDish;
import pl.food_ordering_system.italian_cuisine.OssobucoDish;
import pl.food_ordering_system.italian_cuisine.SpaghetiCarbonaraDish;
import pl.food_ordering_system.walletDAO.WalletDAO;

public class ItalianCuisineService {
	/*
	 * Supports Italian Cuisine ordering. Selects correct input from keyboard.
	 * According to user choice finalize order (adds to the wallet).
	 */
	public void startItalianCuisineService(WalletDAO wallet, String italianChoice) {

		// Closes this input stream and releases any system resources associated with the stream
		Scanner scanner = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() throws IOException {
			}
		});

		// Loop responsible for Italian Dish choice
		while (!italianChoice.equals("4")) {

			switch (italianChoice) {
			// Spaghetti Carbonara choice
			case "1": {
				SpaghetiCarbonaraDish spaghetiCarbonaraDish = new SpaghetiCarbonaraDish();
				wallet.addOrder(spaghetiCarbonaraDish);
				System.out.println("\n" + "Thank you very much, you have ordered: Spaghetti Carbonara ");
				System.out.println("If you want to order a dessert, please select option nr 4");
				italianChoice = "4";

			}
				break;
			// Lasagna choice
			case "2": {
				LasagnaDish lasagnaDish = new LasagnaDish();
				wallet.addOrder(lasagnaDish);
				System.out.println("\n" + "Thank you very much, you have ordered: Lasagna ");
				System.out.println("If you want to order a dessert, please select option nr 4");
				italianChoice = "4";
			}
				break;
			// Ossobuco choice
			case "3": {
				OssobucoDish ossobucoDish = new OssobucoDish();
				wallet.addOrder(ossobucoDish);
				System.out.println("\n" + "Thank you very much, you have ordered: Ossobuco  ");
				System.out.println("If you want to order a dessert, please select option nr 4");
				italianChoice = "4";
			}
				break;
			// Wrong choice
			default: {
				System.out.println("Your choice is incorrect, please try again");
				System.out.println("You have to choose one of the numbers from menu");
				System.out.print("Select the number and press Enter: ");
				italianChoice = scanner.next();
			}
				break;
			}// end of switch
		} // end of while
		scanner.close();
	}// end of startItalianCuisineService
}// end of ItalianCuisineService
