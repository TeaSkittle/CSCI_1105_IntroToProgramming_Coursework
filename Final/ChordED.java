// Title: ChordED
// Author: Travis Dowd
// Start Date: 3-6-2020
// End Date: 
//
// Intro to Programming: Final Project

import java.util.Scanner;
import java.io.*;

class ChordED {
	public static void main( String[] args ) throws IOException {
		Scanner input = new Scanner( System.in );
		String name = "";
		String[][] guitar = { 
			{ "-", "-", "-", "-", "-", "-", "-", "-" }, { "-", "-", "-", "-", "-", "-", "-", "-" },
			{ "-", "-", "-", "-", "-", "-", "-", "-" }, { "-", "-", "-", "-", "-", "-", "-", "-" },
			{ "-", "-", "-", "-", "-", "-", "-", "-" }, { "-", "-", "-", "-", "-", "-", "-", "-" }
		};	
		System.out.print( "Enter name of chord: " );
		name = input.nextLine();
		getInput( guitar, name );
		printChord( guitar, name );
		writeFile( guitar, name );
	}
	public static void getInput( String[][] chord, String title ) {
		Scanner input = new Scanner( System.in );
		for ( int i = 0; i < 6; i++ ) {
			int j = i + 1;
			switch (j) {
				case 1:
					System.out.print( "Enter fret to played on high E: " );
					break;
				case 2:
					System.out.print( "Enter fret to played on B: " );
					break;
				case 3:
					System.out.print( "Enter fret to played on high G: " );
					break;
				case 4:
					System.out.print( "Enter fret to played on D: " );
					break;	
				case 5:
					System.out.print( "Enter fret  to played on high A: " );
					break;
				case 6:
					System.out.print( "Enter fret to played on low E: " );
					break;							
			}
			int fret = input.nextInt();
			String strFret = Integer.toString( fret );
			chord[i][fret] = strFret;
		}
	}
	public static void printChord( String[][] chord, String title ) {
		System.out.printf( "\t%s\n", title );
		System.out.println( "   -----------------" );
		for ( int i = 0; i < 6; i++ ) {
			System.out.print( chord[i][0] + " || " );
			for ( int j = 1; j < 8; j++ ) {
				System.out.print( chord[i][j] + " " );
				if ( j == 7 ) { 
					System.out.print( "||\n" );
				}
			}
		} System.out.println ("   -----------------" );
	}
	public static void writeFile( String[][] chord, String title ) throws IOException {
		try (FileWriter fileWriter = new FileWriter( "lib/" + title + ".txt" )) {
			fileWriter.write( "\t" + title + "\n" );
			fileWriter.write( "   -----------------\n" );
			for ( int i = 0; i < 6; i++ ) {
				fileWriter.write( chord[i][0] + " || " );
				for ( int j = 1; j < 8; j++ ) {
					fileWriter.write( chord[i][j] + " " );
					if ( j == 7 ) { 
						fileWriter.write( "||\n" );
					}
				}
			} fileWriter.write ( "   -----------------" );
		}
	}
}
