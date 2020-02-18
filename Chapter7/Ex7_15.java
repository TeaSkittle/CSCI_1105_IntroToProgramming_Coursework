// Author: Travis Dowd
// Date: 2-18-2020
// Chapter 7, exercise 7-15

import java.util.Scanner;
import java.util.Arrays;

class Ex7_15 {
	public static void main( String[] args ) {
		Scanner input = new Scanner( System.in );
		int[] array = new int[ 10 ] ;                                        // Set new array with size of 10
		System.out.print( "Enter 10 numbers seperated by a space: ");        // Prompt for user input
		for (int i = 0; i < array.length; i++)                               // Set up loop using array.length
			array[ i ] = input.nextInt();                                    // Loop for input 10 times
		eliminateDuplicates( array );
	}
	public static int eliminateDuplicates( int[] list ) {
		int distinct = 0;                                                    // Number of distinct numbers
		Arrays.parallelSort( list );                                         // Sort array
		int[] newList = new int[ list.length ];                              // New array with size of list
		for ( int i = 0; i < list.length - 1; i++ ) {                        // Start of loop to create new array
			if ( list[ i ] != list[i + 1] ) {  
				++distinct;
				newList[ i ] = list[ i ];
			} else {
				newList[ i ] = list[ i ];
				++i;
			}
		} Arrays.parallelSort( newList );
		System.out.print("\nThe number of distinct numbers is: " + distinct + "\n");
		System.out.print("Array without duplicates: ");
		for (int j = 0; j < newList.length; j++ ) {
			System.out.print(newList[j]);
		}
		return newList[0];
	}
}