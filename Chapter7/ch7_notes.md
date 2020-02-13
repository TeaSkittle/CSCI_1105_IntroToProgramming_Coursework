# CSCI 1105 CH7 Notes

### Array Basics
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
* You can pass an array to a method: _public static void array( int[] a )_
* A method can also return an array: _return array;_
* Can declare a method with variable array size: _public int array( int... a)_
* java.Utils.Arrays contains several useful methods to manipulate and handle arrays

### Arrays & Loops
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

### Copying Arrays
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

### Command-Line Arguments
* The main method takes string arguments _public statc void main(String[] args)_
* Arguments are referenced with: args[0], args[1], args[2] (just like an array)

