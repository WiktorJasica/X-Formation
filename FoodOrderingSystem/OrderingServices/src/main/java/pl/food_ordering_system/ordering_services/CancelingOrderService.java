package pl.food_ordering_system.ordering_services;

import pl.food_ordering_system.menus.MainMenu;
import pl.food_ordering_system.walletDAO.WalletDAO;

public class CancelingOrderService 
{
	/*
	 * Removes all the orders from the bill 
	 */
	public void startCancelingService(WalletDAO wallet) 
	{
		Integer walletSize = wallet.walletSize();
		// If wallet is empty
		if(walletSize.equals(0)) 
		{
			System.out.println("You haven't ordered anything yet");
		}
		// Clearing wallet
		else 
		{
			wallet.clearWallet();
			System.out.println("You have canceled your order");
		}
		MainMenu.printMainMenu();
	}
}
