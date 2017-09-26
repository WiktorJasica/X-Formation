package pl.food_ordering_system.walletDAO;

import java.util.ArrayList;
import pl.food_ordering_system.domain.ThingsToOrder;

/*
 * Data access object: access to the ordered drinks and dishes stored in ArrayList
 */
public class WalletDAO {
	/*
	 * Container with ordered drinks and dishes
	 */
	private ArrayList<ThingsToOrder> wallet = new ArrayList<ThingsToOrder>();

	/*
	 * Method adds drinks and dishes to the bill
	 */
	public void addOrder(ThingsToOrder order) {
		this.wallet.add(order);
	}

	/*
	 * Method returns number of ordered drinks and dishes
	 */
	public int walletSize() {
		int size = 0;
		size = wallet.size();
		return size;
	}

	/*
	 * Method cancels the order
	 */
	public void clearWallet() {
		this.wallet.clear();
	}

	/*
	 * Method returns bill to pay and list of ordered drinks and dishes
	 */
	public double billToPay() {
		// Value of the bill
		double billToPay = 0.0;
		// Names and prices of the elements in the Container
		double tempWalletPrice;
		String tempWalletName;
		
		// Calculating and printing the bill
		System.out.println("You ordered: ");
		
		for (int i = 0; i < wallet.size(); i++) {
			tempWalletName = wallet.get(i).getName();
			tempWalletPrice = wallet.get(i).getPrice();
			billToPay += tempWalletPrice;

			System.out.println(i + 1 + ")" + " " + tempWalletName + ": " + tempWalletPrice + " " + "zł");
		}
		System.out.println("To pay: " + billToPay + " " + "zł");
		return billToPay;
	}
}
