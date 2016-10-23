import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateTest {

	Calculate calculation = new Calculate();
	char sum = calculation.sum(80);
	char testSum = 'C';

	@Test
	public void testSum() {
		System.out.println("@Test sum(): " + sum + " = " + testSum);
		assertEquals(sum, testSum);
	}

}