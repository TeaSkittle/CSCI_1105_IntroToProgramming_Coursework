// Author: Travis Dowd
// Date: 2-19-2020
// Chapter 7, exercise 7-15

import java.util.Scanner;
import java.util.Arrays;

class Ex7_15 {
	public static void main( String[] args ) {
		Scanner input = new Scanner( System.in );                            // Create new inpute instance
		int[] array = new int[ 10 ];                                         // Set new array with size of 10
		System.out.print( "Enter 10 numbers seperated by a space: ");        // Prompt for user input
		for (int i = 0; i < array.length; i++) {                             // Set up loop using array.length
			array[ i ] = input.nextInt();                                // Loop for input 10 times
		} eliminateDuplicates( array );                                      // Call eleminateDuplicate method
	}
	public static int eliminateDuplicates( int[] list ) {                        // Method takes an aray as an argument
		int j = 0;                                                           // Distinct numbers
		Arrays.parallelSort( list );                                         // Sort array
		int[] newList = new int[ list.length ];                              // New array with size of list
		for ( int i = 0; i < list.length - 1; i++ ) {                        // Start of loop to create new array
			if (list[ i ] != list[ i+1 ]){                               // Compare list element with next element in list
				newList[j++] = list[i];                              // Assign and skip element
			}
		} newList[j++] = list[list.length-1];                                // Get last element of array
		int[] listThree = new int[ j ];                                      // Create new array without trailing 0's
		for (int i = 0; i < j; i++){                                         // For loop to create final array
			listThree[i] = newList[i];                                   // Assign each element until j his hit
		} System.out.print("\nThe number of distinct numbers is: " + j);     // int j is used for distinct variables
		System.out.print("\nArray without duplicates: ");                    
		for (int i = 0; i < listThree.length; i++ ) {                        // Print off array wihtout duplicates
			System.out.print(listThree[ i ] + " ");                      // Have spaces between each element of array
		} return listThree[0];                                               // return final list
	}
}
