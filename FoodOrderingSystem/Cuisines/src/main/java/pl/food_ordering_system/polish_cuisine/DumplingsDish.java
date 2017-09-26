package pl.food_ordering_system.polish_cuisine;

import pl.food_ordering_system.domain.ThingsToOrder;

/*
 * Class that defines object "Dumplings with meat Dish"
 */
public class DumplingsDish extends ThingsToOrder {

	/*
	 * Fields that contain "name" and "price" of the dish
	 */
	private String name;
	private double price;

	/*
	 * Constructor - assigning values to the fields
	 */
	public DumplingsDish() {
		this.name = "Dumplings with meat";
		this.price = 16.00;
	}

	/*
	 * Getters
	 */
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}
