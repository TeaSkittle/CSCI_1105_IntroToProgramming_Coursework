// JUnit exercise, use with Eclipse

package Ex6_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex42_3 {

	@Test
	void testReverse() {
		assertEquals(Ex6_3.reverse( 123 ), 321 );
		assertEquals(Ex6_3.reverse( 12321 ), 12321 );
		assertEquals(Ex6_3.reverse( 1 ), 1 );
	}
	
	@Test
	void testIsPalindrome() {
		assertTrue(Ex6_3.isPalindrome( 323 ));
		assertFalse(Ex6_3.isPalindrome( 1234 ));
	}

}
