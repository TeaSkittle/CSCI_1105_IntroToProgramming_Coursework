# CSCI 1105 CH4 Notes

### Useful Math Functions
* toDegree(radians) - Returns the angle in degress for the angle in radians
* sin(radians) - Returns the trigonometric sine of an angle in radians
  * Also can do cos(radians) and tan(radians)
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

### Char Data Type
* char data type represents a single character
```java
char letter = 'A';
char numChar = '4';

/* The first statement assigns A the char variable letter, the second
statement assigns digit character 4 to the char variable numChar */
```
* A string litteral must be enclosed in quotations marks(" ")
* A character literal must be enclosed in single quotes(' ')
  * Therefore "A" is a string and 'A' is a character
* To use unicode character in your code, preceed hex code with \u
```java
char letter = '\u03b1' //the Greek letter alpha
```
* Any positive integer between 0 anf FFFF in hex can be cast into a char implicitly
* All numeric operators can be applied to char operands:
```java
int i = '2' + '3';               // (int)'2' is 50 and (int)'3' is 51
System.out.println("i is " + i); // i is 101
int j = 2 + 'a';                 // (int)'a' is 97
System.out.println("j is " + j); // j is 99
System.out.println(j + " is the Unicode for character " 
  + (char)j);                    // 99 is the Unicode for character c

/*
This would display:

i is 101
j is 99
99 is the Unicode for character
*/
```

### String Data Type
* To represent a string of character, use the *String* data type
```java
String message = "Hello World!";
```
* Simple methods for *String* objects:
  * length() - Returns hte number of characters in this string
  * charAt(index) - Returns the characters at the specified index from this string
  * concat(s1) - Returns a new string the concatenates this string with string s1
  * toUpperCase() - Returns a new string with all uppercase letters
  * toLowerCase() - Returns a new string with all lowercase letters
  * trim() - Returns a new string with withspace characters trimmed from both sides
* To read a sring from the console, invoke the next() methos on a Scanner object:
```java
Scanner input = new Scanner(System.in);
System.out.print("Enter a tring: ");
String s1 = input.next();
```
* Comparison methods for *String* methods:
  * equal(s1) - Returns true if this string is euqal to string s1
  * equalsIgnoreCase(s1) - Returns true if string is equal to s1; case insensitive
  * compareTo(s1) - Returns an integer greater than 0, equal to 0, or less than 0 to indicate whether this string is greater than, equal to, or less than s1.
  * compareToIgnoreCase(s1) - Same as comapreTo except it's case insensitive
  * startsWith(prefix) - Returns treu is this sring starts with specified prefix
  * endsWith(suffix) - Returs true if this string ends with specified suffix
  * contains(s1) - Returns true if s1 is a substring in this string
* To add on to a string, use substrings:
```java
String message = "Welcome to Java";
String message = message.substring(0, 11) + "HTML";
// Will print out: "Welcome to HTML"
```
* Remember that string are just arrays of characters, and can be treated as such:
```java
String s = "Kim Jones";
int k = s.indexOf(' ');  // The blank space char in the string
String firstName = s.substring(0, k);  // substring(beginIndex, endIndex)
String lastName = s.substring(k + 1);  // k + 1 is 'J' in s
```
### Formatted output
* To use fomratted out print, print wiht:
```java
System.out.printf();
```
* This allows for C style printing using delimeters, such as:
```java
int a = 4;
System.out.printf("A = %d", a);
```

### Misc
* You do not have to import Math functions, they are in stdio of language
* Useful escape sequences:
  * \b - Backspace
  * \t - Tab
  * \n - New Line
  * \r - Carriage Return
  * \\\\ - Backslash
  * \\" - Double Quote


