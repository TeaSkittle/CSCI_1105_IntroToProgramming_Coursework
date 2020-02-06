/*
 * Author: Travis Dowd
 * Date: 2-6-20202
 * 
 * Exercise 42-31
 * Got the test credit card numbers from: https://www.paypalobjects.com/en_GB/vhelp/paypalmanager_help/credit_card_numbers.htm
 */
package Ex6_31;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ex6_31_Test {
	@Test
	void testIsValid() {
		assertFalse(Ex6_31.isValid( 12345L ));                                           // Card length < 13 
		assertFalse(Ex6_31.isValid(34568291002377344L ));                                // Card length > 16
		assertTrue( Ex6_31.isValid( 4388576018410707L ));                                // card length > 12 && card length < 17 && ( sumOfDoubleEvenPlace + sumOfOddPlace ) % 10 == 0
		assertFalse(Ex6_31.isValid( 4388576018402626L ));                                // ( sumOfDoubleEvenPlace + sumOfOddPlace ) % 10 != 0
		assertTrue(Ex6_31.isValid(  4111111111111111L ));                                // prefix == 4
		assertTrue(Ex6_31.isValid(  5610591081018250L ));                                // prefix == 5 
		assertTrue(Ex6_31.isValid(  6331101999990016L ));                                // prefix == 6
		assertTrue(Ex6_31.isValid(  378282246310005L  ));                                // prefix == 37
	}	@Test
	void testPrefixMatched() {
		assertTrue(Ex6_31.prefixMatched( 4388576018410707L, 4 ));                        // prefix == 4
		assertTrue(Ex6_31.prefixMatched( 5610591081018250L, 5 ));                        // prefix == 5 
		assertTrue(Ex6_31.prefixMatched( 6331101999990016L, 6 ));                        // prefix == 6
		assertTrue(Ex6_31.prefixMatched( 378282246310005L, 37 ));                        // prefix == 37
		assertFalse(Ex6_31.prefixMatched( 768282246310005L, 4 ));                        // prefix != 4
		assertFalse(Ex6_31.prefixMatched( 897282246310005L, 5 ));                        // prefix != 5
		assertFalse(Ex6_31.prefixMatched( 234282246310005L, 6 ));                        // prefix != 6
		assertFalse(Ex6_31.prefixMatched( 328282246310005L,37 ));                        // prefix != 37
	}	 @Test
	void testGetDigit() {
		assertEquals(Ex6_31.getDigit( 0 ),  0 );                                         // 0 + 0 = 0
		assertEquals(Ex6_31.getDigit( 3 ),  3 );                                         // 3 + 0 = 3
		assertEquals(Ex6_31.getDigit( 14 ), 5 );                                         // 1 + 4 = 5
		assertEquals(Ex6_31.getDigit( 99 ), 18);                                         // 9 + 9 = 18
	}	@Test
	void testGetPrefix() {
		assertEquals(Ex6_31.getPrefix( 4388576018410707L , 50 ), 4388576018410707L );    // k > number
		assertEquals(Ex6_31.getPrefix( 4388576018410707L , 1 ), 4 );                     // k < number
		assertEquals(Ex6_31.getPrefix( 4388576018410707L , 16 ), 4388576018410707L );    // k == number
	}	@Test
	void testGetSize() {
		assertEquals(Ex6_31.getSize( 4388576018410707L    ), 16 );                       // d == 16 digits ( d > 0 && d < 20 )
		assertEquals(Ex6_31.getSize( 3782822463100051266L ), 19 );                       // d == 19 digits ( d <= 19 )
		assertEquals(Ex6_31.getSize( 1L ), 1 );                                          // d == 1 digit   ( d != 0 )
	} @Test
	void testSumOfDoubleEvenPlace() {
		assertEquals(Ex6_31.sumOfDoubleEvenPlace( 4388576018410707L ), 29 );             // + 0 0 8 2 3 1 7 8 = 29
		assertEquals(Ex6_31.sumOfDoubleEvenPlace( 4388576018402626L ), 37 );             // + 4 4 8 2 3 1 7 8 = 37
		assertEquals(Ex6_31.sumOfDoubleEvenPlace( 378282246310005L  ), 27 );             // + 0 0 6 8 4 4 5   = 27
	}	@Test
	void testSumOfOddPlace() {
		assertEquals(Ex6_31.sumOfOddPlace( 4388576018410707L ), 41 );                    // + 7 7 1 8 0 7 8 3 = 41
		assertEquals(Ex6_31.sumOfOddPlace( 4388576018402626L ), 38 );                    // + 6 6 0 8 0 7 8 3 = 38
		assertEquals(Ex6_31.sumOfOddPlace( 378282246310005L  ), 33 );                    // + 5 0 1 6 2 8 8 3 = 33
	}
}
