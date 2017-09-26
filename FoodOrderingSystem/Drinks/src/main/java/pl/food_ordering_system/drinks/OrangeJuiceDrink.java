package pl.food_ordering_system.drinks;

import pl.food_ordering_system.domain.ThingsToOrder;

/*
 * Class that defines object "Orange Juice Drink"
 */
public class OrangeJuiceDrink extends ThingsToOrder {
	/*
	 * Fields that contain "name" and "price" of the Orange Juice Drink
	 */
	private String name;
	private double price;

	/*
	 * Constructor - assigning values to the fields
	 */
	public OrangeJuiceDrink() {
		this.name = "Orange Juice";
		this.price = 8.00;
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
