/*
Author: Travis Dowd
Date: 1-31-2020

Chapter 6, exercise 6-37
*/

import java.util.Scanner;

class Ex6_37 {
	public static void main( String[] args ) {
		Scanner input = new Scanner( System.in );          // Get user input
		System.out.print("Enter number: ");
		int number = input.nextInt();
		System.out.print("Enter width: ");
		int width = input.nextInt();
		format( number, width );                           // Call format method
	}
	public static String format( int number, int width ) {
		String numberString = Integer.toString( number );  // Convert int to string
		int numZero = width - numberString.length();       // Number of zeros
		numberString = zeroLoop( numZero ) + numberString; // Add zeros in front of number
		System.out.println( numberString );
		return numberString;
	}
	public static String zeroLoop( int numZero ) {	           // Method for creating 0's at start of string
		String count = "";                                 // String of 0's
		for ( int i = 0; i < numZero; i++ ) {
			count += "0";                              // Add '0' to string
		} return count;
	}
}
