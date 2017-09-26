package pl.mine_sweeper;

public class CreateMineTable {
	/*
	 * Creates two-dimensional table that represents randomly generated Mine Field
	 */
	static Character[][] createTable(String mineField) {
		// Table with characters from the String mineField
		Character stringToCharTable[] = new Character[mineField.length()];

		// Number of rows in the String
		int row = 1;
		// Number of columns in the String
		int column = 0;
		// Number of mines in the String
		int nrOfMines = 0;

		/*
		 * Loop that creates one dimensional Table of characters. Counts rows, columns
		 * and mines for the mineFieldTable.
		 */
		for (int i = 0; i < mineField.length(); i++) {
			stringToCharTable[i] = mineField.charAt(i);

			if (stringToCharTable[i].equals('\n')) {
				row++;
			}
			if (stringToCharTable[i].equals('*')) {
				nrOfMines++;
			}
			if (!stringToCharTable[i].equals('\n')) {
				column++;
			}
		}
		column = column / row;

		System.out.println("\nRows: " + row + " columns: " + column + " mines: " + nrOfMines);

		// Table represents Mine Field
		Character[][] mineFieldTable = new Character[row][column];

		// Setting characters form the String mineField in table cells
		int i = 0;

		for (int k = 0; k < mineField.length(); k++) {
			for (int j = 0; j < column; j++) {
				mineFieldTable[i][j] = (mineField.charAt(k + j));
			}
			i++;
			k = k + column;
		}

		System.out.println("\nMine Field: \n");

		// Printing mineFieldTable
		for (int z = 0; z < row; z++) {
			for (int j = 0; j < column; j++) {
				System.out.print(mineFieldTable[z][j]);
			}
			System.out.println();
		}
		
		return mineFieldTable;
	}
}
