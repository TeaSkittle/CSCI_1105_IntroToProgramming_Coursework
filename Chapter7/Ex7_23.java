// Author: Travis Dowd
// Date: 2-21-2020
// Chapter 7, exercise 7-23

class Ex7_23 {
	public static void main( String[] args ) {
		int[] lockers = new int[ 101 ];
		int[] student = new int[ 101 ];
		for ( int i = 1; i < student.length; ++i ) {
			for ( int j = 1; j < lockers.length; ++j ) {
				System.out.println(i + " " + j); 
				if ( i % j == 0 ) {
					if ( lockers[ i ] == 0 ) {
						lockers[ i ] = 1;
					} else {
						lockers[ i ] = 0;
					}
				}
			}
		}
		for ( int i = 1; i < lockers.length; ++i ) {
			if ( i % 10 == 0 ) { System.out.print("\n"); }
			else
				System.out.print( lockers[i] + " " );
		}
	}
}