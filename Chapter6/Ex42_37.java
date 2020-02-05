/*
Author: Travis Dowd
Date: 2-5-2020
*/

package Ex6_37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex42_37 {

	@Test
	void testFormat() {
		assertEquals(Ex6_37.format( 25, 4), "0025" );
		assertEquals(Ex6_37.format( 6, 7), "0000006" );
	}
	
	@Test
	void testZeroLoop() {
		assertEquals(Ex6_37.zeroLoop ( 4 ), "0000");
		assertEquals(Ex6_37.zeroLoop ( 1 ), "0");
	}

}
