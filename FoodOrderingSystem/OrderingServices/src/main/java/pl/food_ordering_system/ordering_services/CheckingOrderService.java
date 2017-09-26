package pl.food_ordering_system.ordering_services;


import pl.food_ordering_system.menus.MainMenu;
import pl.food_ordering_system.walletDAO.WalletDAO;

public class CheckingOrderService 
{
	/*
	 * Checks your order and prints bill to pay
	 */
	public void startCheckingService(WalletDAO wallet) 
	{
		Integer walletSize = wallet.walletSize();
		// If wallet is empty
		if(walletSize.equals(0)) 
		{
			System.out.println("You haven't ordered anything yet");
		}
		// Bill to pay based on wallet status
		else 
		{
			wallet.billToPay();
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
