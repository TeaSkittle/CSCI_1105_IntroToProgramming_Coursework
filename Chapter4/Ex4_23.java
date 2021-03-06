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
        double gross, federal, state, totalDeduct, net;

        // Get user input
        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalInput = input.nextDouble();
        System.out.print("Enter state tax withholding: ");
        double stateInput = input.nextDouble();

        // Logic
        gross = hours * rate;
        federal = gross * federalInput;
        state = gross * stateInput;
        totalDeduct = federal + state;
        net = gross - totalDeduct;

        // Output
        System.out.println("Employee's Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: " + rate);
        System.out.printf("Gross Pay: $%.2f\n", gross);
        System.out.println("Deductions: ");
        System.out.printf("\tFederal Withholding: $%.2f\n", federal);
        System.out.printf("\tState Withholding: $%.2f\n", state);
        System.out.printf("\tTotal Deduction: $%.2f\n", totalDeduct);
        System.out.printf("Net Pay: $%.2f\n", net);
    }
}