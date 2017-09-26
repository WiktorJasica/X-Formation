package pl.food_ordering_system.dessert;

import pl.food_ordering_system.domain.ThingsToOrder;

/*
 * Class that defines object "Tiramisu Dessert"
 */
public class TiramisuDessert extends ThingsToOrder {
	/*
	 * Fields that contain "name" and "price" of the dessert
	 */
	private String name;
	private double price;

	/*
	 * Constructor - assigning values to the fields
	 */
	public TiramisuDessert() {
		this.name = "Tiramisu";
		this.price = 15.00;
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
