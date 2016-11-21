package fizzBuzz;

import java.util.regex.Pattern;
import java.util.ArrayList;

public class StringCalculator {
	
	public Integer Add(String numbers) throws NegativeNumberException {
		Integer numberSum  = 0;
		Integer endDelimiterIndex;
		String customDelimiter;
		String[] myNumbers;
		ArrayList<Integer> foundNegatives = new ArrayList<Integer>();
		
		if(numbers.length() > 0) {
			if(Pattern.matches("^//.\\n.*", numbers)) {
				endDelimiterIndex = numbers.indexOf("\n");
				customDelimiter = numbers.substring(2,endDelimiterIndex);
				myNumbers = numbers.substring(endDelimiterIndex+1).split(Pattern.quote(customDelimiter));
			}
			else if(Pattern.matches("^//\\[.+\\]\\n.*", numbers)) {
				endDelimiterIndex = numbers.indexOf("]\n");
				customDelimiter = numbers.substring(3,endDelimiterIndex);
				myNumbers = numbers.substring(endDelimiterIndex+2).split(Pattern.quote(customDelimiter));
			}
			else {
				myNumbers = numbers.split(",|\n");
			}
			for(Integer i = 0; i < myNumbers.length; i++) {
				Integer currentNumber = Integer.valueOf(myNumbers[i]);
				if(currentNumber < 0) {
					foundNegatives.add(currentNumber);
				}
				else if(currentNumber <= 1000) {
					numberSum += Integer.valueOf(myNumbers[i]);
				}
			}
			if(foundNegatives.size() > 0) {
				throw new NegativeNumberException("negatives not allowed " + foundNegatives.toString());
			}
		}
		
		return numberSum;
	}

	public class NegativeNumberException extends Exception {
		
		private static final long serialVersionUID = 1L;
		
		public NegativeNumberException() {}
		
		public NegativeNumberException(String message) {
			super(message);
		}
	}
}
