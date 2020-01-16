# CSCI 1105 CH3 Notes

### Control Flow
* Java has boolean data types: *true, false*
  1. Can't use 1 or 0 for boolean, must use above keywords 
* Can use *if*, *else*, and *else if* for flow control
* Java supports these logical operators:
Operator | Name 
 ---  | --- 
 ! | not  
 && | and 
 2 pipes | or  
 ^ | xor

### Random Number Generation
* Math.random() will achieve a random double between 0.0 and 1.0 (excluding 1.0)
* To generate a random singl didgit integer:
```java
int number = (int)(Math.random() * 10);
```
* To generate random values within a given range:
```java
double x = (Math.random() * ((max - min) + 1)) + min;
```
