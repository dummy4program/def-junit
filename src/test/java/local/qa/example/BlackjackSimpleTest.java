package local.qa.example;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

//import org.junit.Ignore;
import org.junit.Test;

//Write a test suite for this code, covering as many different outcomes as you can.
//Feel free to improve the blackjack code as well, but remember to test any improvements you've made!

public class BlackjackSimpleTest {
	
	@Test
	public void bjTest1() {
		assertEquals("Expected output is 0", 0, BlackjackSimple.play(22, 22));
	}
	
	@Test
	public void bjTest2() {
		assertEquals("Expected output is 21", 21, BlackjackSimple.play(22, 21));
	}
	
	@Test
	public void bjTest3() {
		assertEquals("Expected output is 21", 21, BlackjackSimple.play(21, 22));
	}
	
	@Test
	public void bjTest4() {
		assertEquals("Expected output is 21", 21, BlackjackSimple.play(21, 18));
	}
	
	@Test
	public void bjTest5() {
		assertTrue("Expected output is True", BlackjackSimple.play(22, 22) == 0);
	}
	
	@Test
	public void bjTest6() {
		assertTrue("Expected output is True", BlackjackSimple.play(18, 18) == 18);
	}
	
//	@Ignore
//	@Test
//	public void bjTest7() {
//		assertNull("Expected output is Null", BlackjackSimple.play(0, 0)); //doesn't work as a test so ignore but once ignored still counts in coverage outcome as a failed test
//	}
}
