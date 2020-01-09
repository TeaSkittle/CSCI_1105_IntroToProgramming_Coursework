/*
Author: Travis Dowd
Date: 1-9-2020

Chapter 1, Exercise 1-13
*/

class Ex1_13 {
    public static void main(String[] args) {
	double a, b, c, d, e, f, x, y;
	a = 3.4;
	b = 50.2;
	c = 2.1;
	d = 0.55;
	e = 44.5;
	f = 5.9;
	x = (((e * d) - (b * f))/((a * d) - (b * c)));
	y = (((a * f) - (e * c))/((a * d) - (b * c)));
	System.out.println("x = " + x);
	System.out.println("y = " + y);
    }
}