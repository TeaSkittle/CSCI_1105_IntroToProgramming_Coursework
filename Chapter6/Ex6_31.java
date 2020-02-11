package ex6_31;
import java.util.Scanner;
/**
 * <p> This class checks the validity of credit card numbers using the Luhn check (also known as: Mod 10 check). </p>
 * <p> Created: 2/10/2020 </p>
 * @author Travis Dowd
 *
 */
public class Ex6_31 {
	/**
	 * Main method, get credit card number from user and call isValid method.
	 * @param args Command line arguments, not used in this class
	 */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a credit card number as a long integer: ");
    long number = input.nextLong();
    if (isValid(number))
      System.out.println(number + " is valid");
    else
      System.out.println(number + " is invalid"); 
  }
  /**
   * <p>Checks the validity of the credit card number by calling these methods:</p>
   * <ul>
   * <li>getSize( number )</li>
   * <li>prefixMatched( number )</li>
   * <li>sumOfDoubleEvenPlace( number )</li>
   * <li>sumOfOddPlace( number )</li>
   * </ul>
   * @param number (long; Credit card number)
   * @return true if the card number is valid
   */
  public static boolean isValid(long number) {
    return  (getSize(number) >= 13) && (getSize(number) <= 16) && 
        (prefixMatched(number, 4) || prefixMatched(number, 5) ||
        prefixMatched(number, 6) || prefixMatched(number, 37)) && 
       (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;
  }
  /**
   * <p>1. Double every second digit from right to left. If doubling of a digit results in a two-digit number, add up the two digits to get a single-digit number.
   * <br>2. Now add all single-digit numbers from Step 1
   * Example: <br>
   * 4388576018410707<br>
   * <i><b>0 + 0 + 8 + 2 + 3 + 1 + 7 + 8 = 29</b></i><br>
   * @param number (long; Credit card number)
   * @return The sum of every other digit from right to left
   */
  public static int sumOfDoubleEvenPlace(long number) {
    int result = 0;
    
    number = number / 10; // Starting from the second digit from right
    while (number != 0) {
      result += getDigit((int)((number % 10) * 2));
      number = number / 100; // Move to the next even place
    }
    
    return result;
  }
  
  /**
   * If number is a single digit return the number, else add the two digits together and return the sum.
   * @param number (int; number to be added with its own digits)
   * @return Return number if it is a single digit, otherwise, return the sum of the two digits.
   */
  public static int getDigit(int number) {
    return number % 10 + (number / 10);
  }
  /**
   * <p>Add together each off the odd digits from right to left, example:<br>
   * 4388576018410707<br>
   * <i><b>7 + 7 + 1 + 8 + 0 + 7 + 8 + 3 = 41</b></i></p>
   * @param number (long; Credit card number)
   * @return The sum of odd place digits in number
   */
  public static int sumOfOddPlace(long number) {
    int result = 0;
   
    while (number != 0) {
      result += (int)(number % 10);
      number = number / 100; // Move two positions to the left
    }
    
    return result;
  }
  /**
   * This checks to see if d is a prefix in the credit card number
   * @param number (long; Credit card number)
   * @param d (int; Number to be checked for in prefix)
   * @return true if the number d is a prefix for number
   */
  public static boolean prefixMatched(long number, int d) {
    return getPrefix(number, getSize(d)) == d;
  }
  /**
   * Find the number of digits in a credit card number
   * @param d (long; Credit card number)
   * @return the number of digits in d
   */
  public static int getSize(long d) {
    int numberOfDigits = 0;
    
    while (d != 0) {
      numberOfDigits++;
      d = d / 10;
    }
    
    return numberOfDigits;
  }
  /**
   * Get the prefix of the credit card number.
   * @param number (long; Credit card number)
   * @param k (int; Size of prefix to be checked)
   * @return the first k number of digits from number. If the number of digits in number is less than k, return number.
   */
  public static long getPrefix(long number, int k) {
    long result = number;
    
    for (int i = 0; i < getSize(number) - k; i++)
      result /= 10;
    
    return result;
  }
}
