// Author: Travis Dowd
// Date: 2-21-2020
// Chapter 7, exercise 7-23

class Ex7_23 {
	public static void main( String[] args ) {
		int[] lockers = new int[ 101 ];                    // Array for lockers
		int[] student = new int[ 101 ];                    // Array ofor students
		for ( int i = 1; i < student.length; ++i ) {       // iterate through students
			for ( int j = 1; j < lockers.length; ++j ) {   // iterate through lockers
				if ( i % j == 0 ) {                        // Figure out which lockers to skip, via remainder == 0
					if ( lockers[ i ] == 0 ) {             // If locker is closed:
						lockers[ i ] = 1;                  // Open the locekr
					} else {                               // Else:
						lockers[ i ] = 0;                  // Close the locker
					}
				}
			}
		}
		for ( int i = 1; i < lockers.length; ++i ) {       // iterate through lockers once more
			System.out.print( lockers[i] + " " );          // Print status of locker
			if ( i % 10 == 0 ) { System.out.print("\n"); } // Print newline on 10
		}
	}
}