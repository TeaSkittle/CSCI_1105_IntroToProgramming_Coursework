package ex6_3;
import java.util.Scanner;
/**
 * <h1> Exercise 6-3 </h1>
 * <p> See if a an integer is a palindrome, example: </p>
 * <p> Enter an integer: 12321
 * <br> Is a palindrome. </p>
 * @author Travis Dowd
 * @version 2.0
 *
 */
public class Ex6_3 {
	/**
	 * Main method, get user input and call isPalindrome method.
	 * @param args Command line arguments, not used in this class
	 */
	public static void main( String[] args ) {
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter an integer: " );
		int number = input.nextInt();
		isPalindrome( number );                // Check to see if number == reverse( number )
	}
	/**
	 * <p> Takes an integer and reverses the digits, example: </p>
	 * <p> number = 123
	 * <br>reversed number = 321 </p>
	 * @param number (int; Number to be reversed)
	 * @return Number with digits in the reverse order
	 */
	public static int reverse( int number ) {
		int digit, rev_int;		               // Declare variables for the loop below
		rev_int = 0;
		while ( number != 0 ) {
			digit = number % 10;               // Get last digit of number
			rev_int = rev_int * 10 + digit;    // Add digit to rev_int (new reverse number)
			number /= 10;                      // Set number = number / 10 (when number = zero, loop ends)
		}
		return rev_int;
	}
	/**
	 * <p> Checks to see if number is equal to reverse( number ). </p>
	 * <p> Example: <br>
	 * 242 == 242 ( returns true) <br>
	 * 123 == 321 ( returns false) </p>
	 * @param number (int; The number to be reversed and checked)
	 * @return True if number is equal to reverse( number ), else returns false.
	 */
	public static boolean isPalindrome( int number ) {
		if ( number == reverse(number) ) {        // Compare inputed number with reversed number
			System.out.println("Is a palindrome.");
			return true;
		} else {
			System.out.println("Is not a palindrome.");
			return false;
		}
	}
}
