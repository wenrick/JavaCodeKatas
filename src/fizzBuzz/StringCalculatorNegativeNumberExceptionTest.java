package fizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

import fizzBuzz.StringCalculator.NegativeNumberException;

public class StringCalculatorNegativeNumberExceptionTest {

	StringCalculator stringCalculator = new StringCalculator();
	
	@Test(expected=NegativeNumberException.class)
	public void testAddWithNegativeNumbers() throws NegativeNumberException {
		stringCalculator.Add("1,2,-1,-5");
	}

}
