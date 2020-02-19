// Author: Travis Dowd
// Date: 2-19-2020
// Chapter 7, exercise 7-23

class Ex7_23 {
	public static void main( String[] args ) {
		int[] lockers = new int[ 100 ];
		int[] student = new int[ 100 ];
		for ( int i = 0; i < student.length; i++ ) {
			for ( int j = 0; j < lockers.length; j++ ) {
				if ( i == 0 || j == 0 ) { 
					if ( student[ i ] == 0 ) { lockers[ i ] = 1; } 
				} else if ( i % j == 0 ) {
					if ( lockers[ i ] == 0 ) {
						lockers[ i ] = 1;
					} else {
						lockers[ i ] = 0;
					}
				}
			}
		}
		for ( int i = 0; i < lockers.length; i++ ) {
			if ( i % 10 == 0 ) { System.out.print("\n"); }
			else
				System.out.print( lockers[i] + " " );
		}
	}
}