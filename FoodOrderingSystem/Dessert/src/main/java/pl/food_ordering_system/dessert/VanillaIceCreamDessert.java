package pl.food_ordering_system.dessert;

import pl.food_ordering_system.domain.ThingsToOrder;

/*
 * Class that defines object "Vanilla ice cream Dessert"
 */
public class VanillaIceCreamDessert extends ThingsToOrder {
	/*
	 * Fields that contain "name" and "price" of the dessert
	 */
	private String name;
	private double price;

	/*
	 * Constructor - assigning values to the fields
	 */
	public VanillaIceCreamDessert() {
		this.name = "Vanilla ice cream";
		this.price = 10.00;
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
