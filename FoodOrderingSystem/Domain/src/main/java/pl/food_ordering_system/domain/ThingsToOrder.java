package pl.food_ordering_system.domain;

/*
 * General Class for things you can order in restaurant
 */
public abstract class ThingsToOrder {
	/*
	 * Fields that contain "name" and "price"
	 */
	public String name;
	public double price;

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
