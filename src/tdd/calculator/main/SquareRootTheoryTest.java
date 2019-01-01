package tdd.calculator.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class SquareRootTheoryTest {
	@DataPoint public static double FOUR = 4.0;
	@DataPoint public static double ZERO = 3.0;
	
	@Theory
	public void defineOfSquareRoot(double n) {
		assertEquals(n, sqrRoot(n) * sqrRoot(n), 0.01);
		assertTrue(sqrRoot(n) >= 0);
	}

	private int sqrRoot(double n) {
		return 0;
	}
}
