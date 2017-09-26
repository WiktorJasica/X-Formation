package pl.mine_sweeper;

import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * Class with methods that describes parameters(rows, columns, mines) of the mineField.
 * User enters the parameter from the command-line.
 * Protects from wrong value of parameters
 */
public class FieldParameters {

	// Maximum numer of mines in the Mine Field
	private static int minesLimit;
	// Entered number of rows
	private static int rowsInput;
	// Entered number of columns
	private static int columnInput;
	
	/*
	 * Method describes number of rows in the mineField.
	 */
	public static int setRowsParameter() {

		// Closes this input stream and releases any system resources associated with the stream
		Scanner scanner = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() throws IOException {
			}
		});

		System.out.print("Set the number of rows in mineField: ");
		int rows = 0;

		// Loop that protects from wrong input
		while (true) {
			try {
				rows = scanner.nextInt();
				if (rows <= 0) {
					while (rows <= 0) {
						System.out.println("You set wrong value, number must be greater then 0");
						System.out.print("Set the number of rows in mineField: ");
						rows = scanner.nextInt();
						continue;
					}
				}
				break;
			} catch (Exception e) {
				System.out.println("You set wrong value, please enter the number");
				System.out.print("Set the number of rows in mineField: ");
				scanner.next();
				continue;
			}
		}
		scanner.close();
		rowsInput = rows;
		return rows;
	}

	/*
	 * Method describes number of columns in the mineField.
	 */
	public static int setColumnsParameter() {

		// Closes this input stream and releases any system resources associated with the stream
		Scanner scanner = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() throws IOException {
			}
		});

		System.out.println();
		System.out.print("Set the number of columns in mineField: ");
		int columns = 0;

		// Loop that protects from wrong input
		while (true) {
			try {
				columns = scanner.nextInt();
				if (columns <= 0) {
					while (columns <= 0) {
						System.out.println("You set wrong value, number must be greater then 0");
						System.out.print("Set the number of columns in mineField: ");
						columns = scanner.nextInt();
						continue;
					}
				}
				break;
			} catch (Exception e) {
				System.out.println("You set wrong value, please enter the number");
				System.out.print("Set the number of columns in mineField: ");
				scanner.next();
				continue;
			}
		}
		scanner.close();
		columnInput=columns;
		return columns;
	}

	/*
	 * Method describes number of mines in the mineField.
	 */
	public static int setMinesParameter() {

		// Closes this input stream and releases any system resources associated with the stream
		Scanner scanner = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() throws IOException {
			}
		});

		System.out.println();
		System.out.print("Set the number of mines in mineField: ");
		minesLimit = rowsInput*columnInput; 
		int mines = 0;

		// Loop that protects from wrong input
		while (true) {
			try {
				mines = scanner.nextInt();
				if (mines <= 0 || mines > minesLimit) {
					while (mines <= 0 || mines > minesLimit ) {
						System.out.println("You set wrong value.\n"
								+ "Number of mines must be more then 0 and less then "+(minesLimit+1));
						System.out.print("Set the number of mines in mineField: ");
						mines = scanner.nextInt();
						continue;
					}
				}
				break;
			} catch (Exception e) {
				System.out.println("You set wrong value, please enter the number");
				System.out.print("Set the number of mines in mineField: ");
				scanner.next();
				continue;
			}
		}
		scanner.close();
		return mines;
	}
}
