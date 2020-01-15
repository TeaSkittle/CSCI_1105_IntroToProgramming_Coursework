/*
Author: Travis Dowd
Date: 1-15-2020

Chapter 2, Exercise 2-1
*/

import java.util.Scanner;

class Ex2_1 {
    public static void main(String[] args) {
	// Declare variables
	double f;
	Scanner input = new Scanner(System.in);
	
	// Prompt user for input
	System.out.print("Enter a degree in Celsius: ");
	double c = input.nextDouble();
	
	// Calculate and print answer
	f = ( 9.0 / 5.0 ) * c + 32;
	System.out.println(c + " Celsius is " + f + " Fahrenheit");
    }
}