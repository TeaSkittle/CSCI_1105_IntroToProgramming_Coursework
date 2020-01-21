/*
Author: Travis Dowd
Date: 1-21-2020

Chapter 4, Exercise 4-1
*/

import java.util.Scanner;

class Ex4_1 {
    public static void main(String[] args) {
	// Declare variables
	Scanner input = new Scanner(System.in);
	double Area, s;

	// Get user input
	System.out.print("Enter the legnth from the center to the vertex: ");
	double r = input.nextDouble();
	
	// Logic
	s = (2 * r) * (Math.sin(Math.PI/5));
	Area = (5 * (s * s)) / (4 * (Math.tan(Math.PI/5)));

	// Print out Answer
	System.out.println("The are of the pentagaon is " + Area);
    }
}