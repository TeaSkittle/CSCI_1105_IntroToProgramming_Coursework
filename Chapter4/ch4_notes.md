# CSCI 1105 CH4 Notes

### Useful Math Functions
* toDegree(radians) - Returns the angle in degress for the angle in radians
* sin(radians) - Returns the trigonometric sine of an angle in radians
  1. Also can do cos(radians) and tan(radians)
* exp(x) - Returns e raised to power of x (e^x)
* log(x) - Returns the natural logarithm of x
* pow(a, b) - Returns a raised to the power of b (a^b)
* sqrt(x) - Returns the square root of x
* ceil(x) - x is rounded up to the nearest integer
* floor(x) - x is rounded down to the nearest integer
* abs(x) - Return the absolute value of the number

### Random Numbers
* (int)(Math.random() * 10)- Returns a random integer between 0 and 9
* In general, this code will return a number betweem a and a+b, excluding a + b:
```java
a + Math.random() * b
```