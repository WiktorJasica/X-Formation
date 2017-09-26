package pl.food_ordering_system.italian_cuisine;

import pl.food_ordering_system.domain.ThingsToOrder;

/*
 * Class that defines object "Lasagna Dish"
 */
public class LasagnaDish extends ThingsToOrder {
	/*
	 * Fields that contain "name" and "price" of the dish
	 */
	private String name;
	private double price;

	/*
	 * Constructor - assigning values to the fields
	 */
	public LasagnaDish() {
		this.name = "Lasagna";
		this.price = 28.00;
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
