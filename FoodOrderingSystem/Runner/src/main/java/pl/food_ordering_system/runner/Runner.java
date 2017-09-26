package pl.food_ordering_system.runner;

import java.util.Scanner;
import pl.food_ordering_system.menus.WelcomeMainMenu;
import pl.food_ordering_system.ordering_services.CancelingOrderService;
import pl.food_ordering_system.ordering_services.CheckingOrderService;
import pl.food_ordering_system.ordering_services.DrinkService;
import pl.food_ordering_system.ordering_services.LunchService;
import pl.food_ordering_system.ordering_services.PaymentService;
import pl.food_ordering_system.ordering_services.QuitAppService;
import pl.food_ordering_system.walletDAO.WalletDAO;

/*
 * Running Food Ordering System Application
 */
public class Runner {

	/*
	 * Running application method
	 * Selects correct input from keyboard.
	 * Initializes Services.
	 */
	public static void main(String[] args) {
		
		// Data access to ordered drinks and dishes
		WalletDAO wallet = new WalletDAO();
		// Choice from menu
		String choice = new String();
		// Input scanner 
		Scanner scanner = new Scanner(System.in);
		
		WelcomeMainMenu.printWelcomeMainMenu();

		// While loop for selecting options in Main Menu
		while (!choice.equals("6")) {
			
			// Input assignment
			choice = scanner.next();
			
			//Switch statement depends on input choice
			switch (choice) {
			// Choice that initializes Lunch Service 
			case "1": {
				LunchService lunchService = new LunchService();
				lunchService.startLunchService(wallet);
			}
				break;
			// Choice that initializes Drink Service 
			case "2": {
				DrinkService drinkService = new DrinkService();
				drinkService.startDrinkService(wallet);
			}
				break;
			// Choice that initializes Check Order Service 
			case "3": {
				CheckingOrderService checkingOrderService = new CheckingOrderService();
				checkingOrderService.startCheckingService(wallet);
			}
				break;
			// Choice that initializes Canceling Order Service 
			case "4": {
				CancelingOrderService cancelingOrderService = new CancelingOrderService();
				cancelingOrderService.startCancelingService(wallet);
			}
				break;
			// Choice that initializes Payment Service 
			case "5": {
				PaymentService paymentService = new PaymentService();
				paymentService.startPaymentService(wallet);
			}
				break;
			// Choice that initializes Quit Application Service 
			case "6": {
				scanner.close();
				QuitAppService quitAppService = new QuitAppService();
				quitAppService.quitAppService();

			}
				break;
			// Wrong input choice 
			default: {
				System.out.println("Your choice is incorrct, please try again");
			}
				break;
			} // end of switch
		} // end of while
	} // end of main
} // end of Runner
