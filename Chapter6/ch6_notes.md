# CSCI 1105 CH6 Notes

### Methods
* Think of methods as a funciton in C
```java
// Add a plus b
public static int sum(int a, int b) {
    int result = 0;
    result = a + b;
    return result;
}

public static void main(String[] args) {
    System.out.println("Sum of 1 plus 10 is " + sum(1, 10);
}
```
* Syntax of defining a method:
```java
modifier returnValueType methodName(list of parameters) {
  // Method body;
}
```
* Parameters are optional, for example _Math.random()_ has no parameters

# Left off on 6.2 Reusing method