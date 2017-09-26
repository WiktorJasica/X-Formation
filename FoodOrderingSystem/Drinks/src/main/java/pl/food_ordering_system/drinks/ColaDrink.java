package pl.food_ordering_system.drinks;

import pl.food_ordering_system.domain.ThingsToOrder;

/*
 * Class that defines object "Cola Drink"
 */
public class ColaDrink extends ThingsToOrder {
	/*
	 * Fields that contain "name" and "price" of the Cola Drink
	 */
	private String name;
	private double price;

	/*
	 * Constructor - assigning values to the fields
	 */
	public ColaDrink() {
		this.name = "Cola";
		this.price = 6.00;
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
