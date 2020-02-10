package ex6_17;
import java.util.Scanner;
/**
 * <h1> Exercise 6-17 </h1>
 * <p> Display a matrix of 0s and 1s, example: </p>
 * <p> Enter n: 3
 * <br> 0 1 0 
 * <br> 1 0 0 
 * <br> 0 0 1 </p>
 * <p> Created: 2/10/2020 </p>
 * @author Travis Dowd
 * @version 2.0
 */
public class Ex6_17 {
	/**
	 * Main method, used to get user input and call the printMatrix method.
	 * @param args Command line arguments, not used in this class
	 */
	public static void main( String[] args ) {
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter n: " );
		int n = input.nextInt();
		printMatrix( n );
	}
	/**
	 * Prints an n-by-n matrix of random 0s and 1s.
	 * @param n (int; the x and y values of the matrix to be printed)
	 */
	public static void printMatrix( int n ) {
		int col = 0;
		for ( int row = 0; row <= n; row++ ) {
			if ( row < n ) {
				System.out.print((Math.round(Math.random())) + " ");
			} else if ( row == n ) {
				col++;
				System.out.printf("\n");
				if ( col != n ) {
					System.out.print((Math.round(Math.random())) + " ");
					row = 0;
				} else if ( col >= n ) {
					break; 
				}
			}
		}
	}
}

