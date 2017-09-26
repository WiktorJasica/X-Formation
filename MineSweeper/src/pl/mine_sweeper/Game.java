package pl.mine_sweeper;

public class Game implements MineSweeper {

	//String representation of the Hint Field
	private String hintField;
	
	// String Table representation of the Hint Field
	private String[][] hintTable;
	
	// Character Table representation of the Mine Field
	private Character[][] mineFieldTable;
	
	// Number of rows in the Mine Field 
	private int row;
	
	// Number of columns in the Mine Field 
	private int column;
	
	// Number of mines in the Mine Field 
		private int mine;

	// Object "Game" constructor
	public Game(int row, int column,int mine) {
		super();
		this.row = row;
		this.column = column;
		this.mine = mine;
	}

	/*
	 * Creates the Mine Field based on the randomly generated String mineField
	 */
	@Override
	public void setMineField(String mineField) {
		
			this.mineFieldTable = CreateMineTable.createTable(mineField);
	}

	/*
	 * Returns String representation of the Hint Field 
	 */
	@Override
	public String getHintField() {
		
		
		this.hintTable = CreateHintTable.createTable(row, column, mineFieldTable);

		this.hintField = CreateHintString.createString(row, column, hintTable);
		
		
		return hintField;
	}

}
