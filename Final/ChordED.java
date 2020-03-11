// Title: ChordED
// Author: Travis Dowd
// Start Date: 3-6-2020
// End Date: 
//
// Intro to Programming: Final Project
//
// TODO:
//	- Add JavaDocs comments
//	- The above means this needs be ported into Eclipse
//	- Add more detailed comments via Carmac style
//

import java.util.Scanner;
import java.io.*;

class ChordED {
	public static void main( String[] args ) throws IOException {
		// Variables
		Scanner input = new Scanner( System.in );
		String name = "";
		String[][] guitar = { 
			{ "-", "-", "-", "-", "-", "-", "-", "-", "-", "-" }, { "-", "-", "-", "-", "-", "-", "-", "-", "-", "-" },
			{ "-", "-", "-", "-", "-", "-", "-", "-", "-", "-" }, { "-", "-", "-", "-", "-", "-", "-", "-", "-", "-" },
			{ "-", "-", "-", "-", "-", "-", "-", "-", "-", "-" }, { "-", "-", "-", "-", "-", "-", "-", "-", "-", "-" }
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
	}  // Get input from user
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
	}  // Print out chord after inputed
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
	}  // Write chord to .txt file in chords dir
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
	} // Print out all saved chords > more
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
	} // Manage cmd line args
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
