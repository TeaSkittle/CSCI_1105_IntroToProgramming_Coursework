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
	double a, b, c;

	// Promt user for input
	System.out.print("Enter a monthly savings amount: ");
	double userNumber = input.nextDouble();

	// Sloppy logic
	a = (userNumber + 100.417) * (1 + 0.00417);
	b = (userNumber + a) * (1 + 0.00417);
	c = (userNumber + b) * (1 + 0.00417);
	a = (userNumber + c) * (1 + 0.00417);
	b = (userNumber + a) * (1 + 0.00417);
	System.out.println("After the sixth month, the acocunt value is " + b);
    }
}