package pl.mine_sweeper;


public class GameRunner {
	/*
	 * Main method that executes program
	 */
	public static void main(String[] args) {
		// Number of rows in mineField
		int rows;
		// Number of columns in mineField
		int columns;
		// Number of mines in mineField
		int mines;

		System.out.println("Wellcome in Minesweeper"+"\n");

		// Setting from command-line number of rows
		rows = FieldParameters.setRowsParameter();
		// Setting from command-line number of columns
		columns = FieldParameters.setColumnsParameter();
		// Setting from command-line number of mines
		mines = FieldParameters.setMinesParameter();

		/*
		 * Creating String consist of entered mineField parameters. Mines are randomly
		 * located in the string
		 */
		RandomString randomMineString = new RandomString();
		String mineField = randomMineString.createRandomString(rows, columns, mines);

		// Run mineSweeper methods
		Game mineSweeper = new Game(rows, columns, mines);

		mineSweeper.setMineField(mineField);
		mineSweeper.getHintField();

	}
	

}
