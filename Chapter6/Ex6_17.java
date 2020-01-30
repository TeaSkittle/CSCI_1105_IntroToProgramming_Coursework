/*
Author: Travis Dowd
Date: 1-30-2020

Chapter 6, exercise 6-17
*/

import java.util.Scanner;

class Ex6_17 {
	// Main method
	public static void main( String[] args ) {
		// Get user input
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter n: " );
		int n = input.nextInt();
		
		// Call method
		printMatrix( n );
	}
	// printMatrix method
	public static void printMatrix( int n ) {
		int col = 0;
		for ( int row = 0; row <= n; row++ ) {
			if ( row < n ) {
				// Print out a random 0 or 1
				System.out.print((Math.round(Math.random())) + " "));
			} else if ( row == n ) {
				col++;
				//print 0 or 1
				System.out.printf("\n");
				if ( col != n ) {
					// Print out a random 0 or 1
					System.out.print((Math.round(Math.random())) + " "));
					row = 0;              // reset row count
				} else if ( col >= n ) {
					break;                // end loop
				}
			}
		}
	}
}
