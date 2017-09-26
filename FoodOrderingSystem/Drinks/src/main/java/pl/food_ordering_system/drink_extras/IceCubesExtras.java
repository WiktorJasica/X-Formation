package pl.food_ordering_system.drink_extras;
import pl.food_ordering_system.domain.ThingsToOrder;

/*
 * Class that defines object "Ice Cubes Extras"
 */
public class IceCubesExtras extends ThingsToOrder
{
	/*
	 * Fields that contain "name" and "price" of the Ice cubes Extras
	 */
	private String name;
	private double price;
	
	/*
	 * Constructor - assigning values to the fields
	 */
	public IceCubesExtras()
	{
		this.name="Ice cubes";
		this.price=1.00;
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
