# CSCI 1105 CH7 Notes

### Arrays
* To declare an array, use this syntax:
```java
// elementType[] arrayRefVar;
double[] myList;
```
* You can also declare arrays using C syntax:
```java
// elementType arrayRefVar[]
double myList[];
```
* Declaring an array variable, creating an array, and assigning the reference of the array to the variable can be combined in one statement as:
```java
double[] myList = new double[10];  // double[0 to 9]
```
* Arrays range from 0 to array.length-1
* Two different ways of assigns value to index of array:
```java
// Method one:
double[] myList = new double[3];
myList[0] = 0;
myList[1] = 1;
myList[2] = 2;

//Method Two
double[] myList = { 0, 1, 2 };
```
* This will cause a syntax error:
```java
double[] myList;
myList = { 0, 1, 2 };
```

