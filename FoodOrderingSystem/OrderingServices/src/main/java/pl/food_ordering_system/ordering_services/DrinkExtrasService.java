package pl.food_ordering_system.ordering_services;

import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Scanner;

import pl.food_ordering_system.drink_extras.IceCubesExtras;
import pl.food_ordering_system.drink_extras.LemonExtras;
import pl.food_ordering_system.walletDAO.WalletDAO;

public class DrinkExtrasService {
	/*
	 * Supports Drink Extras ordering. Selects correct input from keyboard.
	 * According to user choice finalize order (adds to the wallet)
	 */
	public void startDrinkExtrasService(WalletDAO wallet, String extrasChoice) {

		// Closes this input stream and releases any system resources associated with the stream
		Scanner scanner = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() throws IOException {
			}
		});

		// Loop responsible for Drink Extras choice
		while (!extrasChoice.equals("4")) {

			switch (extrasChoice) {
			// Ice Cubes choice
			case "1": {
				IceCubesExtras iceCubesExtras = new IceCubesExtras();
				wallet.addOrder(iceCubesExtras);
				System.out.println("\n" + "Thank you very much, you have ordered: Ice Cubes");
				System.out.println("If you want to order another drink extras, please select option from menu");
				extrasChoice = "4";

			}
				break;
			// Lemon choice
			case "2": {
				LemonExtras lemonExtras = new LemonExtras();
				wallet.addOrder(lemonExtras);
				System.out.println("\n" + "Thank you very much, you have ordered: Lemon");
				System.out.println("If you want to order another drink extras, please select option from menu");
				extrasChoice = "4";
			}
				break;
			// Ice cubes and lemon
			case "3": {
				IceCubesExtras iceCubesExtras = new IceCubesExtras();
				LemonExtras lemonExtras = new LemonExtras();
				wallet.addOrder(iceCubesExtras);
				wallet.addOrder(lemonExtras);
				System.out.println("\n" + "Thank you very much, you have ordered: Ice cubes and lemon ");
				System.out.println("If you want to order another drink extras, please select option from menu");
				extrasChoice = "4";
			}
				break;
			// Wrong choice
			default: {
				System.out.println("Your choice is incorrect, please try again");
				System.out.println("You have to choose one of the numbers from menu");
				System.out.print("Select the number and press Enter: ");
				extrasChoice = scanner.next();
			}
				break;
			}// end of switch
		} // end of while
		scanner.close();
	}// end of startDrinkExtrasService
}// end of DrinkExtrasService
