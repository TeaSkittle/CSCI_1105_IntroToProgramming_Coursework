package ex6_37;
import java.util.Scanner;
/**
 * <h1> Exercise, 6-37 </h1>
 * <p> Returns a string for an integer with one or more prefix 0s. The size of the string is the width.
 * <br><br> Example: <br>
 * Enter number: 34 <br>
 * Enter width: 5 <br>
 * 00034 </p>
 * <p> Created: 2/10/2020 </p>
 * @author Travis Dowd
 * @version 2.0
 *
 */
class Ex6_37 {
	/**
	 * Main method, get user input and call the format method.
	 * @param args Command line arguments, not used in this class
	 */
	public static void main( String[] args ) {
		Scanner input = new Scanner( System.in );          // Get user input
		System.out.print("Enter number: ");
		int number = input.nextInt();
		System.out.print("Enter width: ");
		int width = input.nextInt();
		format( number, width );                           // Call format method
	}
	/**
	 * <p> Check the size of number against width, if width is larger than the amount of digits in number,<br>
	 * than prefix the difference in 0's to the start of number. Example: <br>
	 * Enter number: 22 <i><b>(two digits)</b></i><br>
     * Enter width: 4  <i><b>(4 &gt; 2)</b></i><br>
     * 0022 <i><b>(4 - 2 = 2, prefix 2 to number)</b></i><br>
     * </p>
	 * @param number(int; The base number which will have 0's placed in front of it)
	 * @param width (int; If number &lt; width, then add zeros in front of number)
	 * @return number with prefixed 0's
	 */
	public static String format( int number, int width ) {
		String numberString = Integer.toString( number );  // Convert int to string
		int numZero = width - numberString.length();       // Number of zeros
		numberString = zeroLoop( numZero ) + numberString; // Add zeros in front of number
		System.out.println( numberString );
		return numberString;
	}
	/**
	 * Find the amount of 0's to be prefixed to a string.
	 * @param numZero (int; Number of 0's to be added in front of a string)
	 * @return String of 0's
	 */
	public static String zeroLoop( int numZero ) {	           // Method for creating 0's at start of string
		String count = "";                                 // String of 0's
		for ( int i = 0; i < numZero; i++ ) {
			count += "0";                              // Add '0' to string
		} return count;
	}
}
