/*
Author: Travis Dowd
Date: 1-17-2020

Chapter 3, Exercise 3-3
*/

import java.util.Scanner;

class Ex3_3 {
    public static void main(String[] args) {
	// Declare variables
	Scanner input = new Scanner(System.in);
	double x, y;

	// Get user input for variables a through f
	System.out.print("Enter a: ");
	double a = input.nextDouble();
	System.out.print("Enter b: ");
	double b = input.nextDouble();
	System.out.print("Enter c: ");
	double c = input.nextDouble();
	System.out.print("Enter d: ");
	double d = input.nextDouble();
	System.out.print("Enter e: ");
	double e = input.nextDouble();
	System.out.print("Enter f: ");
	double f = input.nextDouble();

	// Logic
	if ((( a * d ) - ( b * c )) == 0) {
	    System.out.println("ERROR! Cannot divide by zero!");
	} else {
	    x = (((e * d) - (b * f))/((a * d) - (b * c)));
	    y = (((a * f) - (e * c))/((a * d) - (b * c)));
	    System.out.println("x = " + x);
	    System.out.println("y = " + y);
	}
    }
}