/**
*	<h1> ChordED </h1>
*	<p> Intro to Programming: Final Project </p>
*	<p> Start Date: 3-6-2020 </p>
*	<p> End Date: 3-12-2020 </p>
*	@author Travis Dowd
*	@version 1.0
*/

import java.util.Scanner;
import java.io.*;

public class ChordED {
	/**
	* 	<p>Main method, if no command line arguments are supplied
	* 		variables are initialized and user is prompted for input.</p>
	* 
	*	@param args (String[]; command line arguments)
	*	@throws IOException (throws; for file handling)
	*/
	public static void main( String[] args ) throws IOException {		// throw IOExpection for file handling
		Scanner input = new Scanner( System.in );			// Create new Scanner
		String name = "";						// Empty string for chord name
		String[][] guitar = { 						// Array to store chord
			{ "-", "-", "-", "-", "-", "-", "-", "-", "-", "-" },	// String: high E 
			{ "-", "-", "-", "-", "-", "-", "-", "-", "-", "-" },	// String: B
			{ "-", "-", "-", "-", "-", "-", "-", "-", "-", "-" },	// String: G
			{ "-", "-", "-", "-", "-", "-", "-", "-", "-", "-" },	// String: D
			{ "-", "-", "-", "-", "-", "-", "-", "-", "-", "-" },	// String: A
			{ "-", "-", "-", "-", "-", "-", "-", "-", "-", "-" }};	// String: Low E	
		if ( args.length == 0 ) {					// Command line args
			System.out.print( "Enter name of chord: " );		// Get user input
			name = input.nextLine();				// Name of chord inputed
			getInput(   guitar, name );				// Get input from user
			printChord( guitar, name );				// print out inputed chord
			writeFile(  guitar, name );				// save chord to text file
		} else if ( args.length > 0 ) {					// If command line argument is supplied,
			cmdLineArgs( args, guitar );				// call cmdLineArgs
		}
	}
	/**
	*	<p> Get variables from user, and assign them to an array </p>
	*	<p> Get these variables from the user:</p>
	*	<ul>
	*		<li>fret</li>
	*	</ul>
	*	<p> fret is then converted into a string and stored as strFret </p>
	*
	*	@param chord (String[][]; Array used for storing the users input of the chord)
	*	@param title (String; name of the chord inputed)
	*/
	public static void getInput( String[][] chord, String title ) {
		Scanner input = new Scanner( System.in );			// Create new Scanner
		for ( int i = 0; i < 6; i++ ) {					// Loop though array for string number
			int j = i + 1;						// have array go from 1-6 ( instead of 0-5)
			switch ( j ) {						// Use switch statement for string selection
				case 1: System.out.print( "Enter fret to played on high E: " ); break;
				case 2: System.out.print( "Enter fret to played on B: " );      break;
				case 3: System.out.print( "Enter fret to played on high G: " ); break;
				case 4: System.out.print( "Enter fret to played on D: " );      break;	
				case 5: System.out.print( "Enter fret  to played on high A: " );break;
				case 6: System.out.print( "Enter fret to played on low E: " );  break;							
			} int fret = input.nextInt();				// Get fret number from user
			if ( fret > 9 ) { 					// If fret higher than 9, mark string as muted
				String strFret = "X"; 				// Muted string gets assigned "X"
				fret = 0;					// Place "X" at chord[i][0]
				chord[i][fret] = strFret;			// Assign "X" to chord[i][0]
			} else {						// If fret is less than 9
				String strFret = Integer.toString( fret );	// Convert int fret to str strFret
				chord[i][fret] = strFret;			// Assign strFret to chord[i][fret]
			} 
		}
	} 
	/**
	*	<p> Print out the chord after user has input the values </p>
	*
	*	@param chord (String[][]; Array used for storing the users input of the chord)
	*	@param title (String; name of the chord inputed)
	*/
	public static void printChord( String[][] chord, String title ) {		
		System.out.printf( "\t%s\n", title );				// Print chord name above chord
		System.out.println( "   ---------------------" );		// Start fret board of guitar
		for ( int i = 0; i < 6; i++ ) {					// Loop through each guitar string
			System.out.print( chord[i][0] + " || " );		// Create cleaner formatting of array
			for ( int j = 1; j < 10; j++ ) {			// Loop through fret of guitar
				System.out.print( chord[i][j] + " " );		// Print chord[i][j] with space
				if ( j == 9 ) { 				// If fret if is 9, add newline at end
					System.out.print( "||\n" );		// Create cleaner formatting of array
				}
			}
		} System.out.println ("   ---------------------" );		// End fret board of guitar
	}
	/**
	*	<p> Write chord to text file in chords/ directory </p>
	*
	*	@param chord (String[][]; Array used for storing the users input of the chord)
	*	@param title (String; name of the chord inputed)
	*	@throws IOException (throws; for file handling)
	*/
	public static void writeFile( String[][] chord, String title ) throws IOException {	// throw IOExpection for file handling
		try (FileWriter fileWriter = new FileWriter( "chords/" + title + ".txt" )) {	// Create new file to write to
			fileWriter.write( "\t" + title + "\n" );				// Write chord name to file
			fileWriter.write( "   ---------------------\n" );			// Start fret board of guitar 
			for ( int i = 0; i < 6; i++ ) {						// Loop through each guitar string
				fileWriter.write( chord[i][0] + " || " );			// Write clean formatting of array
				for ( int j = 1; j < 10; j++ ) {				// Loop through fret of guitar
					fileWriter.write( chord[i][j] + " " );			// Write chord[i][j] with space
					if ( j == 9 ) { 					// If fret if is 9, add newline at end
						fileWriter.write( "||\n" );			// Write clean formatting of array
					}
				}
			} fileWriter.write ( "   ---------------------\n" );			// End fret board of guitar
		}
	}
	/**
	*	<p> Print out all saved chords and pipe into less. </p>
	*	<p> This method calls an external shell script ( printChords.sh )
	*		which should be placed in the same directory as the
	*		compiled ChordED program. </p>
	*/
	public static void listChords() {
		try {
			Runtime run = Runtime.getRuntime();						// Create new Runtime
			Process ps  = run.exec( "./printChords.sh" );					// Create process set to ./printChords.sh
			ps.waitFor();									// Wait until process is finished
			BufferedReader buff = new BufferedReader( new InputStreamReader(ps.getInputStream()) );	// Create new buffer for reading shell script
			String line = "";								// Empty String
			while ( (line = buff.readLine()) != null ) {					// While line in process is not NULL
				System.out.println( line );						// Print out line
			} buff.close();									// Close buffer
		} catch ( Exception ex ) {								// If process fails
			ex.printStackTrace();								// Print stack trace
		}
	}
	/**
	*	<p> Manage command line arguments </p>
	*	<p> Available arguments: </p>
	*	<ul>
	*		<li>-h  Show help</li>
	*		<li>-l  Print out saved chords</li>
	*		<li>-n  Create new chord, example:</li>
	*	</ul>
	*	<p> $ java ChordED -n Em </p>
	*
	*	@param args (String[]; array of command line arguments)
	*	@param guitar (String[][]; Array that is used for storing the guitar chord)
	*	@throws IOException (throws; for file handling)
	*/
	public static void cmdLineArgs( String[] args, String[][] guitar ) throws IOException {		// throw IOExpection for file handling
		Scanner input = new Scanner( System.in );						// Create new Scanner
		String name = "";									// Empty string name for chord title
		if ( args[0].equals("-h") ) { 								// Display help
			System.out.printf( "Command line options: \n" );
			System.out.printf( "\t -h\t Show help\n" );
			System.out.printf( "\t -l\t List saved chords\n" );
			System.out.printf( "\t -n\t Create new chord. Follow '-n' with name of chord, for example: \n" );
			System.out.printf( "\t\t\t $ java ChordED -n Em\n" );
		} else if ( args[0].equals("-l") ) {							// List saved chords
			listChords();									// Call listChords() method
		} else if ( args[0].equals("-n") ) {							// create new chord
			try {
				name = args[1];								// Set name = args[1]
				getInput(   guitar, name );						// Get input for chord
				printChord( guitar, name );						// Print out chord inputed
				writeFile(  guitar, name );						// Save chord to text file
			}
			catch( Exception e ) {								// Print error message
				System.out.println("Error: empty chord name!");				// Chord name is empty, close program
			}
		}
	}
}

