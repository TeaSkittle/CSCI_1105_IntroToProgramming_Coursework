// Author: Travis Dowd
// Date: 2-27-2020
//
// Chapter 8, exercise 8-37

import java.util.Scanner;

class Ex8_37 {
	public static void randomElement( String[][] a ) {      // Method to find random element of array and compare input
		Scanner input = new Scanner( System.in );           // Create new scanner
		int count = 0;                                      // Number of correct guesses
		for ( int i = 0; i < 10; i++ ) {                    // Get input 10 times
			int rand = (int)(Math.random() * 49);           // Random value from 0 to 49
			System.out.print( a[rand][0] );                 // Print out state name
			System.out.print( ": " );                       // Prompt user for capital name
			String b = input.nextLine();                    // Get user input for capital
			b = b.toLowerCase();                            // Convert to lower case, make non case-sensitive
			if ( b.equals( a[rand][1].toLowerCase()) )      // if input equals correct capital name
				count++;                                    // Increment count by one
		} System.out.println( "Total correct: " + count );  // Print out total correct guesses at end of loop
	}                                              
	public static void main(String[] args) {                 // main method
		String[][] capitals = {                              // Array of all 50 states and capitals
			{ "Alabama", 			"Montgomery" },
			{ "Alaska", 			"Juneau" },
			{ "Arizona", 			"Phoenix" },
			{ "Arkansas", 			"Little Rock" },
			{ "California", 		"Sacramento" },
			{ "Colorado", 			"Denver" },
			{ "Connecticut",		"Hartford" },
			{ "Delaware", 			"Dover" },
			{ "Florida", 			"Tallahassee" },
			{ "Georgia", 			"Atlanta" },
			{ "Hawaii", 			"Honolulu" },
			{ "Idaho",	 			"Boise" },
			{ "Illinois", 			"Springfield" },
			{ "Indiana", 			"Indianapolis" },
			{ "Iowa",	 			"Des Moines" },
			{ "Kansas", 			"Topeka" },
			{ "Kentucky", 			"Frankfort" },
			{ "Louisiana", 			"Baton Rouge" },
			{ "Maine",	 			"Augusta" },
			{ "Maryland", 			"Annapolis" },
			{ "Massachusetts", 		"Boston" },
			{ "Michigan", 			"Lansing" },
			{ "Minnesota", 			"St. Paul" },
			{ "Mississippi",		"Jackson" },
			{ "Missouri", 			"Jefferson City" },
			{ "Montana", 			"Helena" },
			{ "Nebraska", 			"Lincoln" },
			{ "Nevada", 			"Carson City" },
			{ "New Hampshire", 		"Concord" },
			{ "New Jersey", 		"Trenton" },
			{ "New Mexico", 		"Santa Fe" },
			{ "New York", 			"Albany" },
			{ "North Carolina",		"Raleigh" },
			{ "North Dakota", 		"Bismarck" },
			{ "Ohio",	 			"Columbus" },
			{ "Oklahoma", 			"Oklahoma City" },
			{ "Oregon", 			"Salem" },
			{ "Pennsylvania",		"Harrisburg" },
			{ "Rhode Island",	 	"Providence" },
			{ "South Carolina",		"Columbia" },
			{ "South Dakota", 		"Pierre" },
			{ "Tennessee", 			"Nashville" },
			{ "Texas",	 			"Austin" },
			{ "Utah",	 			"Salt Lake City" },
			{ "Vermont", 			"Montpelier" },
			{ "Virginia", 			"Richmond" },
			{ "Washington", 		"Olympia" },
			{ "West Virginia", 		"Charleston" },
			{ "Wisconsin", 			"Madison" },
			{ "Wyoming", 			"Cheyenne" }
		};	
		randomElement( capitals );                           // Calling randomElement method
	}	
}