package pl.food_ordering_system.ordering_services;

import pl.food_ordering_system.menus.MainMenu;
import pl.food_ordering_system.walletDAO.WalletDAO;

public class PaymentService 
{
	/*
	 * Finalizes user's order.
	 */
	public void startPaymentService(WalletDAO wallet) 
	{
		Integer walletSize = wallet.walletSize();
		// if wallet is empty 
		if(walletSize.equals(0)) 
		{
			System.out.println("You haven't ordered anything yet");
		}
		// Finalizes payment
		else 
		{
			double payment = wallet.billToPay();
			System.out.println();
			System.out.println("you have payed: "+payment);
			wallet.clearWallet();
			// Freezes the command-line for 2s
			try 
			{
				Thread.sleep(2000);
			}
			catch(Exception e) {}
		}
		MainMenu.printMainMenu();
	}
	
}
