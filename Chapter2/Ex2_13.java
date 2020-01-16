/*
Author: Travis Dowd
Date: 1-15-2020

Chapter 2, Exercise 2-13
*/

import java.util.Scanner;

class Ex2_13 {
    public static void main(String[] args) {
	// Declare variables
	Scanner input = new Scanner(System.in);
	double a, b;

	// Prompt user for input
	System.out.print("Enter a monthly savings amount: ");
	double userNumber = input.nextDouble();

	// Logic
	a = userNumber * (1 + 0.00417);
	for(int x = 1; x < 6; x++) {
	    b = userNumber + a;
	    a = b * (1 + (0.05 /12));
	}

	// Print out a
	System.out.println("After the sixth month, the account value is " + a);
    }
}