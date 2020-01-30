/*
Author: Travis Dowd
Date: 1-30-2020

Chapter 6. exercise 6-3
*/

import java.util.Scanner;

class Ex6_3 {
	public static void main( String[] args ) {
		// Get user input
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter an integer: " );
		int number = input.nextInt();
		
		// Call methods
		reverse( number );
		isPalindrome( number );
	}
	// reverse method
	// Need to clean & redo this
	public static int reverse( int number ) {
		// Convert number to string
		int rev_int = 0;
		int digit;
		while ( number != 0 ) {
			digit = number % 10;  // Get last digit of number
			rev_int = rev_int * 10 + digit;
			number /= 10;
		}
		return rev_int;
	}
	// isPalindrome method
	public static boolean isPalindrome( int number ) {
		if ( number == reverse(number) ) {
			System.out.println("Is a palindrome.");
			return true;
		} else {
			System.out.println("Is not a palindrome.");
			return false;
		}
	}
}