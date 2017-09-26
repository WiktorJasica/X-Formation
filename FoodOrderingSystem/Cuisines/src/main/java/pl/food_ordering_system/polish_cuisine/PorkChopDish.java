package pl.food_ordering_system.polish_cuisine;

import pl.food_ordering_system.domain.ThingsToOrder;

/*
 * Class that defines object "Pork chop with cabbage Dish"
 */
public class PorkChopDish extends ThingsToOrder {
	/*
	 * Fields that contain "name" and "price" of the dish
	 */
	private String name;
	private double price;

	/*
	 * Constructor - assigning values to the fields
	 */
	public PorkChopDish() {
		this.name = "Pork chop with cabbage";
		this.price = 29.00;
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
