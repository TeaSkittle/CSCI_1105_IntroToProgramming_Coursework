// Author: Travis Dowd
// Date: 3-3-2020
//
// Chapter 8, exercise 8-9
//   Simple tic-tac-toe game for two players,
//   does not find any winning conditions, game
//   ends when all squares are filled.

import java.util.Scanner;

class Ex8_9 {
	public static void main( String[] args ) {
		int player  = 0;                                // 0 = X's, 1 = O's
		int running = 1;                                // 1 until game is over
		int turn    = 0;                                // Number of turns, to stop loop
		String[][] board = {                            // Array for game board
			{" ", " ", " "},                            // Initialize every elemet of
			{" ", " ", " "},                            // array with a blank space
			{" ", " ", " "}};                           //
		while ( running != 0 ) {                        // Start of game loop
			if ( turn < 9 ) {                           // Game ends when all 9 spots are filled
				prompt( board, player, turn );          // Get input fro user
				turn++;                                 // Increment turn count to change player in prompt()
			} else {                                    //
				printArray( board );                    // Print final board
				running--;                              // Stop game loop, sets running to 0
			}
		}
	}
	public static void prompt( String[][] board, int player, int turn ) {
		Scanner input = new Scanner( System.in );       // Create new Scanner
		printArray( board );                            // Print array before getting user input
		if ( turn % 2 == 0 ) {                          // Used to determine player, even or odd, 0 or 1
			player = 0;                                 // Set player to X
		} else {                                        //
			player = 1;                                 // Set player to O
		} switch( player ) {                            // Used switch statement to avoid a bunch of nested if statements
			case 0:                                     // Player X
				System.out.print("Enter a row (0, 1, or 2) for player X: ");
				int row = input.nextInt();              // Input for X row
				System.out.print("Enter a column (0, 1, or 2) for player X: ");
				int col = input.nextInt();              // Input for X column
				if ( board[row][col] == " ") {          // If space in array is empty:
					board[row][col] = "X";              // Place X at location
				} else {                                // Basic error handling:
					System.out.println("Error, position filled, try again...");
					prompt( board, 0, turn );           // Recursive function call, restart prompt for same player
				} break;                                // Always remember break to prevent fallthrough
			case 1:                                     // Player O
				System.out.print("Enter a row (0, 1, or 2) for player O: ");
				row = input.nextInt();                  // Input for O row
				System.out.print("Enter a column (0, 1, or 2) for player O: ");
				col = input.nextInt();                  // Input for O column
				if ( board[row][col] == " ") {          // If space in array is empty:
					board[row][col] = "O";              // Place O at location
				} else {                                // Basic error handling:
					System.out.println("\nError! Position filled, try again...");
					prompt( board, 1, turn );           // Recursive function call, restart prompt for same player
				} break;                                // Always remember break to prevent fallthrough
		}                                               // No default case needed for this switch statement
	}  
	public static void printArray( String[][] array){   // Method to print out game board
		System.out.print("\n-------------\n");          // with nice formatting, make the array
		for ( int row = 0; row < array.length; row++ ){ // actually look like a tic-tac-toe board
			for ( int col = 0; col < array[row].length; col++ ) {
				if ( col == 0 ) {
					System.out.print( "| " );
				} System.out.print( array[row][col] + " | " );
				if ( col == 2 ) {
					System.out.print( "\n" );
				}
			} System.out.print("-------------\n");      // Print after the loop has run
		}
	}
}