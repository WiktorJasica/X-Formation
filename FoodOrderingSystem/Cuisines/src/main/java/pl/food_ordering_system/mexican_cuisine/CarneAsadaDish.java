package pl.food_ordering_system.mexican_cuisine;

import pl.food_ordering_system.domain.ThingsToOrder;

/*
 * Class that defines object "Carane Asada Dish"
 */
public class CarneAsadaDish extends ThingsToOrder {
	/*
	 * Fields that contain "name" and "price" of the dish
	 */
	private String name;
	private double price;

	/*
	 * Constructor - assigning values to the fields
	 */
	public CarneAsadaDish() {
		this.name = "Carne asada";
		this.price = 35.00;
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
