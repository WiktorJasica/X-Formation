package pl.mine_sweeper;

public class CreateHintString 
{
	/*
	 * Creates String hintField based on created hintTable.
	 * Creates String from all cells in the table. 
	 * Creates and returns String representation of the hintTable
	 */
	static String createString(int rows,int columns, String [][] hintTable) 
	{
		// String representation of the hintTable
		String hintField;
		
		// Temporary StringBuilder object used in creating hintField 
		StringBuilder tempHintField = new StringBuilder();
		
		/*
		 * Multiply loop that creates tempHintField and prints hintTable.
		 * tempHintField contains all cells of hintTable
		 */
		
		// Rows table count
		System.out.println("Hint Field:\n");
		for(int i=0;i< rows;i++) 
		{
			// Columns table count
			for(int j=0; j<columns;j++) 
			{
				System.out.print(hintTable[i][j]);
				tempHintField.append(hintTable[i][j]);
			}
			System.out.println();			
		}//end of loop;
		
		// "mark" is used for set row representation in the String ("\n) in a correct place	
	     int mark = columns+2;	
		
	     //Multiply loop that sets "\n" in the correct place in the String
	     for(int i=columns;i<tempHintField.length();i++) 
			{
			if(i%(columns)==0) 
				{
				tempHintField.insert(i, "\\n");
				columns=columns+mark;
				}
			}
		
	    // Conversion of StringBuilder to String
		hintField=tempHintField.toString();
		
		System.out.print("\nString representation of the Hint Field:");
		System.out.println("\n"+hintField);
		
		return hintField;
	}
	
}
