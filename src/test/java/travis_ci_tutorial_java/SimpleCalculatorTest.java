package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}

	@Test
	public void testSubtract() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.subtract(5, 3), 2);
		assertEquals(calc.subtract(10, 5), 5);
		assertEquals(calc.subtract(100, 100), 0);
		assertEquals(calc.subtract(100, 200), -100);
	}

	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(2, 4), 8);
		assertEquals(calc.multiply(-10, 10), -100);
		assertEquals(calc.multiply(-5, -5), 25);
		assertEquals(calc.multiply(0, 10), 0);
	}

	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(8, 2), 4);
		assertEquals(calc.divide(100, 100), 1);
		assertEquals(calc.divide(-100, 10), -10);
	}
}
