package pl.food_ordering_system.polish_cuisine;

import pl.food_ordering_system.domain.ThingsToOrder;

/*
 * Class that defines object "Potato pancakes Dish"
 */
public class PotatoPancakesDish extends ThingsToOrder {
	/*
	 * Fields that contain "name" and "price" of the dish
	 */
	private String name;
	private double price;

	/*
	 * Constructor - assigning values to the fields
	 */
	public PotatoPancakesDish() {
		this.name = "Potato pancakes";
		this.price = 20.00;
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
