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
* To invoke a method from another class: `ClassName.methodName`
* A void method does not return a value
* You can use _return;_ to terminate a void method early, example:
```java
public static void printGrade(double score) {
  if (score < 0 || score > 100) {
    System.out.println("Invalid score");
    return;  // This acts like a break statement in a loop
  }
  if (score >= 90) {
    System.out.println('A');
  }
  // etc...
}
```

### The Stack
* Also refered to as: _execution stack, runtime stack, call stack, or machine stack_
* Each time a method is invoked, the system creates an activation record and stores it in a stack. (Pushed onto the stack)
* When a method finishes its work, it is removed from the stack (popped from the stack)


# Left off on 6.7