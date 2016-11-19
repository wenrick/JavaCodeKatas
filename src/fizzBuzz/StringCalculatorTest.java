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
public class StringCalculatorTest {
	private String inputString;
	private Integer expectedResult;
	private StringCalculator stringCalculator;
	
	@Before
	public void initialize() {
		stringCalculator = new StringCalculator();
	}

	public StringCalculatorTest(String inputString, Integer expectedResult) {
		this.inputString = inputString;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection testStrings() {
		return Arrays.asList(new Object[][] {
				{ "", 0 },
				{ "1", 1 },
				{ "1,2", 3 },
				{ "1\n2,3", 6 },
				{ "//;\n1;2", 3 }
		});
	}
	
	@Test
	public void testAdd() {
		assertEquals(expectedResult,stringCalculator.Add(inputString));
	}

}
