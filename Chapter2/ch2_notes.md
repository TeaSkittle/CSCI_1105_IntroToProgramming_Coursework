# CSCI 1105 CH2 Notes

### Variables
* Use _double_ for floating point numbers
* Can use + for addition and concatente strings, ex:
```java
System.out.println("hello" + "world");
```
* Remember that Java is case sensitive, so carefully name vriables.
* To declare a constant variable, use the __final__ keyword, ex:
```java
final double PI = 3.14; // Declares a constant variable named pi
```
  * A constant variable doesnt change, hence the keyword constant/final

### Importing/Including
* Can import packages two ways, either specific or using a wildard:
  1. import java.util.Scanner;
  2. import java.util.*;
* There is no performance difference between the two

### Input & Output
* Java uses System.out to refer to stdout and System.in for stdin
* To get input from user, must create a scanner object, ex:
```java
import java.util.Scanner; // Scanner is in the java.util package

class ScannerExample{
      public static void main(String[] args){
      	     //Create scanner object named input
      	     Scanner input = new Scanner(System.in);
	     //Create a simple prompt
	     System.out.print("Enter a number: ");
	     //Tell input object to get double from stdin
      	     double userNumber = input.nextDouble();
	     //Print userNumber to stdout
	     System.out.println("You enetered " + userNumber);
      }
}
```
* Can use nextDouble(), nextInt(), etc... to get a value from the user

### Naming Conventions
* Variables and methods should be lowercase, if name is multe words use Camel Case
```java 
int a, brick, brickHouse;
```
* Classes should start with uppercase, and than use Pascal Case
```java
public class BrickHouse {
```
* Capatalize every letter in a constant and spereate with underscores, like #define in C
```java
final int BRICKS_NEEDED = 200;
```

### Math Operations
* Unary operators have only one operator, a binary operator has two
* Has the same operators as C: +  -  *  /  %
* Extra math functions need to be included
```java
import java.util.Math;
```
* Exponents are done with: Math.pow(a, b), ex:
```java
System.out.println(Math.pow(2, 3)); //Prints out 8.0
```
* A __literal__ is a _constant value_ that appears directly in a program
* For better readability, Java allows underscores between two digits in a literal number
```java
long ssn = 232_45_4519;
```
* Has C assignment operators: +=  -=  *=  /=  %=
* Has C increment & decrement operators: ++  --
* Type casting = convert to another data type, ex:
```java
double tax = 0.06;
System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
```

### Misc
* To get current time from the UNIX Epoch
```java
System.currentTimeMillis();
```
* Would have to do more math to print out GMT time
