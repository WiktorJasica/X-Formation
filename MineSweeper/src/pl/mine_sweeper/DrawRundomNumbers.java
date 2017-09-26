package pl.mine_sweeper;

import java.util.Random;

public class DrawRundomNumbers {

	// Object used for drawing random numbers
	Random generator = new Random();

	// Boolean Table of markers
	private boolean[] numbers;
	// Table size
	private int size;

	
	/*
	 * Constructor - creates table of boolean markers. 
	 * Fills table with "true" markers.
	 */
	public DrawRundomNumbers(int size) {

		numbers = new boolean[size];
		this.size = size;

		for (int i = 0; i < size; i++) {
			numbers[i] = true;
		}
	}

	/*
	 * Recursive method that draws numbers without repetition.
	 */
	public int get() {
		// Random number
		int i = generator.nextInt(size);

		// If number is not repeating, returns this number
		if (numbers[i] == true) {
			numbers[i] = false;
			return i;
		}
		// If number repeated - drawing once again
		else {

			return get();
		}
	}
}
