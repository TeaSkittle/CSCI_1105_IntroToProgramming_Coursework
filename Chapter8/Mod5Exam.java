// Author: Travis Dowd
// Date: 3-4-2020
//
// Module 5 Exam

import java.util.Scanner;

class Mod5ExamPart1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int user = 0;
		
		while (user != 1 && user != 2) {
			System.out.println("Which action would you like to perform?");
			System.out.println("\t1) Print Exam Grades");
			System.out.println("\t2) Track Attendance");
			System.out.print("Choose a menu item: ");

			user = input.nextInt();
		}
		
		if (user == 1) {
			printExam();
		}
		else {
			trackAtt();
		}
	}
	public static void printExam() {					// Method to print exam scores
		Scanner input  = new Scanner( System.in );			// Create new Scanner
		double[] scores;						// Array to store exam scores
		scores = new double[25];					// Set size of array to 25 (number of students)
		int a = 0, b = 0, c = 0, d = 0, f = 0;				// Initialize grades
		double sum = 0, average = 0;					// Declare average and sum, used for calculating avrage
		System.out.print( "\nEnter 25 exam scores: " );			// Prompt user for input
		for ( int i = 0; i < 25; i++ ) {				// Begin looping through scores[] for exam scores
			scores[i] = input.nextDouble();				// Get input for scores[i]
			sum += scores[i];					// Add scores[i] to sum (for average)
			if ( scores[i] > 90.0 && scores[i] < 100.0 ) { a++; }	// Number of A's
			if ( scores[i] > 80.0 && scores[i] < 90.0  ) { b++; }	// Number of B's
			if ( scores[i] > 70.0 && scores[i] < 80.0  ) { c++; }	// Number of C's
			if ( scores[i] > 60.0 && scores[i] < 70.0  ) { d++; }	// Number of D's
			if ( scores[i] < 60.0 && scores[i] > 0.0   ) { f++; }	// Number of F's
		} average = sum / scores.length;				// Divide sum by size of array to get average
		System.out.printf( "\nAverage score: %.2f%%\n", average );	// Print average
		System.out.printf( "Number of A's: %d\n", a );			// Print A's
		System.out.printf( "Number of B's: %d\n", b );			// Print B's
		System.out.printf( "Number of C's: %d\n", c );			// Print C's
		System.out.printf( "Number of D's: %d\n", d );			// Print D's
		System.out.printf( "Number of F's: %d\n", f );			// Print F's
	}
	public static void trackAtt() {						// Method to track attendance of students
		Scanner input  = new Scanner(System.in);                        // Create new Scanner
		int att[][] = new int[5][5];					// Create a 5x5 array for classroom seating
		int days = 0;							// Start days at zero
		System.out.print("\nHow many days would you like to enter? ");  // Prompt user for input
		days = input.nextInt();						// Get number of days to track attendance for
										// Print diagram of classroom
		System.out.println("This is the diagram of your seating chart. Enter attendance to match this chart.\n");
		System.out.println("	   Front of Room");
		System.out.println("|--------------------------------|");
		System.out.println("|  [ 1]  [ 2]  [ 3]  [ 4]  [ 5]  |");
		System.out.println("|  [ 6]  [ 7]  [ 8]  [ 9]  [10]  |");
		System.out.println("|  [11]  [12]  [13]  [14]  [15]  |");
		System.out.println("|  [16]  [17]  [18]  [19]  [20]  |");
		System.out.println("|  [21]  [22]  [23]  [24]  [25]  |");
		System.out.println("|________________________________|");
		
		for (int d = 0; d < days; d++) {				// Loop through each day
			System.out.println("\nDay " + (d+1));			// Print out day before input
			for (int r = 0; r < att.length; r++) {			// Loop through each row
				System.out.print("Enter 5 numbers for row "		
				+ r + " (1 = absent, 0 = present): ");		// Prompt user for input
				for (int c = 0; c < att[r].length; c++) {	// Loop through each column
					att[r][c] = input.nextInt() + att[r][c];// Increment attendance if missed
				}
			}
		}  // Display seating chart showing number of absences;
		System.out.println("\nStudent Attendance: ");			// Begin printing of attendance
		for (int r = 0; r < att.length; r++) {				// Loop through each row
			System.out.print( "\n" );				// Print new line
			for (int c = 0; c < att[r].length; c++) {		// Loop through each column
				System.out.print( att[r][c] + " " );		// Print out attendance
			}
		}		
	}
}
