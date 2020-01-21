/*
Author: Travis Dowd
Date: 1-21-2020

Sample input/output:
	distance = 100,  cost = $5.00
	distance = 500,  cost = $8.00
	distance = 550,  cost = $10.00
	distance = 1000, cost = $12.00
*/
class Mod2ExamPart1 {
	public static void main(String[] args) {
		int distance = 100;
		double cost = 0.0;
		
		if (distance < 0) {
		    cost = 0;
		} else if (distance <= 100) {
		    cost = 5.0;
		} else if (distance > 100 && distance < 500) {
		    cost = 8.0;
		} else if (distance > 500 && distance < 1000) {
		    cost = 10.0;
		} else {
		    cost = 12.0;
		} System.out.printf("For the package to travel %d miles it would cost $%.02f.\n", distance, cost);
	}
}

// Type 3 gives you far more control over the logic of the program.  Type 1 and 2 only allow for the base amount to be decided two ways, where as type 3 allows for as many as you want(all though a switch statement may be better, would also avoid nested if else statement to improve both speed and readability). Type 3 can result in many different base amounts, where as the other two are far more limited.
