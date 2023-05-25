import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 22010560, 25 May 2023 9:54:07 am

 */

/**
 * @author 22010560
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		 Calculator cal = new Calculator();
		 int actual = cal.add(a, b);
		 
		 int expected = 9999;
		 assertEquals (expected,actual);
	}
	
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a = 9876;
		int b = 4321;
		
		 Calculator cal = new Calculator();
		 int actual = cal.subtract(a, b);
		 
		 int expected = 5555;
		 assertEquals (actual, expected);
	}
	
	@Test
	public void testMultiple() {
		//fail("Not yet implemented");
		int a = 5;
		int b = 10;
		
		 Calculator cal = new Calculator();
		 int actual = cal.multiple(a, b);
		 
		 int expected = 50;
		 assertEquals (actual, expected);
	}
	
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		int a = 10;
		int b = 5;
		
		 Calculator cal = new Calculator();
		 int actual = cal.divide(a, b);
		 
		 int expected = 2;
		 assertEquals (actual, expected);
	}
}
	
