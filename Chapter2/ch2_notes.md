# CSCI 1105 CH2 Notes

### Variables
* Use _double_ for floating point numbers
* Can use + for addition and concatente strings, ex:
```java
System.out.println("hello" + "world");
```

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


