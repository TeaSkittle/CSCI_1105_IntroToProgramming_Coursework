// Guitar project
// start date: 2-21-2020

class Untitled {
	public static void main(String[] args) {
		int[][] guitar = { 
			{ 6,  5,  4,  3,  2,  1 },                             // String
			{ 0,  1,  2,  3,  4,  5,  6,7,  8,  9,  10, 11, 12,    // Frets 0 - 24
			  13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 }
		};
		for ( int i = 0; i < guitar[0].length; i++ ) {
			System.out.print( guitar[0][ i ] + " | " );
			for ( int j = 0; j < guitar[1].length; j++ ) {
				//System.out.print(guitar[1][ j ] + " ");
				System.out.print( "- ");
				if ( j == 24 ) { System.out.print("|\n");}
			}
		}
	}
}