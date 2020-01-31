/*
Author: Travis Dowd
Date: 1-31-2020

Chapter 6, exercise 6-3
*/

import java.util.Scanner;

class Ex6_3 {
	public static void main( String[] args ) {
		// Get user input
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter an integer: " );
		int number = input.nextInt();
		
		// Call methods
		reverse( number );                         // Reverse the number inputed by user
		isPalindrome( number );                    // Check to see if number == reverse( number )
	}
	
	public static int reverse( int number ) {
		int digit, rev_int;		           // Declare variables for the loop below
		rev_int = 0;
		while ( number != 0 ) {
			digit = number % 10;               // Get last digit of number
			rev_int = rev_int * 10 + digit;    // Add digit to rev_int (new reverse number)
			number /= 10;                      // Set number = number / 10 (when number = zero, loop ends)
		}
		return rev_int;
	}

	public static boolean isPalindrome( int number ) {
		if ( number == reverse(number) ) {         // Compare inputed number with reversed number
			System.out.println("Is a palindrome.");
			return true;
		} else {
			System.out.println("Is not a palindrome.");
			return false;
		}
	}
}
