/*
Author: Travis Dowd
Date: 1-27-2020

Chapter 5, Exercise 5-11
*/

class Ex5_11 {
    public static void main(String[] args) {
	// Declare variables
	int number, line;
	line = 0;

	// Print out explanation of program
	System.out.println("Counting from 100 - 200");
	System.out.println("Divisible by 5 or 6, but not both");
	System.out.println("---------------------------------------");

	for(number = 100; number <= 200; number++){
	    if ((number % 5 == 0) || (number % 6 == 0)){
		if ((number % 5 == 0) && (number % 6 == 0))
		    continue;
		System.out.printf("%d ", number);
		line++;
	    } if (line == 10) {
		line = 0;
		System.out.printf("\n");
	    } else
		continue;
	} System.out.printf("\n");	    
    }
}