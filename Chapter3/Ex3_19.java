/*
Author: Travis Dowd
Date: 1-17-2020

Chapter 3, exercise 3-3
*/

import java.util.Scanner;

class Ex3_19 {
    public static void main(String[] args) {
	// Declare Vairable
	Scanner input = new Scanner(System.in);
	double p;

	// Get user input
	System.out.print("Enter a: ");
	double a = input.nextDouble();
	System.out.print("Enter b: ");
	double b = input.nextDouble();
	System.out.print("Enter b: ");
	double c = input.nextDouble();

	// Logic
	if (( a + b > c ) && ( a + c > b ) && ( b + c > a )) {
	    p = a + b + c;
	    System.out.println("The perimeter is: " + p); 
	} else {
	    System.out.println("ERROR! Triangle is invalid!");
	}
    }
}