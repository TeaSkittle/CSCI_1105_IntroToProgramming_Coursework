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
		int[] finger = new int[6];
		String name = "";
		String[][] guitar = { 
			{ "-", "-", "-", "-" }, { "-", "-", "-", "-" }, { "-", "-", "-", "-" },
			{ "-", "-", "-", "-" }, { "-", "-", "-", "-" }, { "-", "-", "-", "-" }
		};
		
		System.out.print( "Enter name of chord: " );
		name = input.nextLine();
		
		getInput( guitar, finger, name );
		printChord( guitar, finger, name );
		writeFile( guitar, finger, name );
	}
	public static void getInput( String[][] chord, int[] fing_pos, String title ) {
		Scanner input = new Scanner( System.in );
		for ( int i = 0; i < 6; i++ ) {
			int j = i + 1;
			System.out.print( "Enter fret to played on string " + j + ": " );
			int fret = input.nextInt();
			chord[i][fret] = "O";
		}
	}
	public static void printChord( String[][] chord, int[] fing_pos, String title ) {
		System.out.printf( "\t%s\n", title );
		System.out.println( "   -------------" );
		for ( int i = 0; i < 6; i++ ) {
			System.out.print( chord[i][0] + " || " );
			for ( int j = 1; j < 4; j++ ) {
				System.out.print( chord[i][j] + " | " );
				if ( j == 3 ) { 
					System.out.print( fing_pos[i] + "\n" );
				}
			}
		} System.out.println ("   -------------" );
	}
	public static void writeFile(String[][] chord, int[] fing_pos, String title ) throws IOException {
		try (FileWriter fileWriter = new FileWriter( "lib/" + title + ".txt")) {
			fileWriter.write( "\t" + title + "\n" );
			fileWriter.write( "   -------------\n" );
			for ( int i = 0; i < 6; i++ ) {
				fileWriter.write( chord[i][0] + " || " );
				for ( int j = 1; j < 4; j++ ) {
					fileWriter.write( chord[i][j] + " | " );
					if ( j == 3 ) { 
						fileWriter.write( fing_pos[i] + "\n" );
					}
				}
			} fileWriter.write ("   -------------" );
		}
	}
}
