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
* Since arrays contain the same data type, for loops are perfect for proccessing their data, example:
```java
double[] myList = new double[10];
for ( int i = 0; i < myList.length; i++ ) {
    System.out.print( myList[i] + " ");
}
```
* Java also supports a foreach loop style syntax for manipulaitng arrays, exmaple:
```java
for ( double [[arrow]]e: myList ) {
    System.out.println( e );
}
```
* To copy an array you can either use System.arraycopy
```java
int a[] = {1,2,3,4};
int b[] = new int[a.length];
arraycopy(sourceArray, srcPos, targetArray, tarPos, length);
System.arraycopy(a, 0, b, 0, a.length);
for (int i = 0; i < b.length; i++) {
    System.out.print(b[i] + " ");
}
```

