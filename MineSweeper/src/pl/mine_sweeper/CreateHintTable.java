package pl.mine_sweeper;


public class CreateHintTable 
{
	/*
	 * Creates String Hint Table based on created Mine Field Table.
	 * Considers all cases necessary to build Hint Table.  
	 * Returns created Hint table.
	 */
	static String[][] createTable(int rows, int columns, Character[][] mineFieldTable) {
		
		// Hint number that is set to the specified place in table
		int hintNumber = 0;
		
		String[][] hintTable = new String[rows][columns];

		/*
		 * Multiply Loop creates Hint Table with all the cases.
		 * Sets hintNumber or "*" to the specified place in table
		 * For every cell in the table loop checks all surrounding cells and sets appropriate hintNumber or "*".
		*/ 
		
		// Rows Count
		for (int x = 0; x < rows; x++) {
			// Columns count
			for (int y = 0; y < columns; y++) {
				
				// If tableMineField[][]=[0][0] case
				if (x == 0 & y == 0) {
					for (int i = x; i < x + 2; i++) {
						for (int j = y; j < y + 2; j++) {
							if (mineFieldTable[i][j].equals('*')) {
								hintNumber++;
							}
						}
					}
					if (mineFieldTable[x][y].equals('*')) {
						hintTable[x][y] = "*";
					} else {
						hintTable[x][y] = String.valueOf(hintNumber);
					}
					hintNumber = 0;
				} // end if [0][0]

				// If tableMineField[][]=[0][column-1] case
				if (x == 0 & y == (columns - 1))
					for (int i = x; i < x + 2; i++) {
						for (int j = columns - 2; j < columns; j++) {
							if (mineFieldTable[i][j].equals('*')) {
								hintNumber++;
							}
						}
						if (mineFieldTable[x][y].equals('*')) {
							hintTable[x][y] = "*";
						} else {
							hintTable[x][y] = String.valueOf(hintNumber);
						}
						hintNumber = 0;
					} // end if [0][column-1]

				// If tableMineField[][]=[row-1][0] case
				if (x == (rows - 1) & y == 0) {
					for (int i = rows - 2; i < rows; i++) {
						for (int j = y; j < y + 2; j++) {
							if (mineFieldTable[i][j].equals('*')) {
								hintNumber++;
							}
						}
					}
					if (mineFieldTable[x][y].equals('*')) {
						hintTable[x][y] = "*";
					} else {
						hintTable[x][y] = String.valueOf(hintNumber);
					}
					hintNumber = 0;
				} // end if [row-1][0]

				// If tableMineField[][]=[row-1][column-1] case
				if (x == (rows - 1) & y == (columns - 1)) {
					for (int i = rows - 2; i < rows; i++) {
						for (int j = columns - 2; j < columns; j++) {
							if (mineFieldTable[i][j].equals('*')) {
								hintNumber++;
							}
						}
					}
					if (mineFieldTable[x][y].equals('*')) {
						hintTable[x][y] = "*";
					} else {
						hintTable[x][y] = String.valueOf(hintNumber);
					}
					hintNumber = 0;
				} // end if [row-1][column-1]

				// if tableMineField[][]=[0][y] case
				if (x == 0 & y != 0 & y != (columns - 1)) {
					for (int i = x; i < x + 2; i++) {
						for (int j = y - 1; j < y + 2; j++) {
							if (mineFieldTable[i][j].equals('*')) {
								hintNumber++;
							}
						}
					}
					if (mineFieldTable[x][y].equals('*')) {
						hintTable[x][y] = "*";
					} else {
						hintTable[x][y] = String.valueOf(hintNumber);
					}
					hintNumber = 0;
				} // end if [0][y]

				// if tableMineField[][]=[x][0] case
				if (x != 0 & x != (rows - 1) & y == 0) {
					for (int i = x - 1; i < x + 2; i++) {
						for (int j = y; j < y + 2; j++) {
							if (mineFieldTable[i][j].equals('*')) {
								hintNumber++;
							}
						}
					}
					if (mineFieldTable[x][y].equals('*')) {
						hintTable[x][y] = "*";
					} else {
						hintTable[x][y] = String.valueOf(hintNumber);
					}
					hintNumber = 0;
				} // end if [x][0]

				// if tableMineField[][]=[row-1][y] case
				if (x == (rows - 1) & y != 0 & y != (columns - 1)) {
					for (int i = rows - 2; i < rows; i++) {
						for (int j = y - 1; j < y + 2; j++) {
							if (mineFieldTable[i][j].equals('*')) {
								hintNumber++;
							}
						}
					}
					if (mineFieldTable[x][y].equals('*')) {
						hintTable[x][y] = "*";
					} else {
						hintTable[x][y] = String.valueOf(hintNumber);
					}
					hintNumber = 0;
				} // end if [row-1][y]

				// if tableMineField[][]=[x][column-1] case
				if (x != 0 & x != (rows - 1) & y == (columns - 1)) {
					for (int i = x - 1; i < x + 2; i++) {
						for (int j = columns - 2; j < columns; j++) {
							if (mineFieldTable[i][j].equals('*')) {
								hintNumber++;
							}
						}
					}
					if (mineFieldTable[x][y].equals('*')) {
						hintTable[x][y] = "*";
					} else {
						hintTable[x][y] = String.valueOf(hintNumber);
					}
					hintNumber = 0;
				} // end if [x][column-1]

				// if tableMineField[][]=[x][y] case
				else if (x != 0 & x != (rows - 1) & y != 0 & y != (columns - 1)) {
					for (int i = x - 1; i < x + 2; i++) {
						for (int j = y - 1; j < y + 2; j++) {
							if (mineFieldTable[i][j].equals('*')) {
								hintNumber++;
							}
						}
					}
					if (mineFieldTable[x][y].equals('*')) {
						hintTable[x][y] = "*";
					} else {
						hintTable[x][y] = String.valueOf(hintNumber);
					}
					hintNumber = 0;
				} // end else [x][y]

			} // end for column count
		} // end for rows count

		System.out.println();
		return hintTable;
	}

}
