package pl.food_ordering_system.ordering_services;

import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Scanner;

import pl.food_ordering_system.dessert.DoughnutDessert;
import pl.food_ordering_system.dessert.TiramisuDessert;
import pl.food_ordering_system.dessert.VanillaIceCreamDessert;
import pl.food_ordering_system.walletDAO.WalletDAO;

public class DessertService {
	/*
	 * Supports Dessert ordering.
	 * Selects correct input from keyboard.
	 * According to user choice finalize order (adds to the wallet).
	 */
	public void startDessertService(WalletDAO wallet, String dessertChoice) {
		
		// Closes this input stream and releases any system resources associated with the stream
		Scanner scanner = new Scanner(new FilterInputStream(System.in) {
		    @Override
		    public void close() throws IOException {
		    }
		});
		// Loop responsible for dessert choice
		while (!dessertChoice.equals("4")) {

			switch (dessertChoice) {
			// Vanilla ice cream choice
			case "1": {
				VanillaIceCreamDessert vanillaIceCreamDessert = new VanillaIceCreamDessert();
				wallet.addOrder(vanillaIceCreamDessert);
				System.out.println("\n" + "Thank you very much, you have ordered: Vanilla ice cream ");
				dessertChoice = "4";

			}
				break;
			// Tiramisu choice
			case "2": {
				TiramisuDessert tiramisuDessert = new TiramisuDessert();
				wallet.addOrder(tiramisuDessert);
				System.out.println("\n" + "Thank you very much, you have ordered: Tiramisu   ");
				dessertChoice = "4";
			}
				break;
			// Doughnut choice
			case "3": {
				DoughnutDessert doughnutDessert = new DoughnutDessert();
				wallet.addOrder(doughnutDessert);
				System.out.println("\n" + "Thank you very much, you have ordered: Doughnut  ");
				dessertChoice = "4";
			}
				break;
			// Wrong choice
			default: {
				System.out.println("Your choice is incorrect, please try again");
				System.out.println("You have to choose one of the numbers from menu");
				System.out.print("Select the number and press Enter: ");
				dessertChoice = scanner.next();
			}
				break;
			}// end of switch
		} // end of while
		scanner.close();
		
	}// end of stratDessertService
}// end of DessertService
