/*
Author: Travis Dowd
Date: 1-27-2020

Chapter 5, exercise 5-49
*/
import java.util.Scanner;

class Ex5_49 {
    public static void main(String[] args) {
	// Declare variables
	int ch, c, v;  // ch = char
	c = 0;  // consonants
	v = 0;  // vowels

	// Get user input
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a string: ");
	String str = input.next();
	str = str.toUpperCase();

	//Main loop
	for(ch = 0; ch < str.length(); ch++) {
	    switch (str.charAt(ch)) {
	    case 'A': v++; break;
	    case 'E': v++; break;
	    case 'I': v++; break;
	    case 'O': v++; break;
	    case 'U': v++; break;
	    default: c++; break;
	    }
	}

	// Print out answer
	System.out.println("Vowels: " + v);
	System.out.println("Consonants: " + c);
    }
}