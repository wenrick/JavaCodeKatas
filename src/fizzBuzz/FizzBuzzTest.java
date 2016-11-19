package fizzBuzz;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FizzBuzzTest {
	private Integer inputNumber;
	private String expectedResult;
	private FizzBuzz fizzBuzzApp;
	
	@Before
	public void initialize() {
		fizzBuzzApp = new FizzBuzz();
	}

	public FizzBuzzTest(Integer inputNumber, String expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection testNumbers() {
		return Arrays.asList(new Object[][] {
				{ 1, "1" },
				{ 2, "2" },
				{ 4, "4" },
				{ 3, "fizz" },
				{ 9, "fizz" },
				{ 123, "fizz" },
				{ 5, "buzz" },
				{ 20, "buzz" },
				{ 200, "buzz" },
				{ 15, "fizz buzz" },
				{ 45, "fizz buzz" },
				{ 315, "fizz buzz" }
		});
	}
	
	@Test
	public void testScore() {
		assertEquals(expectedResult,fizzBuzzApp.score(inputNumber));
	}

}