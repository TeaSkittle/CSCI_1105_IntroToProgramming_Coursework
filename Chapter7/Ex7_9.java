/*
 * Author: Travis Dowd
 * Date: 2/13/2020
 *
 * Chapter 7, exercise 7-9 */

import java.util.Arrays;
import java.util.Scanner;

class Ex7_9 {
	public static void main( String[] args ) {
		Scanner input = new Scanner( System.in );
		double[] array = new double[ 10 ] ;                                  // Set new array with size of 10
		System.out.print( "Enter 10 numbers seperated by a space: ");        // Prompt for user input
		for (int i = 0; i < array.length; i++)                               // Set up loop using array.length
			array[ i ] = input.nextDouble();                             // Loop for input 10 times
		System.out.print( "The minimum number is: " + min( array ) + "\n" ); // Call min method and print retuned value
	}
	public static double min( double[] array ) {
		Arrays.parallelSort( array );		                             // Sort array
		return array[ 0 ];                                                   // return first element in array after sort
	}
}
