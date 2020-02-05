package Ex6_31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex6_31_Test {
	@Test
	void testIsValid() {
		assertTrue(Ex6_31.isValid( 4388576018410707L ));    // Normal card length ( Between 13 and 16 digits )
		assertFalse(Ex6_31.isValid( 4789313678654356L ));   // Card is not valid
		assertFalse(Ex6_31.isValid( 34568291002377344L ));  // Card length too long ( > 16 )
		assertFalse(Ex6_31.isValid( 12345L ));              // Card length too short ( < 13 )
	}
	@Test
	void testPrefixMatched() {
		assertTrue(Ex6_31.prefixMatched( 4388576018410707L, 4 ));   // Check if number is in prefix
		assertFalse(Ex6_31.prefixMatched( 4388576018410707L, 1 ));  // Check is number is not is prefix
	}	
	@Test
	void testGetDigit() {
		assertEquals(Ex6_31.getDigit( 14 ), 5 );                    // ( 4388576018410707 % 10 ) * 2 = 14
	}
	@Test
	void testGetPrefix() {
		assertEquals(Ex6_31.getPrefix( 4388576018410707L , 4 ), 4388 );
		assertEquals(Ex6_31.getPrefix( 4388576018410707L , 1 ), 4 );
		assertEquals(Ex6_31.getPrefix( 4388576018410707L , 6 ), 438857 );
	}
	@Test
	void testGetSize() {
		assertEquals(Ex6_31.getSize( 4388576018410707L ), 16);
	}
	@Test
	void testSumOfDoubleEvenPlace() {
		assertEquals(Ex6_31.sumOfDoubleEvenPlace( 4388576018410707L ), 29);  // Ran in Code Runner to get 29
	}	
	@Test
	void testSumOfOddPlace() {
		assertEquals(Ex6_31.sumOfOddPlace( 4388576018410707L ), 41 );   // Ran in Code Runner to get 41
	}
}
