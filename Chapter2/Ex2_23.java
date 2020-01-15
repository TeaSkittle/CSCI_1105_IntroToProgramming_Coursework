/*
Author: Travis Dowd
Date: 1-15-2020

Chapter 2, Exercise 2-23
*/

import java.util.Scanner;

class Ex2_23 {
    public static void main(String[] args) {
	double trip;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the driving distance: ");
	double miles = input.nextDouble();
	System.out.print("Enter miles per gallon: ");
	double mpg = input.nextDouble();
	System.out.print("Enter price per gallon: ");
	double ppg = input.nextDouble();
	trip = ( miles / mpg) * ppg;
	System.out.println("The cost of driving is: $" + trip);
    }
}
