package local.qa.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//Write a class that tests each of these methods, using the following concepts:
//@BeforeClass
//@Test
//assertEquals
//assertTrue

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TemperatureConverterTest {

	TemperatureConverter tc;

	@BeforeClass
	public static void beforeTest() {
		System.out.println("Before testing");
	}

	@Before
	public void init() {
		tc = new TemperatureConverter();
		System.out.println("Class instantiated");
	}

	@Test
	public void KtoCTest() {
		assertEquals("Expected output is 20", 20, tc.convertKelvinToCelsius(293), 0);	
	}
	
	@Test
	public void KtoCTest2() {
		assertTrue("Expected output is true", tc.convertKelvinToCelsius(293) == 20);
	}
	
	
	@After
	public void overIt() {
		System.out.println("Test completed");
	}
	
	
	@AfterClass
	public static void afterTest() {
		System.out.println("After testing");
	}
}
