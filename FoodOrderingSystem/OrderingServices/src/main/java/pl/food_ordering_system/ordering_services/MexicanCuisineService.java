package pl.food_ordering_system.ordering_services;

import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Scanner;
import pl.food_ordering_system.mexican_cuisine.BarbacoaDish;
import pl.food_ordering_system.mexican_cuisine.CarneAsadaDish;
import pl.food_ordering_system.mexican_cuisine.ChorizoDish;
import pl.food_ordering_system.walletDAO.WalletDAO;

public class MexicanCuisineService {
	/*
	 * Supports Mexican Cuisine ordering. Selects correct input from keyboard.
	 * According to user choice finalize order (adds to the wallet).
	 */
	public void startMexicanCuisineService(WalletDAO wallet, String mexicanChoice) {
		
		// Closes this input stream and releases any system resources associated with the stream
		Scanner scanner = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() throws IOException {
			}
		});

		// Loop responsible for Mexican Dish choice
		while (!mexicanChoice.equals("4")) {

			switch (mexicanChoice) {
			// Carne asada choice
			case "1": {
				CarneAsadaDish carneAsadaDish = new CarneAsadaDish();
				wallet.addOrder(carneAsadaDish);
				System.out.println("\n" + "Thank you very much, you have ordered: Carne asada");
				System.out.println("If you want to order a dessert, please select option nr 4");
				mexicanChoice = "4";

			}
				break;
			// Chorizo choice
			case "2": {
				ChorizoDish chorizoDish = new ChorizoDish();
				wallet.addOrder(chorizoDish);
				System.out.println("\n" + "Thank you very much, you have ordered: Chorizo");
				System.out.println("If you want to order a dessert, please select option nr 4");
				mexicanChoice = "4";
			}
				break;
			// Barbacoa choice
			case "3": {
				BarbacoaDish barbacoaDish = new BarbacoaDish();
				wallet.addOrder(barbacoaDish);
				System.out.println("\n" + "Thank you very much, you have ordered: Barbacoa ");
				System.out.println("If you want to order a dessert, please select option nr 4");
				mexicanChoice = "4";
			}
				break;

			// Wrong choice
			default: {
				System.out.println("Your choice is incorrect, please try again");
				System.out.println("You have to choose one of the numbers from menu");
				System.out.print("Select the number and press Enter: ");
				mexicanChoice = scanner.next();
			}
				break;
			}// end of switch
		} // end of while
		scanner.close();
	}
}
