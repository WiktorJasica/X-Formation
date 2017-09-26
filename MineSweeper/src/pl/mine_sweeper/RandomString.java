package pl.mine_sweeper;


public class RandomString {
	
	private String randomString;
		
	/*
	 * Creates String representation of mineField. 
	 * mineField consists of rows, columns, and mines entered from command-line. 
	 * Mines are placed in the String in random places.
	 */
	String createRandomString(int rows, int columns, int mines) 
	{
		
		// StringBuilder object used for creating String representation of Mine Field
		StringBuilder buildRandomString = new StringBuilder();
				
		/*
		 *  Build clear string - only "."
		 */
		int tempStringLength = (rows * columns);

		for (int i = 0; i < tempStringLength; i++) {
			buildRandomString.insert(i, ".");
		}

		
		/*
		 * Setting mines in random places 
		 */
		int mineStringLenght = (rows * columns);
		// Generates random numbers 
		DrawRundomNumbers generator = new DrawRundomNumbers(mineStringLenght);
		
		// Loop sets '*' character in random places in the string
		for (int i = 0; i < mines; i++) {
			int randomPlace = generator.get();
			buildRandomString.setCharAt(randomPlace, '*');
		}

		/*
		 *  Build final string with "\n" as a row
		 */
		int mark = columns + 1;
		for (int i = columns; i < buildRandomString.length(); i++) {
			if (i % (columns) == 0) {
				buildRandomString.insert(i, "\n");
				columns = columns + mark;
			}
		}
		
		// Conversion of StringBuilder to String
		randomString = buildRandomString.toString();
		
	
		return randomString;
	}
}
