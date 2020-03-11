/**
*	<h1> ChordED </h1>
*	<p> Intro to Programming: Final Project </p>
*	<p> Start Date: 3-6-2020 </p>
*	<p> End Date: </p>
*	@author Travis Dowd
*	@version 1.0
*/

// TODO:
//	- Port into eclipse and make JavaDocs folder
//	- Add more detailed comments via Carmac style
//	- Fix crash on empty -n arg

import java.util.Scanner;
import java.io.*;

class ChordED {
	/**
	* 	<p>Main method, initializes variables and beings to get user input.</p>
	*	@param args (String[]; command line aruments)
	*/
	public static void main( String[] args ) throws IOException {
		// Variables
		Scanner input = new Scanner( System.in );
		String name = "";
		String[][] guitar = { 
			{ "-", "-", "-", "-", "-", "-", "-", "-", "-", "-" },
			{ "-", "-", "-", "-", "-", "-", "-", "-", "-", "-" },
			{ "-", "-", "-", "-", "-", "-", "-", "-", "-", "-" },
			{ "-", "-", "-", "-", "-", "-", "-", "-", "-", "-" },
			{ "-", "-", "-", "-", "-", "-", "-", "-", "-", "-" },
			{ "-", "-", "-", "-", "-", "-", "-", "-", "-", "-" }
		};	
		// Command line args
		if ( args.length == 0 ) {
			// Get user input
			System.out.print( "Enter name of chord: " );
			name = input.nextLine();
			// Call methods for logic of program
			getInput( guitar, name );
			printChord( guitar, name );
			writeFile( guitar, name );
		} else if ( args.length > 0 ) {
			cmdLineArgs( args, guitar );
		}
	}
	/**
	*	<p> Get input from user </p>
	*	@param chord (String[][]; Array used for storing the users input of the chord)
	*	@param title (String; name of the chord inputted)
	*/
	public static void getInput( String[][] chord, String title ) {
		Scanner input = new Scanner( System.in );
		for ( int i = 0; i < 6; i++ ) {
			int j = i + 1;
			switch ( j ) {
				case 1:
					System.out.print( "Enter fret to played on high E: " ); break;
				case 2:
					System.out.print( "Enter fret to played on B: " );      break;
				case 3:
					System.out.print( "Enter fret to played on high G: " ); break;
				case 4:
					System.out.print( "Enter fret to played on D: " );      break;	
				case 5:
					System.out.print( "Enter fret  to played on high A: " );break;
				case 6:
					System.out.print( "Enter fret to played on low E: " );  break;							
			}
			int fret = input.nextInt();
			if ( fret > 9 ) { 		// If fret hgher than 9, mark string as muted
				String strFret = "X"; 
				fret = 0;
				chord[i][fret] = strFret;
			} else {
				String strFret = Integer.toString( fret );
				chord[i][fret] = strFret;
			} 
		}
	} 
	/**
	*	<p> Print out the chord after user has input the values </p>
	*	@param chord (String[][]; Array used for storing the users input of the chord)
	*	@param title (String; name of the chord inputted)
	*/
	public static void printChord( String[][] chord, String title ) {
		System.out.printf( "\t%s\n", title );
		System.out.println( "   ---------------------" );
		for ( int i = 0; i < 6; i++ ) {
			System.out.print( chord[i][0] + " || " );
			for ( int j = 1; j < 10; j++ ) {
				System.out.print( chord[i][j] + " " );
				if ( j == 9 ) { 
					System.out.print( "||\n" );
				}
			}
		} System.out.println ("   ---------------------" );
	}
	/**
	*	<p> Write chord to .txt file in chords/ dir </p>
	*	@param chord (String[][]; Array used for storing the users input of the chord)
	*	@param title (String; name of the chord inputted)
	*/
	public static void writeFile( String[][] chord, String title ) throws IOException {
		try (FileWriter fileWriter = new FileWriter( "chords/" + title + ".txt" )) {
			fileWriter.write( "\t" + title + "\n" );
			fileWriter.write( "   ---------------------\n" );
			for ( int i = 0; i < 6; i++ ) {
				fileWriter.write( chord[i][0] + " || " );
				for ( int j = 1; j < 10; j++ ) {
					fileWriter.write( chord[i][j] + " " );
					if ( j == 9 ) { 
						fileWriter.write( "||\n" );
					}
				}
			} fileWriter.write ( "   ---------------------\n" );
		}
	}
	/**
	*	<p> Print out all saved chords and pipe into less </p>
	*	@param chord (String[][]; Array used for storing the users input of the chord)
	*	@param title (String; name of the chord inputted)
	*/
	public static void listChords() {
		try {
			Runtime run = Runtime.getRuntime();
			Process ps  = run.exec("./printChords.sh");
			ps.waitFor();
			BufferedReader buff = new BufferedReader(new InputStreamReader(ps.getInputStream()));
			String line = "";
			while ((line = buff.readLine()) != null) {
				System.out.println(line);
			} buff.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	/**
	*	<p> Manage command line args </p>
	*	@param args (String[]; array of command line arguments)
	*	@param guitar (String[][]; Array that is used for storing the guitar chord)
	*/
	public static void cmdLineArgs( String[] args, String[][] guitar ) throws IOException {
		Scanner input = new Scanner( System.in );
		String name = "";
		if ( args[0].equals("-h") ) { 
			System.out.printf("Command line options: \n");
			System.out.printf("\t -h\t Show help\n");
			System.out.printf("\t -l\t List saved chords\n");
			System.out.printf("\t -n\t Create new chord. Follow '-n' with name of chord, for example: \n");
			System.out.printf("\t\t\t $ java ChordED -n Em\n");
		} else if ( args[0].equals("-l") ) {
			listChords();
		} else if ( args[0].equals("-n") ) {
			name = args[1];
			getInput( guitar, name );
			printChord( guitar, name );
			writeFile( guitar, name );
		}
	}
}
