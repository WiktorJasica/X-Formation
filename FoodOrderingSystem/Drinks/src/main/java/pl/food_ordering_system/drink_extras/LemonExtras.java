package pl.food_ordering_system.drink_extras;

import pl.food_ordering_system.domain.ThingsToOrder;

/*
 * Class that defines object "Lemon Extras"
 */
public class LemonExtras extends ThingsToOrder {
	/*
	 * Fields that contain "name" and "price" of the Lemon Extras
	 */
	private String name;
	private double price;

	/*
	 * Constructor - assigning values to the fields
	 */
	public LemonExtras() {
		this.name = "Lemon";
		this.price = 2.00;
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
