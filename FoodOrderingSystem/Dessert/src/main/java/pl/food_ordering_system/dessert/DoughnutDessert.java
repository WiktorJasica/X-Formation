package pl.food_ordering_system.dessert;

import pl.food_ordering_system.domain.ThingsToOrder;

/*
 * Class that defines object "Doughnut Dessert"
 */
public class DoughnutDessert extends ThingsToOrder {
	/*
	 * Fields that contain "name" and "price" of the dessert
	 */
	private String name;
	private double price;

	/*
	 * Constructor - assigning values to the fields
	 */
	public DoughnutDessert() {
		this.name = "Doughnut";
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
