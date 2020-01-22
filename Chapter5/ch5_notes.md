# CSCI 1105 CH5 Notes

### Loops
* Loops have C like structure
* __While__
```java
while (loop-continuation-condition) {
  // Loop body
  Statement(s);
}
```
* __Do while__
```java
do {
  // Loop body;
  Statement(s);
} while (loop-continuation-condition);
```
* __For__
```java
for (i = initialValue; i < endValue; i++)
  // Loop body
  ... 
}
```
* All three loops are expressively equivalent, you can write the same loop in each style (except in very rare circumstances)
* The keyword _break_ immediatley terminates the loop
* The keyword _continue_ to end the current iteration and go the the end of the loop
