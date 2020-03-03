# CSCI 1105 CH8 Notes

### Two-Dimensional Arrays
* Syntax for declaring a two-dimensional array is:
```java
//elementType[][] arrayRefVar;
int[][] matrix;
matrix = new int[5][5]; // Creates a 5x5 array (think of as a table or matrix)
matrix[2][1] = 7;       // Assigns the value 7 at location 2, 1
```
* Each row in a two-dimensional array can have different lengths, for example:
```java
int[][] triangleArray = {
  {1, 2, 3, 4, 5},
  {2, 3, 4, 5},
  {3, 4, 5},
  {4, 5},
  {5}
};
// triangleArray[0].length = 5, triangleArray[4].length = 1
```
* To print a two-dimensional array using nested loops:
```java
for ( int row = 0; row < matrix.length; row++ ) {
  for ( int column = 0; column < matrix[row].length; column++ ) {
    System.out.print( matrix[row][column] + " " );
  }
}
```

### Multidimensional Arrays
* MD arrays are essentialy nested arrays(arrays consiting of arrays)
* "A MD array is actually an array in which each element is an array."
