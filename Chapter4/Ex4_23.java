/*
Author: Travis Dowd
Date: 1-21-2020

Chapter 4, Exercise 4-23
*/

import java.util.Scanner;

class Ex4_23 {
    public static void main(String[] args) {
	// Declare variables
	Scanner input = new Scanner(System.in);
	//String name;
	double gross, federal, state, net;

	// Get user input
	System.out.print("Enter employee's name: ");
	String name = input.next();
	System.out.print("Enter number of hours worked: ");
	double hours = input.nextDouble();
	System.out.print("Enter hourly pay rate: ");
	double rate = input.nextDouble();

	// Logic
	gross = hours * rate;
	federal = gross * 0.2;
	state = gross * 0.09;
	net = gross - (federal + state);

	// Output
	System.out.println("Employee's Name: " + name);
	System.out.println("Hours Worked: " + hours);
	System.out.println("Pay Rate: " + rate);
	System.out.println("Gross Pay: " + gross);
	System.out.println("Deductions: ");
	System.out.printf("\tFederal Withholding: $%.02f\n", federal);
	System.out.printf("\tState Withholding: $%.02f\n", state);
	System.out.printf("Net Pay: $%.02f\n", net);
    }
}