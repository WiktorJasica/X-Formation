package pl.food_ordering_system.drinks;

import pl.food_ordering_system.domain.ThingsToOrder;

/*
 * Class that defines object "Water Drink"
 */
public class WaterDrink extends ThingsToOrder {
	/*
	 * Fields that contain "name" and "price" of the Water Drink
	 */
	private String name;
	private double price;

	/*
	 * Constructor - assigning values to the fields
	 */
	public WaterDrink() {
		this.name = "Water";
		this.price = 5.00;
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
