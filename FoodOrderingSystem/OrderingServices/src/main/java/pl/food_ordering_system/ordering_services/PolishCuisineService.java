package pl.food_ordering_system.ordering_services;

import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Scanner;
import pl.food_ordering_system.polish_cuisine.DumplingsDish;
import pl.food_ordering_system.polish_cuisine.PorkChopDish;
import pl.food_ordering_system.polish_cuisine.PotatoPancakesDish;
import pl.food_ordering_system.walletDAO.WalletDAO;

public class PolishCuisineService {
	/*
	 * Supports Polish Cuisine ordering.
	 * Selects correct input from keyboard.
	 * According to user choice finalize order (adds to the wallet).
	 */
	public void startPolishCuisineService(WalletDAO wallet, String polishChoice) 
	{
		// Closes this input stream and releases any system resources associated with the stream
		Scanner scanner = new Scanner(new FilterInputStream(System.in) {
		    @Override
		    public void close() throws IOException {
		    }
		});
		
		// Loop responsible for Polish Dish choice
		while(!polishChoice.equals("4"))
		{
						
			switch(polishChoice) 
				{
				// Pork chop with cabbage choice
				case "1":
					{
						PorkChopDish porkChopDish = new PorkChopDish();
						wallet.addOrder(porkChopDish);
						System.out.println("\n" + "Thank you very much, you have ordered: Pork chop with cabbage");
						System.out.println("If you want to order a dessert, please select option nr 4");	
						polishChoice="4";
						
					}break;
				// Dumplings with meat choice
				case "2": 
					{
						DumplingsDish dumplingsDish = new DumplingsDish();
						wallet.addOrder(dumplingsDish);
						System.out.println("\n" + "Thank you very much, you have ordered: Dumplings with meat");
						System.out.println("If you want to order a dessert, please select option nr 4");
						polishChoice="4";
					}break;
				// Potato pancakes choice
				case "3": 
					{
						PotatoPancakesDish potatoPancakesDish = new PotatoPancakesDish();
						wallet.addOrder(potatoPancakesDish);
						System.out.println("\n" + "Thank you very much, you have ordered: Potato pancakes ");
						System.out.println("If you want to order a dessert, please select option nr 4");
						polishChoice="4";
					}break;
				// Wrong choice				
				default: 
					{
						System.out.println("Your choice is incorrect, please try again");
						System.out.println("You have to choose one of the numbers from menu");
						System.out.print("Select the number and press Enter: ");
						polishChoice=scanner.next();
					}break;
				}// end of switch
		}//end of while
		scanner.close();
	}
}
